
package Utilidades;

import java.awt.Color;
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
            for (int x = Columnas -1; x > -1 ; x--) {
                for (int y = Filas -1; y > -1 ; y--) {
                    JPanel M = new javax.swing.JPanel();
                    JLabel L = new javax.swing.JLabel();  
                    if(y%2==0){
                        if(x%2==0){
                            /*
                            ImageIcon CasillaAzul = new ImageIcon("Casillas/CasillaPar.jpg");
                            L.setIcon(CasillaAzul);*/
                            M.setBackground(Color.cyan);
                        }else{
                            /*ImageIcon CasillaRosa = new ImageIcon("Casillas/CasillaImpar.jpg");
                            L.setIcon(CasillaRosa);*/
                            M.setBackground(Color.PINK);
                        }
                    }else{
                        if(x%2==0){  
                            /*
                            ImageIcon CasillaRosa = new ImageIcon("Casillas/CasillaImpar.jpg");
                            L.setIcon(CasillaRosa);*/
                            M.setBackground(Color.PINK);
                        }else{
                            /*ImageIcon CasillaAzul = new ImageIcon("Casillas/CasillaPar.jpg");
                            L.setIcon(CasillaAzul);*/
                            M.setBackground(Color.cyan);
                        }
                    
                    }
                    //Asigna los jugadores a la primera casilla:
                    M.add(L);
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
