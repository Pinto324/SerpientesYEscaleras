/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import Partida.ManejadorDePartida;
import Usuarios.ManejoDeUsuarios;
import Utilidades.*;
import Utilidades.Ficha;
import Utilidades.Partida;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 *
 * @author branp
 */
public class Tablero extends javax.swing.JFrame {

    private ArrayList<Ficha> Fichas = new ArrayList<>();
    private ArrayList<Boolean> TurnoPerdido = new ArrayList<>();
    private ManejadorDePartida Admin = new ManejadorDePartida();
    private int Turno = 0;
    private Partida Partida;
    private boolean Repetir = false;
    public Tablero(ArrayList<Ficha> Fichas) {
        initComponents();
        this.Fichas = Fichas;
        Partida = new Partida(Fichas,3,3,2,2,2);
        PanelDeTablero.setLayout(new GridLayout(Partida.getColumnas(),Partida.getFilas()));
        ReMostrarSuelo();
    }
    //constructor para tablero personalizado
    public Tablero(ArrayList<Ficha> FichasEnLaCasilla,int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CSerpientes,List<List<Integer>> CPierdeTurno,List<List<Integer>> CEscalera){
        initComponents();
        this.Fichas = FichasEnLaCasilla;
        Partida = new Partida(FichasEnLaCasilla,X, Y, CRetrocede, CAvanza,CTiraDados, CSerpientes, CPierdeTurno, CEscalera);
        PanelDeTablero.setLayout(new GridLayout(Partida.getColumnas(),Partida.getFilas()));
        AsignarTurnosPerdidos();
        ReMostrarSuelo();
    }
    //Constructor para tablero sin serpientes y escaleras:
    public Tablero(ArrayList<Ficha> FichasEnLaCasilla,int X, int Y, List<List<Integer>> CRetrocede, List<List<Integer>> CAvanza,List<List<Integer>> CTiraDados,List<List<Integer>> CPierdeTurno){
        initComponents();
        this.Fichas = FichasEnLaCasilla;
        Partida = new Partida(FichasEnLaCasilla,X, Y, CRetrocede, CAvanza,CTiraDados, CPierdeTurno);
        PanelDeTablero.setLayout(new GridLayout(Partida.getColumnas(),Partida.getFilas()));
        AsignarTurnosPerdidos();
        ReMostrarSuelo();
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
                    Fichas.get(Turno).setCasillaActual(Fichas.get(Turno).getCasillaActual()+Admin.getAvance());
                    CompararCasillaE();
                    Partida.MeterFichaPorNo(Fichas.get(Turno));
                    EvaluarGanador();
                    BotonEmpezar.setEnabled(false);
                    BotonTurno.setEnabled(true);
                        if(Repetir){
                            Repetir = false;
                        }else{
                            Turno++;
                            if(TurnoPerdido.get(Turno)){
                                JOptionPane.showMessageDialog(null, Fichas.get(Turno).getNombreDeJugador()+" tiene un turno perdido");
                                Turno++;
                                TurnoPerdido.set(Turno, false);
                            }
                        }
                            if(Turno >= Fichas.size()){
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
        if(Turno >= Fichas.size()){
            Turno = 0;
            if(TurnoPerdido.get(Turno)){
                                JOptionPane.showMessageDialog(null, Fichas.get(Turno).getNombreDeJugador()+" tiene un turno perdido");
                                Turno++;
                                TurnoPerdido.set(Turno, false);
                            }
        }
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
                        if(Partida.getTablero()[x][y] instanceof CasillaSerpiente){
                            PanelDeTablero.add(Partida.getTablero()[x][y].getCasilla());
                        }
                }
        } 
    }   
    public void EvaluarGanador(){
        if(Fichas.get(Turno).getCasillaActual()>=(Partida.getColumnas()*Partida.getFilas())){
            for (int i = 0; i < ManejoDeUsuarios.getListaUsuarios().size() ; i++) {
                for (int j = 0; j < Fichas.size() ; j++) {
                    //Asignandole la victoria al ganador
                    if(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(Turno).getIdDeJugador()){
                        ManejoDeUsuarios.AsignarVictoriaPorID(Fichas.get(Turno).getIdDeJugador());
                    }else if(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(j).getIdDeJugador()&&!(ManejoDeUsuarios.getListaUsuarios().get(i).getId()==Fichas.get(Turno).getIdDeJugador())){
                    //Asignando la derrota a los perdedores
                        ManejoDeUsuarios.AsignarDerrotaPorID(ManejoDeUsuarios.getListaUsuarios().get(i).getId());
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Felicidades "+Fichas.get(Turno).getNombreDeJugador()+" has ganado!");
            main.main.Menu.setVisible(true);
            ManejoDeUsuarios.GrabarUsuarios();
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
    public void CompararCasillaE(){
        for (int x = 0; x < Partida.getColumnas() ; x++) {
            for (int y = 0; y < Partida.getFilas() ; y++) {
                if(Partida.getTablero()[x][y].getNoCasilla()==Fichas.get(Turno).getCasillaActual()){
                    //Evaluando si es serpiente
                    if(Partida.getTablero()[x][y] instanceof CasillaSerpiente){
                        CasillaSerpiente a =(CasillaSerpiente) Partida.getTablero()[x][y];
                        Fichas.get(Turno).setCasillaActual(a.getCasillaDeregreso());
                        JOptionPane.showMessageDialog(null, "Whooops "+Fichas.get(Turno).getNombreDeJugador()+" has caido en la cola de serpiente en la casilla "+ Partida.getTablero()[x][y].getNoCasilla()+" regresas a la casilla "+a.getCasillaDeregreso());
                    //Evaluando si es escalera
                    }else if(Partida.getTablero()[x][y] instanceof CasillaEscalera){
                        CasillaEscalera ce =(CasillaEscalera) Partida.getTablero()[x][y];
                        Fichas.get(Turno).setCasillaActual(ce.getCasillaAAvanzar());
                        JOptionPane.showMessageDialog(null, "En hora buena! has encontrado una escalera "+Fichas.get(Turno).getNombreDeJugador()+" has subido a la casilla "+ce.getCasillaAAvanzar());
                    //Evaluando si es TiraDados
                    }else if(Partida.getTablero()[x][y] instanceof CasillaTirarDados){
                        JOptionPane.showMessageDialog(null, "Wow "+Fichas.get(Turno).getNombreDeJugador()+" puedes tirar dados otra vez!");
                        Repetir = true;
                    //Evaluando si es PierdeTurno
                    }else if(Partida.getTablero()[x][y] instanceof CasillaPerderTurno){
                        JOptionPane.showMessageDialog(null, "Oh... mala suerte "+Fichas.get(Turno).getNombreDeJugador()+" has perdido un turno");
                        TurnoPerdido.set(Turno, true);
                    //Evaluando si es Avanza
                    }else if(Partida.getTablero()[x][y] instanceof CasillaAvanza){
                        CasillaAvanza a =(CasillaAvanza) Partida.getTablero()[x][y];
                        JOptionPane.showMessageDialog(null, "Que suerte! "+Fichas.get(Turno).getNombreDeJugador()+" has avanzado " +a.getCasillasAtras()+" casillas!");
                        Fichas.get(Turno).setCasillaActual(Fichas.get(Turno).getCasillaActual()+a.getCasillasAtras());
                    //Evaluando si es Retrocede
                    }else if(Partida.getTablero()[x][y] instanceof CasillaRetrocede){
                        CasillaRetrocede a =(CasillaRetrocede) Partida.getTablero()[x][y];
                        JOptionPane.showMessageDialog(null, "Que mal! "+Fichas.get(Turno).getNombreDeJugador()+" has retrocedido " +a.getCasillasAtras()+" casillas...");
                        Fichas.get(Turno).setCasillaActual(Fichas.get(Turno).getCasillaActual()-a.getCasillasAtras());
                    }
                }
            }
        }
    }
    public void AsignarTurnosPerdidos(){
        for (int x = 0; x < Fichas.size() ; x++) {
            TurnoPerdido.add(false);
        }
    }
}
