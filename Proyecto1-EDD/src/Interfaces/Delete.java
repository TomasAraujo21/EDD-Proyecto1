package Interfaces;

/**
 * Interfaz en donde se va a poder eliminar una cantidad específica de ciudades.
 * @author Christian
 */
import EDD.Vertex;
import Functions.GraphFunc;
import static Interfaces.Main.graph;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class Delete extends javax.swing.JFrame {

    /**
     * Se crea la ventana Delete.
     */
    DefaultComboBoxModel comboModel = new DefaultComboBoxModel(); 
    public static Main v1;
    
    public Delete(Main v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        for (int i = 0; i < graph.numberCities(); i++) {
            Vertex vertexAux = (Vertex) graph.getCities().getValor(i);
            comboModel.addElement(vertexAux.getNumCity());
            
        }
    }

    /**
     * 
     * Código generado por NetBeans que contiene todo los datos de la interfaz
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cross_icon = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        TITULO_Principal = new javax.swing.JLabel();
        comboDelete = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cross_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N
        getContentPane().add(cross_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 30, 30));

        city_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cities.png"))); // NOI18N
        getContentPane().add(city_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 60, 60));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cantidad de ciudades que deseas eliminar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 109, 51));

        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 102, 52));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Eliminar ciudad");
        getContentPane().add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        comboDelete.setModel(comboModel
        );
        comboDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(comboDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        deleteindex();
                
    }//GEN-LAST:event_deleteActionPerformed
    /**
     *  Cierra la ventana actual y abre Main
     * @param evt El evento de acción desencadenado por el botón "Volver"
     */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Main window1 = new Main(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void comboDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboDeleteActionPerformed

    /**
     * @param args Se muestra en pantalla la ventana Delete.
     */
    public DefaultListModel deleteindex(){
        DefaultListModel model = (DefaultListModel) comboDelete.getModel();
        model.remove(comboDelete.getSelectedIndex());
        return model;
    }
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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Se muestra en pantalla la ventana Delete */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel city_icon;
    private javax.swing.JComboBox<String> comboDelete;
    private javax.swing.JLabel cross_icon;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
