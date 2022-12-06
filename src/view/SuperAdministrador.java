
package view;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import controller.JugadorController;
import controller.RolController;
import controller.UsuarioController;
import entity.Jugador;
import entity.Rol;
import entity.Usuario;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import service.JugadorServiceImpl;
import service.RolServiceImpl;

public class SuperAdministrador extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private int idUsuario;
    private UsuarioController userController;
    private RolController rolController;
    private JugadorController jugadorController;
    
    private JLabel fondo1;
    private JLabel fondo2;
    
    private ImageIcon iFondo1;
    private ImageIcon iFondo2;
    private ImageIcon iAux;
    
    public SuperAdministrador() {
        initComponents();
        
        modelo = (DefaultTableModel) jTable1.getModel();
        userController = new UsuarioController();
        rolController= new RolController();
        jugadorController=new JugadorController();
        userController.init();
        jugadorController.init();
        userController.init();
        rolController.init();
        userController.mostrarRegistros(modelo);
        
        iFondo1 = new ImageIcon("resourses/images/fondoC1.png");
        iFondo2 = new ImageIcon("resourses/images/fondoC2.png");
        
        iAux = new ImageIcon(iFondo1.getImage().getScaledInstance(
                jPanel1.getWidth(), jPanel1.getHeight(), Image.SCALE_AREA_AVERAGING));
        fondo1 = new JLabel();
        fondo1.setBounds(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        fondo1.setIcon(iAux);
        jPanel1.add(fondo1);
        
        iAux = new ImageIcon(iFondo2.getImage().getScaledInstance(
                jPanel2.getWidth(), jPanel2.getHeight(), Image.SCALE_AREA_AVERAGING));
        fondo2 = new JLabel();
        fondo2.setBounds(0, 0, jPanel2.getWidth(), jPanel2.getHeight());
        fondo2.setIcon(iAux);
        jPanel2.add(fondo2);

        
        addItemRol(cbRol);
        addItemJugador(cbTelefono);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bConfiguracion = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cbRol = new javax.swing.JComboBox<>();
        cbTelefono = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(280, 387));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Administrador");

        bConfiguracion.setBackground(new java.awt.Color(153, 153, 153));
        bConfiguracion.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/config.png")); // NOI18N
        bConfiguracion.setText("Configuración");
        bConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bConfiguracion.setFocusable(false);
        bConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfiguracionActionPerformed(evt);
            }
        });

        bSalir.setBackground(new java.awt.Color(153, 153, 153));
        bSalir.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/salir_1.png")); // NOI18N
        bSalir.setText("Salir");
        bSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bSalir.setFocusable(false);
        bSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bSalirMouseClicked(evt);
            }
        });
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/usuario2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(bConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(java.awt.Color.pink);
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 380));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - ROL - -" }));
        jPanel2.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, -1));

        cbTelefono.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- - TELÉFONO - -" }));
        cbTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTelefonoActionPerformed(evt);
            }
        });
        jPanel2.add(cbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/eliminar.png")); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 30));

        jButton2.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/Actualizar (2).png")); // NOI18N
        jButton2.setText("Actualizar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, -1));

        jButton3.setIcon(new javax.swing.ImageIcon("/home/oscar/NetBeansProjects/tetrix/resourses/images/GuardarTodo.png")); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, -1));

        jLabel3.setText("Nombre del usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 160, -1));

        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Contraseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 350, 310));

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel5.setText("Gestión de Usuarios");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, -3, 620, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfiguracionActionPerformed
        
    }//GEN-LAST:event_bConfiguracionActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        
    }//GEN-LAST:event_bSalirActionPerformed

    private void cbTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTelefonoActionPerformed
        
    }//GEN-LAST:event_cbTelefonoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Usuario usuario = new Usuario();
        
        String telefono=cbTelefono.getSelectedItem().toString();
        String rolA=cbRol.getSelectedItem().toString();
        
        
        Jugador jugador=jugadorController.buscarRegistroTelefono(telefono);
        Rol rol=rolController.buscarRegistro(rolA);
        
        usuario.setNombre(this.jTextField1.getText());
        usuario.setPassword(String.valueOf(jPasswordField1.getPassword()));
        usuario.setId_jugador(jugador.getId_jugador());
        usuario.setId_rol(rol.getIdRol());
        
        userController.crearActualizarUsuario(usuario);
        userController.mostrarRegistros(modelo);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        idUsuario = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        jTextField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        jPasswordField1.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        userController.eliminarRegistro(idUsuario);
        userController.mostrarRegistros(modelo);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String telefono=cbTelefono.getSelectedItem().toString();
        String rolA=cbRol.getSelectedItem().toString();
        
        Jugador jugador=jugadorController.buscarRegistroTelefono(telefono);
        Rol rol=rolController.buscarRegistro(rolA);
        Usuario usuario = new Usuario();
        
        usuario.setId_usuario(idUsuario);
        usuario.setNombre(jTextField1.getText());
        usuario.setPassword(String.valueOf(jPasswordField1.getPassword()));
        usuario.setId_jugador(jugador.getId_jugador());
        usuario.setId_rol(rol.getIdRol());
        
        userController.crearActualizarUsuario(usuario);
        userController.mostrarRegistros(modelo);
    }//GEN-LAST:event_jButton2MouseClicked

    private void bSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bSalirMouseClicked
        this.setVisible(false);
        PlantillaLogueo logueo=new PlantillaLogueo();
        logueo.setVisible(true);
    }//GEN-LAST:event_bSalirMouseClicked

    public void addItemRol(JComboBox jcB){
        RolServiceImpl impl=new RolServiceImpl();
        List<Rol> listaRol=impl.obtenerRegistro();
        for (Rol rol : listaRol) {
            jcB.addItem(rol.getRol());
        }
    }
    
    public void addItemJugador(JComboBox jcB){
        JugadorServiceImpl impl=new JugadorServiceImpl();
        List<Jugador> listaJugador=impl.obtenerRegistro();
        for (Jugador rol : listaJugador) {
            jcB.addItem(rol.getTelefono());
        }
    }
    
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuperAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bConfiguracion;
    private javax.swing.JButton bSalir;
    private javax.swing.JComboBox<String> cbRol;
    private javax.swing.JComboBox<String> cbTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
