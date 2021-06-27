
package Utilidades;

import javax.swing.JLabel;

public class Ficha {
    private int CasillaActual;
    private JLabel ImagenFicha;

    public Ficha(int CasillaActual, JLabel ImagenFicha) {
        this.CasillaActual = CasillaActual;
        this.ImagenFicha = ImagenFicha;
    }

    public int getCasillaActual() {
        return CasillaActual;
    }

    public void setCasillaActual(int CasillaActual) {
        this.CasillaActual = CasillaActual;
    }

    public JLabel getImagenFicha() {
        return ImagenFicha;
    }

    public void setImagenFicha(JLabel ImagenFicha) {
        this.ImagenFicha = ImagenFicha;
    }
    
}
