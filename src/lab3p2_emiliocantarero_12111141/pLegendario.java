package lab3p2_emiliocantarero_12111141;


public class pLegendario extends Pokemon{

    public pLegendario() {
        super();
    }

    public pLegendario(String nombre, double ataque, double vida) {
        super(nombre, ataque, vida);
    }

    @Override
    public String toString() {
        return super.toString()
                + "pLegendario{" + '}';
    }
    
}
