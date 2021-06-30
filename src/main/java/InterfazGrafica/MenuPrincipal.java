
package InterfazGrafica;

import Usuarios.ManejoDeUsuarios;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {
    static IngresoDeUsuario Ingreso = new IngresoDeUsuario();
    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDeMenu = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonIngresoDeUsuarios = new javax.swing.JButton();
        BotonJugarPartida = new javax.swing.JButton();
        BotonMostrarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        PanelDeMenu.setBackground(new java.awt.Color(51, 51, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Serpientes y Escaleras");

        BotonIngresoDeUsuarios.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        BotonIngresoDeUsuarios.setText("Ingresar usuario nuevo");
        BotonIngresoDeUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIngresoDeUsuariosActionPerformed(evt);
            }
        });

        BotonJugarPartida.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        BotonJugarPartida.setText("Jugar partida");
        BotonJugarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarPartidaActionPerformed(evt);
            }
        });

        BotonMostrarDatos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        BotonMostrarDatos.setText("Datos de usuarios");
        BotonMostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonIngresoDeUsuarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonMostrarDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonJugarPartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(124, 124, 124))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BotonJugarPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonIngresoDeUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonMostrarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelDeMenuLayout = new javax.swing.GroupLayout(PanelDeMenu);
        PanelDeMenu.setLayout(PanelDeMenuLayout);
        PanelDeMenuLayout.setHorizontalGroup(
            PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeMenuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        PanelDeMenuLayout.setVerticalGroup(
            PanelDeMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelDeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIngresoDeUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIngresoDeUsuariosActionPerformed
        main.main.Menu.setVisible(false);
        Ingreso.setVisible(true);
        Ingreso.setLocationRelativeTo(null);
        Ingreso.setTitle("Ingreso de usuarios");
    }//GEN-LAST:event_BotonIngresoDeUsuariosActionPerformed

    private void BotonMostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarDatosActionPerformed
        DatosDeUsuarios Datos = new DatosDeUsuarios();
        Datos.setVisible(true);
        Datos.setLocationRelativeTo(null);
        Datos.setTitle("Datos de Usuarios");
        this.setVisible(false);
    }//GEN-LAST:event_BotonMostrarDatosActionPerformed

    private void BotonJugarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarPartidaActionPerformed
        if(ManejoDeUsuarios.getListaUsuarios().size() > 1){
        ElegirJugadores NuevoTablero = new ElegirJugadores();
        this.setVisible(false);
        NuevoTablero.setVisible(true);
        NuevoTablero.setLocationRelativeTo(null);   
        NuevoTablero.setTitle("Elección de jugadores");
        }else{
            JOptionPane.showMessageDialog(null, "No se puede jugar una partida con menos de 2 jugadores, ingrese alguno porfavor");
        }
    }//GEN-LAST:event_BotonJugarPartidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIngresoDeUsuarios;
    private javax.swing.JButton BotonJugarPartida;
    private javax.swing.JButton BotonMostrarDatos;
    private javax.swing.JPanel PanelDeMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
