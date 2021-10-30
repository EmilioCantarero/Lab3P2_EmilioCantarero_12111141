package lab3p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class Gimnasio {
    private String ciudad, nombre;
    private MaestroPokemon lider;
    private int victorias=0, derrotas=0, dinero;
    ArrayList<Entrenador> entrenadores=new ArrayList();
    public Gimnasio() {
    }

    public Gimnasio(String nombre, String ciudad, MaestroPokemon lider, int dinero) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.lider = lider;
        this.dinero = dinero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MaestroPokemon getLider() {
        return lider;
    }

    public void setLider(MaestroPokemon lider) {
        this.lider = lider;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        if (dinero>=10000 && dinero <=50000){
            this.dinero = dinero;
        }
    }

    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

        
    @Override
    public String toString() {
        return "Gimnasio{" + "ciudad=" + ciudad + ", nombre=" + nombre + ", lider=" + lider + ", victorias=" + victorias + ", derrotas=" + derrotas + ", dinero=" + dinero + '}';
    }
    
    public void agregarEntrenador(Entrenador e){
        entrenadores.add(e);
    }
    
    
}
