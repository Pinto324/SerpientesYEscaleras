
package Utilidades;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Tablero {
    private JPanel Casilla = new JPanel();
    private boolean EsEscalera;
    private boolean EsSerpiente;
    ArrayList<Ficha> FichasEnLaCasilla = new ArrayList<>();

    public Tablero(boolean EsEscalera, boolean EsSerpiente) {
        this.EsEscalera = EsEscalera;
        this.EsSerpiente = EsSerpiente;
    }
    
}
