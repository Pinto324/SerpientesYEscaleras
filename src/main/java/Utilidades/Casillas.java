
package Utilidades;

import Movimientos.Movimiento;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Casillas implements Movimiento{
    private int NoCasilla;
    private JPanel Casilla;
    private JLabel ImagenDeCasilla;

    public Casillas(int NoCasilla, JPanel Casilla, JLabel ImagenDeCasilla) {
        this.NoCasilla = NoCasilla;
        this.Casilla = Casilla;
        this.ImagenDeCasilla = ImagenDeCasilla;
    }

    public int getNoCasilla() {
        return NoCasilla;
    }

    public void setNoCasilla(int NoCasilla) {
        this.NoCasilla = NoCasilla;
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

    @Override
    public void Avanzar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Retroceder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
