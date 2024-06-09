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


public class Parametro extends javax.swing.JFrame {
    Connection con;
         public Parametro() {
        initComponents();
           
    }

    Parametro(Princippal aThis, boolean par) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pentot = new javax.swing.JTextField();
        ces_empleado = new javax.swing.JTextField();
        ces_empleador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cestot = new javax.swing.JTextField();
        pen_empleador = new javax.swing.JTextField();
        pen_empleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        stot = new javax.swing.JTextField();
        sempleador = new javax.swing.JTextField();
        sempleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        limpiar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pentot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pentotActionPerformed(evt);
            }
        });
        pentot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pentotKeyTyped(evt);
            }
        });

        ces_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ces_empleadoActionPerformed(evt);
            }
        });
        ces_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ces_empleadoKeyTyped(evt);
            }
        });

        ces_empleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ces_empleadorActionPerformed(evt);
            }
        });
        ces_empleador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ces_empleadorKeyTyped(evt);
            }
        });

        jLabel1.setText("Cesantias tot");

        jLabel3.setText("Ces empleado");

        cestot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cestotActionPerformed(evt);
            }
        });
        cestot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cestotKeyTyped(evt);
            }
        });

        pen_empleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pen_empleadorActionPerformed(evt);
            }
        });
        pen_empleador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pen_empleadorKeyTyped(evt);
            }
        });

        pen_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pen_empleadoActionPerformed(evt);
            }
        });
        pen_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pen_empleadoKeyTyped(evt);
            }
        });

        jLabel4.setText("Pensión empleado");

        jLabel5.setText("Pensión tot");

        jLabel6.setText("Pensión empleador");

        stot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stotActionPerformed(evt);
            }
        });
        stot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stotKeyTyped(evt);
            }
        });

        sempleador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sempleadorActionPerformed(evt);
            }
        });
        sempleador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sempleadorKeyTyped(evt);
            }
        });

        sempleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sempleadoActionPerformed(evt);
            }
        });
        sempleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sempleadoKeyTyped(evt);
            }
        });

        jLabel7.setText("Salud  tot");

        jLabel8.setText("Salud empleador");

        jLabel9.setText("Salud empleado");

        jLabel10.setText("Ces empleador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pentot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cestot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ces_empleador, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ces_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sempleador, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(sempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pen_empleador, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pen_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(160, 160, 160)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ces_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ces_empleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cestot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pentot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pen_empleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pen_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sempleador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel10)
                    .addContainerGap(134, Short.MAX_VALUE)))
        );

        jButton1.setLabel("transmitir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLabel2.setText("PARAMETRIZACIÓN");

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel2)))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Consultar)
                .addGap(32, 32, 32)
                .addComponent(Modificar)
                .addGap(43, 43, 43)
                .addComponent(limpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Modificar)
                    .addComponent(Consultar)
                    .addComponent(limpiar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pentotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pentotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pentotActionPerformed

    private void ces_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ces_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ces_empleadoActionPerformed

    private void ces_empleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ces_empleadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ces_empleadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

try {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Parametro.class.getName()).log(Level.SEVERE, null, ex);
    }
           con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/flexible","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO parametriza VALUES('"+cestot.getText()+"','"+ces_empleador.getText()+"','"+ces_empleado.getText()+"','"+pentot.getText()+"','"+pen_empleador.getText()+"','"+pen_empleado.getText()+"','"+stot.getText()+"','"+sempleador.getText()+"','"+sempleado.getText()+"')"); 
        } catch (SQLException ex) {
            Logger.getLogger(Parametro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cestotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cestotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cestotActionPerformed

    private void pen_empleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pen_empleadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pen_empleadorActionPerformed

    private void pen_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pen_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pen_empleadoActionPerformed

    private void stotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stotActionPerformed

    private void sempleadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sempleadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sempleadorActionPerformed

    private void sempleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sempleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sempleadoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
      
    }//GEN-LAST:event_ModificarActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
       
        try{
       con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/flexible","root","");
           PreparedStatement ps = con.prepareStatement("select * from parametriza");
           ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                cestot.setText(rs.getString("ctot"));
                ces_empleador.setText(rs.getString("cempleador"));
                ces_empleado.setText(rs.getString("cempleado"));
                pentot.setText(rs.getString("ptot"));
                pen_empleador.setText(rs.getString("pempleador"));
                pen_empleado.setText(rs.getString("pempleado"));
                stot.setText(rs.getString("stot"));
                sempleador.setText(rs.getString("sempleador"));
                sempleado.setText(rs.getString("sempleado"));             
            }
            
       }
        catch (Exception e) {
            System.err.println(e);
        }
                
         

    }//GEN-LAST:event_ConsultarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
          limpiar();
    }//GEN-LAST:event_limpiarActionPerformed

    private void cestotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cestotKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();        // TODO add your handling code here:
    }//GEN-LAST:event_cestotKeyTyped

    private void ces_empleadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ces_empleadorKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_ces_empleadorKeyTyped

    private void ces_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ces_empleadoKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_ces_empleadoKeyTyped

    private void pentotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pentotKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_pentotKeyTyped

    private void pen_empleadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pen_empleadorKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_pen_empleadorKeyTyped

    private void pen_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pen_empleadoKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_pen_empleadoKeyTyped

    private void stotKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stotKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_stotKeyTyped

    private void sempleadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sempleadorKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_sempleadorKeyTyped

    private void sempleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sempleadoKeyTyped
char c = evt.getKeyChar();
if (c<'0'|| c>'9') evt.consume();
    }//GEN-LAST:event_sempleadoKeyTyped

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
            java.util.logging.Logger.getLogger(Parametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parametro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parametro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField ces_empleado;
    private javax.swing.JTextField ces_empleador;
    private javax.swing.JTextField cestot;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField pen_empleado;
    private javax.swing.JTextField pen_empleador;
    private javax.swing.JTextField pentot;
    private javax.swing.JTextField sempleado;
    private javax.swing.JTextField sempleador;
    private javax.swing.JTextField stot;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
    cestot.setText("");
    ces_empleador.setText("");
    ces_empleado.setText("");
    pentot.setText("");
    pen_empleador.setText("");
    pen_empleado.setText("");
    stot.setText("");
    sempleador.setText("");
    sempleado.setText("");
    }
}
