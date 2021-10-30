package lab3p2_emiliocantarero_12111141;


public class MaestroPokemon extends Entrenador {
    private int numeroVictorias;
    private Pokemon p1;

    public MaestroPokemon() {
        super();
    }

    public MaestroPokemon(int numeroVictorias, Pokemon p1, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.numeroVictorias = numeroVictorias;
        this.p1 = p1;
    }

    public int getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(int numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }

    public Pokemon getP1() {
        return p1;
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return super.toString() + "MaestroPokemon{" + "numeroVictorias=" + numeroVictorias + ", p1=" + p1 + '}';
    }
    
    
    
}
