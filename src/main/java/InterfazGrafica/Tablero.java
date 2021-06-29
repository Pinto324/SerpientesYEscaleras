/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Partida.ManejadorDePartida;
import Usuarios.ManejoDeUsuarios;
import Utilidades.Ficha;
import Utilidades.Partida;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author branp
 */
public class Tablero extends javax.swing.JFrame {

    ArrayList<Ficha> Fichas = new ArrayList<>();
    JLabel L = new javax.swing.JLabel();
    JLabel A = new javax.swing.JLabel();
    JLabel N = new javax.swing.JLabel();
    ManejadorDePartida Admin = new ManejadorDePartida();
    private int Turno = 0;
    Ficha J1;
    Ficha J2;
    Ficha J3;
    int ContadorPanel=0;
    Partida Partida;
    public Tablero() {
        initComponents();
        N.setIcon(new ImageIcon("Fichas/FichaA.png"));
        J1 = new Ficha(1,N,"Martin",1);
        A.setIcon(new ImageIcon("Fichas/FichaN.png"));
        J2 = new Ficha(1, A,"Alla",1);
        L.setIcon(new ImageIcon("Fichas/FichaAma.png"));
        J3 = new Ficha(1, L,"Noel",1);
        Fichas.add(J1);
        Fichas.add(J2);
        Fichas.add(J3);
        Partida = new Partida(Fichas,3,3);
        PanelDeTablero.setLayout(new GridLayout(Partida.getColumnas(),Partida.getFilas()));
        MostrarSuelo();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDeMenu = new javax.swing.JPanel();
        PanelDeTablero = new javax.swing.JPanel();
        PanelDeControl = new javax.swing.JPanel();
        BotonEmpezar = new javax.swing.JButton();
        BotonParar = new javax.swing.JButton();
        PanelDado = new javax.swing.JPanel();
        ImagenDado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LabelDeJugador = new javax.swing.JLabel();
        BotonTurno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        PanelDeMenu.setBackground(new java.awt.Color(51, 51, 255));

        PanelDeTablero.setBackground(new java.awt.Color(153, 153, 255));
        PanelDeTablero.setPreferredSize(new java.awt.Dimension(800, 630));
        PanelDeTablero.setRequestFocusEnabled(false);

        javax.swing.GroupLayout PanelDeTableroLayout = new javax.swing.GroupLayout(PanelDeTablero);
        PanelDeTablero.setLayout(PanelDeTableroLayout);
        PanelDeTableroLayout.setHorizontalGroup(
            PanelDeTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelDeTableroLayout.setVerticalGroup(
            PanelDeTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        PanelDeControl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelDeControl.setEnabled(false);

        BotonEmpezar.setText("Empezar giro");
        BotonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpezarActionPerformed(evt);
            }
        });

