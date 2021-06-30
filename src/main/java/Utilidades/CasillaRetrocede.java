
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaRetrocede extends Casillas{
    private int CasillasAtras;
    public CasillaRetrocede(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, ArrayList<Ficha> FichasEnLaCasilla, int CasillasAtras) {
        super(NoCasilla, Casilla, ImagenDeCasilla, FichasEnLaCasilla);
        this.CasillasAtras = CasillasAtras;
    }

    public int getCasillasAtras() {
        return CasillasAtras;
    }

    public void setCasillasAtras(int CasillasAtras) {
        this.CasillasAtras = CasillasAtras;
    }
    
}
