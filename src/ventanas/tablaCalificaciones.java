package ventanas;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class tablaCalificaciones extends javax.swing.JFrame {

    public tablaCalificaciones() {
 
        setTitle("Plataforma EDUCAR");
        setSize(600,600); 
        setLocationRelativeTo(null);
        initComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // conexión a la base de datos
        try{
        
            DefaultTableModel modelo = new DefaultTableModel();
            JTcalificaciones.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs= null;
            ConectarBD con= new ConectarBD();
            Connection connection =  con.getConectarBD();
            
            String sql = "SELECT "
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd= rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn(TIPO PRUEBA);
            modelo.addColumn(VALOR DE LA PRUEBA);
            modelo.addColumn(CALIFICACION OBTENIDA);
            modelo.addColumn(FECHA DE LA PRUEBA);
            modelo.addColumn(LUGAR DE LA PRUEBA);
            modelo.addColumn(FECHA DE REVISIÓN);

            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                for (int i=0; i< cantidadColumnas; i++){
                   filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
        } catch(SQLException ex){
            System.err.println(ex.toString());
        }
    }

    private void initComponents() {

        PanelContenido = new javax.swing.JPanel();
        JTcalificaciones = new javax.swing.JTable();
        tituloTabla = new javax.swing.JLabel();
        JBcontrasenha = new javax.swing.JButton();
        JBatras = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        JLlogoPlataforma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenido.setName(""); // NOI18N
        PanelContenido.setPreferredSize(new java.awt.Dimension(600, 600));
        //PanelContenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTcalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro", "TIPO PRUEBA", "VALOR DE LA PRUEBA", "CALIFICACION OBTENIDA", "FECHA DE LA PRUEBA", "LUGAR DE LA PRUEBA", "FECHA DE REVISIÓN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        tituloTabla.setBackground(new java.awt.Color(153, 153, 153));
        tituloTabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tituloTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloTabla.setText("MIS EVALUACIONES");
        //PanelContenido.add(tituloTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        JBcontrasenha.setText("CONTRASEÑA");
        JBcontrasenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcontrasenhaActionPerformed(evt);
            }
        });
        PanelContenido.add(JBcontrasenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        JBatras.setText("ATRAS");
        JBatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBatrasActionPerformed(evt);
            }
        });
        PanelContenido.add(JBatras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        jTextField1.setText("jTextField1");
        PanelContenido.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 20));

        JLlogoPlataforma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        JLlogoPlataforma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLlogoPlataforma.setText("PLATAFORMA EDUCAR");
        JLlogoPlataforma.setToolTipText("");
        JLlogoPlataforma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLlogoPlataforma)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JLlogoPlataforma)
                .addGap(8, 8, 8)
                .addComponent(PanelContenido, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>                        

    private void JBcontrasenhaActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void JBatrasActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(tablaCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaCalificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaCalificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton JBatras;
    private javax.swing.JButton JBcontrasenha;
    private javax.swing.JLabel JLlogoPlataforma;
    private javax.swing.JTable JTcalificaciones;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel tituloTabla;
    // End of variables declaration                   
}
}