
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaAvanza extends Casillas{
    private int CasillasAdelante;
    public CasillaAvanza(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, ArrayList<Ficha> FichasEnLaCasilla, int CasillasAtras) {
        super(NoCasilla, Casilla, ImagenDeCasilla, FichasEnLaCasilla);
        this.CasillasAdelante = CasillasAtras;
    }

    public int getCasillasAtras() {
        return CasillasAdelante;
    }

    public void setCasillasAtras(int CasillasAtras) {
        this.CasillasAdelante = CasillasAtras;
    }
    
}