        BotonParar.setText("Parar");
        BotonParar.setEnabled(false);
        BotonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPararActionPerformed(evt);
            }
        });

        PanelDado.setPreferredSize(new java.awt.Dimension(100, 100));

        ImagenDado.setText(" ");
        ImagenDado.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout PanelDadoLayout = new javax.swing.GroupLayout(PanelDado);
        PanelDado.setLayout(PanelDadoLayout);
        PanelDadoLayout.setHorizontalGroup(
            PanelDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDadoLayout.createSequentialGroup()
                .addComponent(ImagenDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelDadoLayout.setVerticalGroup(
            PanelDadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ImagenDado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setText("Turno del jugador:");

        LabelDeJugador.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        LabelDeJugador.setText(" ");

        javax.swing.GroupLayout PanelDeControlLayout = new javax.swing.GroupLayout(PanelDeControl);
        PanelDeControl.setLayout(PanelDeControlLayout);
        PanelDeControlLayout.setHorizontalGroup(
            PanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeControlLayout.createSequentialGroup()
                .addGroup(PanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeControlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonParar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDeControlLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(PanelDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelDeControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDeJugador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelDeControlLayout.setVerticalGroup(
            PanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeControlLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(PanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LabelDeJugador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(PanelDeControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEmpezar)
                    .addComponent(BotonParar))
                .addGap(32, 32, 32))
        );

        BotonTurno.setText("Siguiente turno");
        BotonTurno.setEnabled(false);
        BotonTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDeMenuLayout = new javax.swing.GroupLayout(PanelDeMenu);
        PanelDeMenu.setLayout(PanelDeMenuLayout);
        PanelDeMenuLayout.setHorizontalGroup(
            PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDeTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeMenuLayout.createSequentialGroup()
                        .addComponent(PanelDeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeMenuLayout.createSequentialGroup()
                        .addComponent(BotonTurno)
                        .addGap(57, 57, 57))))
        );
        PanelDeMenuLayout.setVerticalGroup(
            PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelDeTablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelDeMenuLayout.createSequentialGroup()
                        .addComponent(PanelDeControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(BotonTurno)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpezarActionPerformed
        BotonEmpezar.setEnabled(false);
        BotonParar.setEnabled(true);        
        Timer timer = new Timer();
        TimerTask tarea = new TimerTask(){
         @Override
            public void run(){  
            Admin.ManejarDado(ImagenDado); 
                if(!(BotonParar.isEnabled())){
                    timer.cancel();
                    ArrayList<Ficha> Nube = new ArrayList<>(Fichas);
                    Partida.BorrarFichaPorNo(Fichas.get(Turno));
                    Fichas = Nube;
                    int A;
                    Fichas.get(Turno).setCasillaActual(Fichas.get(Turno).getCasillaActual()+Admin.getAvance());
                    Partida.MeterFichaPorNo(Fichas.get(Turno));
                    EvaluarGanador();
                    BotonEmpezar.setEnabled(false);
                    BotonTurno.setEnabled(true);
                    Turno++;
                    if(Turno == Fichas.size()){
                    Turno = 0;
                    }
                }
            }
        };
     timer.schedule(tarea, 100, 100);    
    }//GEN-LAST:event_BotonEmpezarActionPerformed

    private void BotonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPararActionPerformed
        BotonParar.setEnabled(false);   
    }//GEN-LAST:event_BotonPararActionPerformed

    private void BotonTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTurnoActionPerformed
        LabelDeJugador.setText(Fichas.get(Turno).getNombreDeJugador());
        BotonEmpezar.setEnabled(true);
        ImagenDado.setIcon(null);
        ReMostrarSuelo();
        BotonTurno.setEnabled(false);
    }//GEN-LAST:event_BotonTurnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEmpezar;
    private javax.swing.JButton BotonParar;
    private javax.swing.JButton BotonTurno;
    private javax.swing.JLabel ImagenDado;
    private javax.swing.JLabel LabelDeJugador;
    private javax.swing.JPanel PanelDado;
    private javax.swing.JPanel PanelDeControl;
    private javax.swing.JPanel PanelDeMenu;
    private javax.swing.JPanel PanelDeTablero;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    public void MostrarSuelo(){
        for (int x = 0; x < Partida.getColumnas() ; x++) {
                for (int y = 0; y < Partida.getFilas() ; y++) {
                    try{
                        //Ver Las fichas en la casilla:
                        if(Partida.getTablero()[x][y].getFichasEnLaCasilla().size()<=2){
                            Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,1));
                        }else if(Partida.getTablero()[x][y].getFichasEnLaCasilla().size()<=4){
                            Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,2));
                        }else{
                            Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,3));
                        }
                        if(Partida.getTablero()[x][y].getFichasEnLaCasilla()!=null){
                            for (int i = 0; i < Partida.getTablero()[x][y].getFichasEnLaCasilla().size() ; i++) {
                                Partida.getTablero()[x][y].getCasilla().add(Partida.getTablero()[x][y].getFichasEnLaCasilla().get(i).getImagenFicha());
                            }
                            }else{
                                Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(1,1));
                            }
                        }catch(java.lang.NullPointerException e){
                    }   
                    PanelDeTablero.add(Partida.getTablero()[x][y].getCasilla());
                }
        } 
    }   
    public void EvaluarGanador(){
        if(Fichas.get(Turno).getCasillaActual()>=(Partida.getColumnas()*Partida.getFilas())){
            for (int i = 0; i < ManejoDeUsuarios.getListaUsuarios().size() ; i++) {
                for (int j = 0; j < ManejoDeUsuarios.getListaUsuarios().size() ; j++) {
                    //Asignandole la victoria al ganador
                    if(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(Turno).getIdDeJugador()){
                    ManejoDeUsuarios.getListaUsuarios().get(i).setPartidasGanadas(ManejoDeUsuarios.getListaUsuarios().get(i).getPartidasGanadas()+1);
                    }else if(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(j).getIdDeJugador()&&!(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(Turno).getIdDeJugador())){
                    //Asignando la derrota a los perdedores
                    ManejoDeUsuarios.getListaUsuarios().get(i).setPartidasGanadas(ManejoDeUsuarios.getListaUsuarios().get(i).getPartidasPerdidas()+1);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Felicidades "+Fichas.get(Turno).getNombreDeJugador()+" has ganado!");
            main.main.Menu.setVisible(true);
            this.dispose();        
        }
    }
    public void ReMostrarSuelo(){
        PanelDeTablero.removeAll();
        this.PanelDeTablero.setLayout(new GridLayout(Partida.getColumnas(),Partida.getFilas()));
        for (int x = 0; x < Partida.getColumnas() ; x++) {
                for (int y = 0; y < Partida.getFilas() ; y++) {
                    try{
                        //Ver Las fichas en la casilla:
                        if(this.Partida.getTablero()[x][y].getFichasEnLaCasilla().size()<=2){
                            this.Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,1));
                        }else if(this.Partida.getTablero()[x][y].getFichasEnLaCasilla().size()<=4){
                            this.Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,2));
                        }else{
                            this.Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(2,3));
                        }
                        if(this.Partida.getTablero()[x][y].getFichasEnLaCasilla()!=null){
                            for (int i = 0; i < this.Partida.getTablero()[x][y].getFichasEnLaCasilla().size() ; i++) {
                                this.Partida.getTablero()[x][y].getCasilla().add(this.Partida.getTablero()[x][y].getFichasEnLaCasilla().get(i).getImagenFicha());
                            }
                        }
                        }catch(java.lang.NullPointerException e){
                       this.Partida.getTablero()[x][y].getCasilla().setLayout(new GridLayout(1,1));
                    }        
                    this.PanelDeTablero.add(this.Partida.getTablero()[x][y].getCasilla());
                }
        }
        this.PanelDeTablero.repaint();
    }
}
