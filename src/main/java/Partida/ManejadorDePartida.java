
package Partida;

import Utilidades.Partida;
import java.awt.GridLayout;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManejadorDePartida {
    private static int Avance;
    public ManejadorDePartida() {
    }
    
    public void ManejarDado(JLabel P){
        int No;
        No = (int) Math.round((Math.random()*60));
        if(No <= 10){
            P.setIcon(new ImageIcon("Dados/1.png"));
            Avance = 1;
        }else if(No <= 20){
           P.setIcon(new ImageIcon("Dados/2.png"));
            Avance = 2;
        }else if(No <= 30){
            P.setIcon(new ImageIcon("Dados/3.png"));
            Avance = 3;
        }else if(No <= 40){
            P.setIcon(new ImageIcon("Dados/4.png"));
            Avance = 4;
        }else if(No <= 50){
            P.setIcon(new ImageIcon("Dados/5.png"));
            Avance = 5;
        }else if(No <= 60){
            P.setIcon(new ImageIcon("Dados/6.png"));
            Avance = 6;
        } 
    } 

    public int getAvance() {
        return Avance;
    }

    public void setAvance(int Avance) {
        ManejadorDePartida.Avance = Avance;
    }
    
}
