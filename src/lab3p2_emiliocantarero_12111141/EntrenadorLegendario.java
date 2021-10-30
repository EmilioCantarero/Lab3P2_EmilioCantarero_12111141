package lab3p2_emiliocantarero_12111141;


public class EntrenadorLegendario extends Entrenador{

    private pLegendario p1;
    public EntrenadorLegendario() {
        super();
    }

    public EntrenadorLegendario(pLegendario p1, String nombre, int edad, String sexo) {
        super(nombre, edad, sexo);
        this.p1 = p1;
    }

    public pLegendario getP1() {
        return p1;
    }

    public void setP1(pLegendario p1) {
        this.p1 = p1;
    }

    
    
    
}
