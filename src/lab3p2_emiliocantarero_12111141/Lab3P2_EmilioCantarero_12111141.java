package lab3p2_emiliocantarero_12111141;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab3P2_EmilioCantarero_12111141 {
    static ArrayList<Gimnasio> gimnasios=new ArrayList();
    public static void main(String[] args) {
        
        int opcion=0;
        while (opcion!=6){
            opcion=menu();
            if (opcion==1){
                crearGimnasio();
            }else if(opcion==2){
                asignarEntrenadores();
            }else if(opcion==3){
                modificarGimnasio();
            }else if(opcion==4){
                eliminarGim();
            }else if(opcion==5){
                listar();
            }
        }
    }
    
    public static int menu(){
        int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog
            ("1- Crear Gimnasio\n"+
            "2- Agregar entrenador\n"+
            "3- Modificar Gimnasio\n"+
            "4- Eliminar Gimnasio\n"+
            "5- Listar Gimnasios\n"+
            "6- Salir"));
        return opcion;
    }
    public static Gimnasio crearGimnasio(){
        String n, c;
        int d;

        n=JOptionPane.showInputDialog("Nombre");
        c=JOptionPane.showInputDialog("Ciudad");
        d=Integer.parseInt(JOptionPane.showInputDialog("Dinero(Valor entre 10, 000 y 100, 000)"));
        Gimnasio g=new Gimnasio(c, n, crearLider(), d);
        gimnasios.add(g);
        
        JOptionPane.showMessageDialog(null, "Gimnasio agregado correctamente");
        return g;
    }
    public static MaestroPokemon crearLider(){
        String n;
        int e, numeroVictorias;
        String s;
        JOptionPane.showMessageDialog(null, "Asignacion del lider de Gimnasio");
        n=JOptionPane.showInputDialog("Nombre");
        e=Integer.parseInt(JOptionPane.showInputDialog("edad"));
        s=JOptionPane.showInputDialog("M/F");
        numeroVictorias=Integer.parseInt(JOptionPane.showInputDialog("Numero de victorias"));
        MaestroPokemon lider=new MaestroPokemon (numeroVictorias, crearPokemon(), n, e, s);
        return lider;
    }
    public static Pokemon crearPokemon(){
        String n;
        double a, v;
        JOptionPane.showMessageDialog(null, "Asignacion de pokemon");
        n=JOptionPane.showInputDialog("Nombre");
        a=Double.parseDouble(JOptionPane.showInputDialog("Ataque (valor entre 100 y 200)"));
        v=Double.parseDouble(JOptionPane.showInputDialog("Vida (valor entre 200 y 500)"));
        
        int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog
            ("Tipo de su Pokemon\n"+
            "1- Agua\n"+
            "2- Fuego\n"+
            "3- Planta\n"));
        
            if (opcion==1){
                Pokemon p1=new pAgua(n, a, v);
                return p1;
            }
            if(opcion==2){
                Pokemon p1=new pFuego(n, a, v);
                return p1;
            }else{
                Pokemon p1=new pPlanta(n, a, v);
                return p1;
            }
    }
    public static Entrenador crearEntrenador(int opc){
        JOptionPane.showMessageDialog(null, "Asignación de entrenadores pokemon");
        String n, s;
        int e;
        
        n=JOptionPane.showInputDialog("Nombre");
        e=Integer.parseInt(JOptionPane.showInputDialog("edad"));
        s=JOptionPane.showInputDialog("M/F");
        
        int opcion;
            opcion=Integer.parseInt(JOptionPane.showInputDialog
            ("Tipo de su Entrenador(Tenga en cuenta que solo puede asignar 2 coordinadores "
                    + "pokemon y un entrendor legendario por Gimnasio)\n"+
            "1- Entrenador novato\n"+
            "2- Coordinador Pokemon\n"+
            "3- Maestro Pokemon\n"+
            "4- Entrenador Legendario"));
        if (opcion==1){
            int pd=Integer.parseInt(JOptionPane.showInputDialog("Pokemones descubiertos"));
            
                Entrenador e1=new EntrenadorNovato(pd, crearPokemon(),n, e, s );
                return e1;
            }
        if(opcion==2){
            int contC=0;
            for (int i=0; i<gimnasios.get(opc).getEntrenadores().size();i++ ){
                if (gimnasios.get(opc).getEntrenadores().get(i) instanceof CoordinadorPokemon  ){
                    contC++;
                }
            }
            if (contC<2){
                CoordinadorPokemon e1=new CoordinadorPokemon(n, e, s);
                int np=Integer.parseInt(JOptionPane.showInputDialog("Cuantos pokemon desea asignarle a este coordinador pokemon?"));
                for (int i=0; i<np; i++ ){
                    e1.agregarPokemon(crearPokemon());
                    
                }
                return e1;
            }else{
                JOptionPane.showMessageDialog(null, "Ya alcanzo el limite para este tipo de entrenador");
            }


        }else if(opcion==3){
            int nV=Integer.parseInt(JOptionPane.showInputDialog("Numero de victorias"));
                MaestroPokemon e1=new MaestroPokemon(nV, crearPokemon(), n, e, s);
            return e1;
        }else if(opcion==4){
            int contL=0;
            for (int i=0; i<gimnasios.get(opc).getEntrenadores().size();i++ ){
                if (gimnasios.get(opc).getEntrenadores().get(i) instanceof EntrenadorLegendario  ){
                    contL++;
                }
            }
            if (contL<1){
                EntrenadorLegendario e1=new EntrenadorLegendario(crearLegendario(), n, e, s);
                return e1;
            }else{
                JOptionPane.showMessageDialog(null, "Ya alcanzo el limite para este tipo de entrenador");
                
            }
        }else{
            JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
        return null;
    }
    public static pLegendario crearLegendario(){
        String n;
        double a, v;
        n=JOptionPane.showInputDialog("Nombre");
        a=Double.parseDouble(JOptionPane.showInputDialog("Ataque (valor entre 100 y 200)"));
        v=Double.parseDouble(JOptionPane.showInputDialog("Vida (valor entre 200 y 500)"));
        
        pLegendario p1=new pLegendario(n, a, v);
        return p1;
    }
    public static void asignarEntrenadores(){
        
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Posicion del gimnasio al que desea añadir un entrenador"));
        if (gimnasios.get(opc).getEntrenadores().size()<6){
            gimnasios.get(opc).agregarEntrenador(crearEntrenador(opc));
            JOptionPane.showMessageDialog(null,"Entrenador agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"Ya alcanzó el limite de entrenadores para este gimnasio");
        }
    }
    
    public static void modificarGimnasio(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Posicion del gimnasio que desea modificar"));
        gimnasios.set(opc, crearGimnasio());
        JOptionPane.showMessageDialog(null,"Ha modificado completamente este gimnasio");
    }
    
    public static void eliminarGim(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Posicion del gimnasio que desea Eliminar"));
        gimnasios.remove(opc);
        JOptionPane.showMessageDialog(null,"Ha eliminado este gimnasio");
    }
    public static void listar(){
        for (int i=0; i<gimnasios.size(); i++){
            JOptionPane.showMessageDialog(null,gimnasios.get(i));
        }
    }
    
    public static void batallaPokemon(){
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Posicion del primer gimnasio que luchará"));
        int opc2=Integer.parseInt(JOptionPane.showInputDialog("Posicion del segundo gimnasio que luchará"));
    }
}
