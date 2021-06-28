
package Utilidades;

import javax.swing.JLabel;

public class Ficha {
    private int CasillaActual;
    private JLabel ImagenFicha;
    private String NombreDeJugador;
    private int IdDeJugador;

    public Ficha(int CasillaActual, JLabel ImagenFicha, String NombreDeJugador, int IdDeJugador) {
        this.CasillaActual = CasillaActual;
        this.ImagenFicha = ImagenFicha;
        this.NombreDeJugador = NombreDeJugador;
        this.IdDeJugador = IdDeJugador;
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

    public String getNombreDeJugador() {
        return NombreDeJugador;
    }

    public void setNombreDeJugador(String NombreDeJugador) {
        this.NombreDeJugador = NombreDeJugador;
    }

    public int getIdDeJugador() {
        return IdDeJugador;
    }

    public void setIdDeJugador(int IdDeJugador) {
        this.IdDeJugador = IdDeJugador;
    }
    
}
