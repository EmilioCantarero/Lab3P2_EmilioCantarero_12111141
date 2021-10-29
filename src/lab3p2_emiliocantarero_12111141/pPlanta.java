package lab3p2_emiliocantarero_12111141;


public class pPlanta extends Pokemon{

    public pPlanta() {
        super();
    }

    public pPlanta(String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
    }

    @Override
    public String toString() {
        return super.toString() + "pPlanta{" + '}';
    }
    
}
