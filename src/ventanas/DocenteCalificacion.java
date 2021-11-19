package ventanas;

/**
 *
 * @author Harol
 */
import static java.lang.Integer.parseInt;
public class DocenteCalificacion extends javax.swing.JFrame {

    /**
     * Creates new form DocenteCalificacion
     */
    public DocenteCalificacion() {
        initComponents();
    }

    private void initComponents() {

        txt_estudiante = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_calificacionmaxima = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_calificacionminima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_estudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estudianteActionPerformed(evt);
            }
        });
        txt_estudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estudianteKeyTyped(evt);
            }
        });

        jLabel1.setText("Estudiante");

        txt_calificacionmaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_calificacionmaximaActionPerformed(evt);
            }
        });
        txt_calificacionmaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_calificacionmaximaKeyTyped(evt);
            }
        });

        jLabel2.setText("Calificacion Maxima");

        txt_calificacionminima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_calificacionminimaKeyTyped(evt);
            }
        });

        jLabel3.setText("Calificacion Obtenida");

        jLabel4.setText("Fecha de Trabajo");

        txt_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaActionPerformed(evt);
            }
        });
        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechaKeyTyped(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Calificacion de Trabajo");

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_calificacionmaxima, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_calificacionminima, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_estudiante)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel5)))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_calificacionmaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_calificacionminima, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jButton1)
                .addGap(48, 48, 48)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_estudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estudianteActionPerformed
        /*char c = evt.getKeyChar();
        if((c<'a' || c >'z') && (c<'A' || c>'Z')) evt.consume();
        // Debe de ser eliminado*/
    }//GEN-LAST:event_txt_estudianteActionPerformed

    private void txt_calificacionmaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_calificacionmaximaActionPerformed
        /*char c = evt.getKeyChar();
        if((c>'a' || c>'z') && (c>'A' ||c>'Z')) evt.consume();
        // Debe de ser eliminado*/
        
    }//GEN-LAST:event_txt_calificacionmaximaActionPerformed

    private void txt_estudianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estudianteKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z')) evt.consume();
    }//GEN-LAST:event_txt_estudianteKeyTyped

    private void txt_calificacionmaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_calificacionmaximaKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'.'))evt.consume();
    }//GEN-LAST:event_txt_calificacionmaximaKeyTyped

    private void txt_calificacionminimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_calificacionminimaKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9') && (c<'.' || c>'.'))evt.consume();
    }//GEN-LAST:event_txt_calificacionminimaKeyTyped

    private void txt_fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyTyped
        //char c = evt.getKeyChar();
        //if((c<'0' || c>'9') && (c<'/' || c>'/'))evt.consume();
    }//GEN-LAST:event_txt_fechaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String txtestudiante,txtfecha;
        txtestudiante = txt_estudiante.getText();
        int calificacionmaxima = parseInt(txt_calificacionmaxima.getText());
        int calificacionminima = parseInt(txt_calificacionminima.getText());
        txtfecha = txt_fecha.getText();
        
        if(txt_estudiante.getText().equals("") || (txt_calificacionmaxima.getText().equals("")) || 
                (txt_calificacionminima.getText().equals("")) || (txt_fecha.getText().equals(""))){
            javax.swing.JOptionPane.showMessageDialog(this,"Debe completar todos los espacios vacios\n","AVISO",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            ConectarBD c =new ConectarBD();
            String atrSentenciaInsert = String.format("INSERT INTO CALIFICACION (ID_CALIFICACION,NOMBRE_ESTUDIANTE,CALIFICACION_MAXIMA,CALIFICACION_OBTENIDA,FECHA_CALIFICACION)"
            + "VALUES (null,'"+txtestudiante+"','"+calificacionmaxima+"','"+calificacionminima+"','"+txtfecha+"')");
    
            c.ejecutarSentenciaSQL(atrSentenciaInsert);
            c.con.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
        this.vaciar();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PantallaDocente pantallaDocente = new PantallaDocente();
        pantallaDocente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaActionPerformed
        /*ELIMINAR!!!!!!*/
    }//GEN-LAST:event_txt_fechaActionPerformed


    public void vaciar(){
        txt_estudiante.setText("");
        txt_calificacionmaxima.setText("");
        txt_calificacionminima.setText("");
        txt_fecha.setText("");

        
    }
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
            java.util.logging.Logger.getLogger(DocenteCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocenteCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocenteCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocenteCalificacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocenteCalificacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_calificacionmaxima;
    private javax.swing.JTextField txt_calificacionminima;
    private javax.swing.JTextField txt_estudiante;
    private javax.swing.JTextField txt_fecha;
    // End of variables declaration//GEN-END:variables
}
