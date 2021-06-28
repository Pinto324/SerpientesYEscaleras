
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaEscalera extends Casillas{
    private int CasillaAAvanzar;

    public CasillaEscalera(int CasillaAAvanzar, int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, ArrayList<Ficha> FichasEnLaCasilla) {
        super(NoCasilla, Casilla, ImagenDeCasilla, FichasEnLaCasilla);
        this.CasillaAAvanzar = CasillaAAvanzar;
    }
    

    public int getCasillaAAvanzar() {
        return CasillaAAvanzar;
    }

    public void setCasillaAAvanzar(int CasillaAAvanzar) {
        this.CasillaAAvanzar = CasillaAAvanzar;
    }
    @Override
    public int RetronarCasilla() {
        return CasillaAAvanzar;
    }
}
