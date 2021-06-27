
package Utilidades;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaSerpiente extends Casillas{
    private int CasillaDeregreso;
    public CasillaSerpiente(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, int CasillaDeregreso) {
        super(NoCasilla, Casilla, ImagenDeCasilla);
        this.CasillaDeregreso = CasillaDeregreso;
    }

    public int getCasillaDeregreso() {
        return CasillaDeregreso;
    }

    public void setCasillaDeregreso(int CasillaDeregreso) {
        this.CasillaDeregreso = CasillaDeregreso;
    }
    
}
