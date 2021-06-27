
package Utilidades;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaEscalera extends Casillas{
    private int CasillaAAvanzar;
    public CasillaEscalera(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, int CasillaAAvanzar) {
        super(NoCasilla, Casilla, ImagenDeCasilla);
        this.CasillaAAvanzar = CasillaAAvanzar;
    }

    public int getCasillaAAvanzar() {
        return CasillaAAvanzar;
    }

    public void setCasillaAAvanzar(int CasillaAAvanzar) {
        this.CasillaAAvanzar = CasillaAAvanzar;
    }
    
}
