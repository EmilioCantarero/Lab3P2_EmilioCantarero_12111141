package lab3p2_emiliocantarero_12111141;

import java.util.ArrayList;


public class CoordinadorPokemon extends Entrenador{
    ArrayList<Pokemon> lista=new ArrayList();

    public CoordinadorPokemon() {
        super();
    }

    public CoordinadorPokemon(String nombre, int edad, boolean sexo) {
        super(nombre, edad, sexo);
    }

    public ArrayList<Pokemon> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Pokemon> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return super.toString() + "CoordinadorPokemon{" + "lista=" + lista + '}';
    }
    
    
    
}
