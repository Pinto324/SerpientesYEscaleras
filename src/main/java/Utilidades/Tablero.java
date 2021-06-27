
package Utilidades;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero {
    private JPanel Casilla;
    private JLabel ImagenDeCasilla ;
    private boolean EsEscalera;
    private boolean EsSerpiente;
    private int NoCasilla;
    ArrayList<Ficha> FichasEnLaCasilla;

    public Tablero(JPanel Casilla, JLabel ImagenDeCasilla, boolean EsEscalera, boolean EsSerpiente, int NoCasilla, ArrayList<Ficha> FichasEnLaCasilla) {
        this.Casilla = Casilla;
        this.ImagenDeCasilla = ImagenDeCasilla;
        this.EsEscalera = EsEscalera;
        this.EsSerpiente = EsSerpiente;
        this.NoCasilla = NoCasilla;
        this.FichasEnLaCasilla = FichasEnLaCasilla;
    }

    public JPanel getCasilla() {
        return Casilla;
    }

    public void setCasilla(JPanel Casilla) {
        this.Casilla = Casilla;
    }

    public JLabel getImagenDeCasilla() {
        return ImagenDeCasilla;
    }

    public void setImagenDeCasilla(JLabel ImagenDeCasilla) {
        this.ImagenDeCasilla = ImagenDeCasilla;
    }

    public boolean isEsEscalera() {
        return EsEscalera;
    }

    public void setEsEscalera(boolean EsEscalera) {
        this.EsEscalera = EsEscalera;
    }

    public boolean isEsSerpiente() {
        return EsSerpiente;
    }

    public void setEsSerpiente(boolean EsSerpiente) {
        this.EsSerpiente = EsSerpiente;
    }

    public int getNoCasilla() {
        return NoCasilla;
    }

    public void setNoCasilla(int NoCasilla) {
        this.NoCasilla = NoCasilla;
    }

    public ArrayList<Ficha> getFichasEnLaCasilla() {
        return FichasEnLaCasilla;
    }

    public void setFichasEnLaCasilla(ArrayList<Ficha> FichasEnLaCasilla) {
        this.FichasEnLaCasilla = FichasEnLaCasilla;
    }

    
    
}
