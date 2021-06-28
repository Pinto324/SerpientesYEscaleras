
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CasillaSerpiente extends Casillas{
    private int CasillaDeregreso;

    public CasillaSerpiente(int CasillaDeregreso, int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla, ArrayList<Ficha> FichasEnLaCasilla) {
        super(NoCasilla, Casilla, ImagenDeCasilla, FichasEnLaCasilla);
        this.CasillaDeregreso = CasillaDeregreso;
    }
    

    public int getCasillaDeregreso() {
        return CasillaDeregreso;
    }

    public void setCasillaDeregreso(int CasillaDeregreso) {
        this.CasillaDeregreso = CasillaDeregreso;
    }

    @Override
    public int RetronarCasilla() {
        return CasillaDeregreso;
    }
    
}
