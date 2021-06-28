
package Utilidades;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Partida {
    private Casillas[][] Tablero;
    private ArrayList<Ficha> FichasDeJugadores;
    private int Filas;
    private int Columnas;
    public Partida(ArrayList<Ficha> FichasEnLaCasilla, int X, int Y) {
        this.FichasDeJugadores = FichasEnLaCasilla;
        this.Filas = Y;
        this.Columnas = X;
        Tablero = new Casillas[Y][X];
        LlenarTablero();
    }

    public Casillas[][] getTablero() {
        return Tablero;
    }

    public void setTablero(Casillas[][] Tablero) {
        this.Tablero = Tablero;
    }

    public ArrayList<Ficha> getFichasDeJugadores() {
        return FichasDeJugadores;
    }

    public void setFichasDeJugadores(ArrayList<Ficha> FichasDeJugadores) {
        this.FichasDeJugadores = FichasDeJugadores;
    }
    
    public void LlenarTablero(){
        int ContadorCasillas = 1;    
        JPanel M = new javax.swing.JPanel();
        JLabel L = new javax.swing.JLabel();
            for (int x = 0; x < Columnas ; x++) {
                for (int y = 0; y < Filas ; y++) {
                    if(ContadorCasillas%2==0){
                        ImageIcon CasillaAzul = new ImageIcon("Casillas/CasillaPar.jpg");
                        L.setIcon(CasillaAzul);
                    }else{
                        ImageIcon CasillaRosa = new ImageIcon("Casillas/CasillaImpar.jpg");
                        L.setIcon(CasillaRosa);
                    }
                    //Asigna los jugadores a la primera casilla:
                    if(ContadorCasillas == 1){
                        Tablero[y][x] = new Casillas(ContadorCasillas,M,L,FichasDeJugadores);
                    }else{
                        Tablero[y][x] = new Casillas(ContadorCasillas,M,L,null);
                    }
                    ContadorCasillas++;    
                }
            }
    }
}
