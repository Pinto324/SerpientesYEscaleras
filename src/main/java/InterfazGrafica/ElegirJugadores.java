
package InterfazGrafica;

import Usuarios.ManejoDeUsuarios;
import Utilidades.Ficha;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ElegirJugadores extends javax.swing.JFrame {
    private ArrayList<Ficha> Fichas = new ArrayList<>();
    private int JugadoresMaximos;
    private int Contador = 1;
    boolean Validador = false;
    public ElegirJugadores() {
        initComponents();
        LlenarComboAJugar();
        LlenarComboJugadores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ComboBoxNoJ = new javax.swing.JComboBox<>();
        CBNombreDeJugador = new javax.swing.JComboBox<>();
        BotonAsignarJ = new javax.swing.JButton();
        BotonEmpezarPartida = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        LabelNo = new javax.swing.JLabel();
        ValidarJugadores = new javax.swing.JButton();
        BotonImportar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel2.setText("Escoja cuantos jugadores jugarán.");

        ComboBoxNoJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboBoxNoJMouseClicked(evt);
            }
        });
        ComboBoxNoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNoJActionPerformed(evt);
            }
        });

        CBNombreDeJugador.setEnabled(false);
        CBNombreDeJugador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CBNombreDeJugadorMouseClicked(evt);
            }
        });
        CBNombreDeJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBNombreDeJugadorActionPerformed(evt);
            }
        });

        BotonAsignarJ.setText("Siguiente Jugador");
        BotonAsignarJ.setEnabled(false);
        BotonAsignarJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAsignarJActionPerformed(evt);
            }
        });

        BotonEmpezarPartida.setText("Empezar Partida");
        BotonEmpezarPartida.setEnabled(false);
        BotonEmpezarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEmpezarPartidaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel3.setText("Escoja que jugador usara la ficha no:");
        jLabel3.setOpaque(true);

        LabelNo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        LabelNo.setText(" ");
        LabelNo.setOpaque(true);

        ValidarJugadores.setText("Validar Jugadores");
        ValidarJugadores.setEnabled(false);
        ValidarJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidarJugadoresActionPerformed(evt);
            }
        });

        BotonImportar.setText("Importar");
        BotonImportar.setEnabled(false);
        BotonImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonImportarActionPerformed(evt);
            }
        });

        jLabel4.setText("Importar tablero:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(CBNombreDeJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(ComboBoxNoJ, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ValidarJugadores))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(BotonEmpezarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(BotonImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 4, Short.MAX_VALUE))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(BotonAsignarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxNoJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ValidarJugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelNo))
                .addGap(18, 18, 18)
                .addComponent(CBNombreDeJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BotonAsignarJ, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEmpezarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonImportar))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxNoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNoJActionPerformed
        if(Validador){
        CBNombreDeJugador.setEnabled(false);
        }
    }//GEN-LAST:event_ComboBoxNoJActionPerformed

    private void CBNombreDeJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBNombreDeJugadorActionPerformed
        
    }//GEN-LAST:event_CBNombreDeJugadorActionPerformed

    private void BotonEmpezarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEmpezarPartidaActionPerformed
        Tablero Tablero = new Tablero(Fichas);
        Tablero.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonEmpezarPartidaActionPerformed

    private void BotonAsignarJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAsignarJActionPerformed
        CBNombreDeJugador.setEnabled(true);
        InicializarJugadores((String)CBNombreDeJugador.getSelectedItem(),ManejoDeUsuarios.BuscarIdPorNombre((String)CBNombreDeJugador.getSelectedItem()));
        LabelNo.setText(String.valueOf(Contador));
        CBNombreDeJugador.removeItemAt(CBNombreDeJugador.getSelectedIndex());
        BotonAsignarJ.setEnabled(false);
    }//GEN-LAST:event_BotonAsignarJActionPerformed

    private void CBNombreDeJugadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CBNombreDeJugadorMouseClicked
        BotonAsignarJ.setEnabled(true);
    }//GEN-LAST:event_CBNombreDeJugadorMouseClicked

    private void ValidarJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidarJugadoresActionPerformed
   try{   
        if(ManejoDeUsuarios.getListaUsuarios().size() >= (ComboBoxNoJ.getSelectedIndex()+2)){
            ComboBoxNoJ.setEnabled(false); 
            CBNombreDeJugador.setEnabled(true);
            LabelNo.setOpaque(true);
            LabelNo.setText(String.valueOf(Contador));
            JugadoresMaximos=ComboBoxNoJ.getSelectedIndex()+2;
            ValidarJugadores.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "No hay suficientes jugadores en el sistema para jugar con ese numero de fichas, seleccione otra cantidad porfavor.");
        }
    }catch(NullPointerException e){
    
    }
    }//GEN-LAST:event_ValidarJugadoresActionPerformed

    private void ComboBoxNoJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboBoxNoJMouseClicked
       Validador= true;
        ValidarJugadores.setEnabled(true);
    }//GEN-LAST:event_ComboBoxNoJMouseClicked

    private void BotonImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonImportarActionPerformed
        
    }//GEN-LAST:event_BotonImportarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAsignarJ;
    private javax.swing.JButton BotonEmpezarPartida;
    private javax.swing.JButton BotonImportar;
    private javax.swing.JComboBox<String> CBNombreDeJugador;
    private javax.swing.JComboBox<String> ComboBoxNoJ;
    private javax.swing.JLabel LabelNo;
    private javax.swing.JButton ValidarJugadores;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
    public void LlenarComboAJugar(){
        for (int x = 2; x < 7 ; x++) {
            ComboBoxNoJ.addItem(String.valueOf(x));
        }
    }
    public void LlenarComboJugadores(){
        for (int x = 0; x < ManejoDeUsuarios.getListaUsuarios().size() ; x++) {
            CBNombreDeJugador.addItem(ManejoDeUsuarios.getListaUsuarios().get(x).getNombre());
        }
    }
    public void InicializarJugadores(String Nombre, int ID){
        switch (Contador) {
            case 1:
                JLabel L = new javax.swing.JLabel();
                L.setIcon(new ImageIcon("Fichas/FichaA.png"));
                Ficha J1 = new Ficha(1,L,Nombre,ID);
                Fichas.add(J1);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;
            case 2:
                JLabel A = new javax.swing.JLabel();
                A.setIcon(new ImageIcon("Fichas/FichaN.png"));
                Ficha J2 = new Ficha(1,A,Nombre,ID);
                Fichas.add(J2);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;
            case 3:
                JLabel N = new javax.swing.JLabel();
                N.setIcon(new ImageIcon("Fichas/FichaAma.png"));
                Ficha J3 = new Ficha(1, N,Nombre,ID);
                Fichas.add(J3);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;
            case 4:
                JLabel z = new javax.swing.JLabel();
                z.setIcon(new ImageIcon("Fichas/FichaCafe.png"));
                Ficha J4 = new Ficha(1, z,Nombre,ID);
                Fichas.add(J4);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;
            case 5:
                JLabel q = new javax.swing.JLabel();
                q.setIcon(new ImageIcon("Fichas/FichaC.png"));
                Ficha J5 = new Ficha(1, q,Nombre,ID);
                Fichas.add(J5);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;
            case 6:
                JLabel l = new javax.swing.JLabel();
                l.setIcon(new ImageIcon("Fichas/FichaR.png"));
                Ficha J6 = new Ficha(1,l,Nombre,ID);
                Fichas.add(J6);
                ManejoDeUsuarios.AsignarJuegoPorNombre(Nombre);
                break;    
            default:
                break;
        }        
        VerificarContador();
        Contador++;
    }
    public void VerificarContador(){
        if(Contador==JugadoresMaximos){
            BotonEmpezarPartida.setEnabled(true);
            BotonImportar.setEnabled(true);
            CBNombreDeJugador.setEnabled(false);
            BotonAsignarJ.setEnabled(false);
        }
    }
}
