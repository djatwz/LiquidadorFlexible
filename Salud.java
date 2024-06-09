/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;
import java.sql.Connection; 
import java.sql.*;
import java.util.*;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Salud extends javax.swing.JFrame {

Connection con;

public Salud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cedula = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        pflexi = new javax.swing.JLabel();
        tot_ces = new javax.swing.JLabel();
        ces_empleador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        scedula = new javax.swing.JTextField();
        sempleado = new javax.swing.JTextField();
        tsalud = new javax.swing.JTextField();
        ssalario = new javax.swing.JTextField();
        spflexi = new javax.swing.JTextField();
        sempleador = new javax.swing.JTextField();
        salario1 = new javax.swing.JLabel();
        sal_flexi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cedula.setText("cedula");

        salario.setText("Salario");

        pflexi.setText("% Flexibilización");

        tot_ces.setText("Total Salud");

        ces_empleador.setText("Salud  empleador");

        jLabel6.setText("Salud  empleado");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        spflexi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spflexiActionPerformed(evt);
            }
        });

        salario1.setText("Sal flexi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ces_empleador)
                            .addComponent(tot_ces)
                            .addComponent(pflexi)
                            .addComponent(cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(limpiar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(sempleado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(sempleador, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tsalud, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spflexi, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(scedula, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(34, 34, 34)
                        .addComponent(Consultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(salario)
                        .addGap(18, 18, 18)
                        .addComponent(ssalario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salario1)
                        .addGap(33, 33, 33)
                        .addComponent(sal_flexi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula)
                    .addComponent(scedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salario)
                    .addComponent(ssalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario1)
                    .addComponent(sal_flexi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pflexi)
                    .addComponent(spflexi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot_ces)
                    .addComponent(tsalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ces_empleador)
                    .addComponent(sempleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(limpiar)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Consultar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
       try{
       String cedula1=scedula.getText();
       int cedint = Integer.parseInt(cedula1);
           System.out.println(cedula1);
       con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/flexible","root","");
       String sql = "select salario, por_felx, salario * (por_felx/100) as salario_flex, salario * (stot/100) as por_total, salario * (stot/100)*(sempleador/100) as pempleador, salario * (stot/100)*(sempleado/100) as pempleado from cliente, parametriza where cedula = ?";  
             
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setInt(1, cedint);
       ResultSet rs = ps.executeQuery();
            if (rs.next()){
                
       int resultado =rs.getInt("salario_flex");
       int res_p_total =rs.getInt("por_total");
       int res_p_empleador =rs.getInt("pempleador");
       int res_p_empleado =rs.getInt("pempleado");
            System.out.println("Resultado: " + resultado);

            ssalario.setText(rs.getString("salario"));
            sal_flexi.setText(rs.getString("salario_flex"));
            spflexi.setText(rs.getString("por_felx"));
            tsalud.setText(String.valueOf(resultado));
            tsalud.setText(String.valueOf(res_p_total ));  
            sempleador.setText(String.valueOf(res_p_empleador ));  
            sempleado.setText(String.valueOf(res_p_empleado ));
            }
                 
       }
        catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_ConsultarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
      limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void spflexiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spflexiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spflexiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel ces_empleador;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel pflexi;
    private javax.swing.JTextField sal_flexi;
    private javax.swing.JLabel salario;
    private javax.swing.JLabel salario1;
    private javax.swing.JTextField scedula;
    private javax.swing.JTextField sempleado;
    private javax.swing.JTextField sempleador;
    private javax.swing.JTextField spflexi;
    private javax.swing.JTextField ssalario;
    private javax.swing.JLabel tot_ces;
    private javax.swing.JTextField tsalud;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
    scedula.setText("");
    ssalario.setText("");
    sal_flexi.setText("");
    spflexi.setText("");
    tsalud.setText("");
    sempleador.setText(""); 
    sempleado.setText(""); 
       
    }
}
