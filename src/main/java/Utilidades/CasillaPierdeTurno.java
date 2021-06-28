
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaPierdeTurno extends Casillas{

    public CasillaPierdeTurno(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, ArrayList<Ficha> FichasEnLaCasilla) {
        super(NoCasilla, Casilla, ImagenDeCasilla, FichasEnLaCasilla);
    }
    
    
    @Override
    public int RetronarCasilla() {
        return -1;
    }
}
