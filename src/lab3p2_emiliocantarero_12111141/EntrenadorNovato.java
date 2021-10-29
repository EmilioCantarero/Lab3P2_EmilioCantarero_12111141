package lab3p2_emiliocantarero_12111141;



public class EntrenadorNovato extends Entrenador {
    private int pDescubiertos;
    private Pokemon p1;

    public EntrenadorNovato() {
        super();
    }

    public EntrenadorNovato(int pDescubiertos, Pokemon p1, String nombre, int edad, boolean sexo) {
        super(nombre, edad, sexo);
        this.pDescubiertos = pDescubiertos;
        this.p1 = p1;
    }

    public int getpDescubiertos() {
        return pDescubiertos;
    }

    public void setpDescubiertos(int pDescubiertos) {
        this.pDescubiertos = pDescubiertos;
    }

    public Pokemon getP1() {
        return p1;
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
    }

    @Override
    public String toString() {
        return super.toString() + "EntrenadorNovato{" + "pDescubiertos=" + pDescubiertos + ", p1=" + p1 + '}';
    }
    
    
}
