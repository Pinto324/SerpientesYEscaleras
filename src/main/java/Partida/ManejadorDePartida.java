
package Partida;

import Utilidades.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManejadorDePartida {

    public ManejadorDePartida() {
    }
    
    public int ManejarDado(JLabel P){
        int No;
        int R = 0;
        No = (int) Math.round((Math.random()*60));
        if(No <= 10){
            P.setIcon(new ImageIcon("Dados/1.png"));
            R = 1;
        }else if(No <= 20){
           P.setIcon(new ImageIcon("Dados/2.png"));
            R = 2;
        }else if(No <= 30){
            P.setIcon(new ImageIcon("Dados/3.png"));
            R = 3;
        }else if(No <= 40){
            P.setIcon(new ImageIcon("Dados/4.png"));
            R = 4;
        }else if(No <= 50){
            P.setIcon(new ImageIcon("Dados/5.png"));
            R = 5;
        }else if(No <= 60){
            P.setIcon(new ImageIcon("Dados/6.png"));
            R = 6;
        } 
        System.out.println(R); 
        return R;
    }        
}
