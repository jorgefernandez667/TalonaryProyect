
package Talonario;
import conexionPro.conexion;
import java.awt.GridLayout;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JButton;
public class Talonary extends javax.swing.JFrame {
private conexion con;
    public Talonary() {
        initComponents();
        con = new conexion(); // Inicializa la instancia de tu clase de conexión
        
        cargarTalonarios();
       ComboBoxTalonarios.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        // Obtener el elemento seleccionado
        String seleccionado = (String) ComboBoxTalonarios.getSelectedItem();
        System.out.println(seleccionado);
        TextFieldNameTalon.setText(seleccionado);
        actualizarBotones(seleccionado);
        // Realizar la acción necesaria
        System.out.println("Seleccionado: " + seleccionado);
    }
});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextFieldNameTalonario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldQuantiNumbers = new javax.swing.JTextField();
        ButtonCreateTalon = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldNameOwner = new javax.swing.JTextField();
        ButtonBuy = new javax.swing.JButton();
        ButtonSetAside = new javax.swing.JButton();
        ComboBoxTalonarios = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TextFieldNameTalon = new javax.swing.JTextField();
        PanelBotton = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Talonario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Ingresar nuevo Talonario");

        TextFieldNameTalonario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameTalonarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de talonario");

        jLabel3.setText("Cantidad de numeros");

        TextFieldQuantiNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldQuantiNumbersQuantiNumbersActionPerformed(evt);
            }
        });

        ButtonCreateTalon.setBackground(new java.awt.Color(51, 51, 255));
        ButtonCreateTalon.setText("Crear");
        ButtonCreateTalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateTalonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("comprar o apartar numeros");

        jLabel5.setText("Nombre del comprador");

        TextFieldNameOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNameOwnerActionPerformed(evt);
            }
        });

        ButtonBuy.setText("comprar");
        ButtonBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuyActionPerformed(evt);
            }
        });

        ButtonSetAside.setText("apartar");
        ButtonSetAside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSetAsideActionPerformed(evt);
            }
        });

        ComboBoxTalonarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTalonariosActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Talonarios Activos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(ButtonCreateTalon))
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldNameTalonario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addComponent(TextFieldQuantiNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldNameOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ButtonBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ButtonSetAside, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ComboBoxTalonarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextFieldNameTalon))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(TextFieldNameTalonario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldQuantiNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonCreateTalon)
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(ComboBoxTalonarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldNameTalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TextFieldNameOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonBuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonSetAside)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout PanelBottonLayout = new javax.swing.GroupLayout(PanelBotton);
        PanelBotton.setLayout(PanelBottonLayout);
        PanelBottonLayout.setHorizontalGroup(
            PanelBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        PanelBottonLayout.setVerticalGroup(
            PanelBottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBotton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldQuantiNumbersQuantiNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldQuantiNumbersQuantiNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldQuantiNumbersQuantiNumbersActionPerformed

    private void cargarTalonarios() {
     try {
        Connection conexion = con.conexion(); // Obtener la conexión
        
        ComboBoxTalonarios.removeAllItems(); // Limpiar el ComboBoxTalonarios
        
        // Consultar los nombres de los talonarios en la base de datos
        String query = "SELECT nombre FROM talonario";
        
        PreparedStatement pst = conexion.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        
        // Agregar los nombres de los talonarios al ComboBoxTalonarios
        while(rs.next()) {
            String nombreTalonario = rs.getString("nombre");
            ComboBoxTalonarios.addItem(nombreTalonario);
        }
        
        // Cerrar la conexión después de usarla
        conexion.close();
    } catch (SQLException e) {
        // Manejar la excepción
        e.printStackTrace();
    }
    }
    
    private void ComboBoxTalonariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTalonariosActionPerformed

    // Volver a cargar los talonarios
    cargarTalonarios();
    
    }//GEN-LAST:event_ComboBoxTalonariosActionPerformed

    private void TextFieldNameTalonarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameTalonarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameTalonarioActionPerformed

    private void ButtonCreateTalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateTalonActionPerformed
          // Obtener el texto del campo de cantidad de números
    String cantidadText = TextFieldQuantiNumbers.getText();

    // Verificar si el texto ingresado es un número
    try {
        int cantidadNumeros = Integer.parseInt(cantidadText);

        // Insertar los datos en la base de datos
        String nombreTalonario = TextFieldNameTalonario.getText();
        String estadoTalonario = "Activo"; // Estado por defecto al crear un nuevo talonario
        String estadoNumero = "Disponible"; // Estado predefinido de los números
        String sinDueño = "Sin dueño"; // Dueño predefinido de los números
        String queryTalonario = "INSERT INTO talonario (Nombre, Numero, Estado) VALUES (?, ?, ?)";
        String queryNumeros = "INSERT INTO numeros (Numero, Talonario, Dueño, Estado) VALUES (?, ?, ?, ?)";

        // Preparar la consulta SQL para el talonario y ejecutarla
        try {
            PreparedStatement pstTalonario = con.conexion().prepareStatement(queryTalonario); // Obtener la conexión desde 'con'
            pstTalonario.setString(1, nombreTalonario);
            pstTalonario.setInt(2, cantidadNumeros);
            pstTalonario.setString(3, estadoTalonario);

            int resultadoTalonario = pstTalonario.executeUpdate();

            if(resultadoTalonario > 0) {
                // Éxito al insertar el talonario
                System.out.println("Talonario creado correctamente.");

                // Insertar los números en la tabla 'numeros'
                for (int i = 1; i <= cantidadNumeros; i++) {
                    PreparedStatement pstNumeros = con.conexion().prepareStatement(queryNumeros);
                    pstNumeros.setInt(1, i);
                    pstNumeros.setString(2, nombreTalonario);
                    pstNumeros.setString(3, sinDueño);
                    pstNumeros.setString(4, estadoNumero);

                    int resultadoNumeros = pstNumeros.executeUpdate();

                    if(resultadoNumeros <= 0) {
                        // Error al insertar un número
                        System.out.println("Error al crear número: " + i);
                    }
                }

                // Limpiar los campos de texto
                TextFieldNameTalonario.setText("");
                TextFieldQuantiNumbers.setText("");
                
                // Mostrar ventana emergente
                JOptionPane.showMessageDialog(null, "Talonario agregado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Fallo al insertar el talonario
                System.out.println("Error al crear talonario.");
            }
        } catch (SQLException e) {
            // Manejar la excepción
            e.printStackTrace();
        }
    } catch (NumberFormatException e) {
        // El texto ingresado no es un número válido
        System.out.println("Por favor, ingrese solo números en el campo de cantidad de números.");
    }
    }//GEN-LAST:event_ButtonCreateTalonActionPerformed

    private void TextFieldNameOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNameOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNameOwnerActionPerformed

    private void ButtonBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBuyActionPerformed

    private void ButtonSetAsideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSetAsideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSetAsideActionPerformed
    
    private void actualizarBotones(String nombreTalonario) {
    try {
        Connection conexion = con.conexion(); // Obtener la conexión
        
        // Consultar la cantidad de números asociados al talonario seleccionado
        String query = "SELECT COUNT(*) AS cantidad FROM numeros WHERE talonario = ?";
        PreparedStatement pst = conexion.prepareStatement(query);
        pst.setString(1, nombreTalonario);
        ResultSet rs = pst.executeQuery();
        
        if (rs.next()) {
            int cantidadNumeros = rs.getInt("Cantidad");
            PanelBotton.removeAll(); // Limpiar el panel que contiene los botones
            
            // Calcular el número de columnas necesario para distribuir uniformemente los botones
            int numColumnas = (int) Math.ceil(Math.sqrt(cantidadNumeros));
            
            // Configurar el GridLayout en el panel con el número de columnas calculado
            PanelBotton.setLayout(new GridLayout(0, numColumnas));
            
            // Crear y añadir botones al panel
            for (int i = 1; i <= cantidadNumeros; i++) {
                JButton boton = new JButton("Número " + i);
                PanelBotton.add(boton);
            }
            
            // Actualizar la interfaz de usuario
            PanelBotton.revalidate();
            PanelBotton.repaint();
        }
        
        conexion.close(); // Cerrar la conexión
    } catch (SQLException e) {
        // Manejar la excepción
        e.printStackTrace();
    }
}
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Talonary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Talonary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Talonary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Talonary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Talonary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuy;
    private javax.swing.JButton ButtonCreateTalon;
    private javax.swing.JButton ButtonSetAside;
    private javax.swing.JComboBox<String> ComboBoxTalonarios;
    private javax.swing.JPanel PanelBotton;
    private javax.swing.JTextField TextFieldNameOwner;
    private javax.swing.JTextField TextFieldNameTalon;
    private javax.swing.JTextField TextFieldNameTalonario;
    private javax.swing.JTextField TextFieldQuantiNumbers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
