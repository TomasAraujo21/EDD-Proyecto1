/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author 58414
 */

import EDD.Edge;
import EDD.Vertex;
import EDD.Graph;
import static Interfaces.Main.graph;
import javax.swing.JOptionPane;

public class Add2 extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public static Main v1;
    
    public Add2(Main v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add_icon = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        agg_arista = new javax.swing.JButton();
        input_weight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        TITULO_Principal = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        jPanel1.add(add_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 30, 30));

        city_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cities.png"))); // NOI18N
        jPanel1.add(city_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        agg_arista.setForeground(new java.awt.Color(0, 0, 0));
        agg_arista.setText("Añadir arista");
        agg_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agg_aristaActionPerformed(evt);
            }
        });
        jPanel1.add(agg_arista, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, -1));

        input_weight.setForeground(new java.awt.Color(0, 0, 0));
        input_weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_weightActionPerformed(evt);
            }
        });
        jPanel1.add(input_weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Peso:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Finalizar");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 90, 50));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Añadir caminos");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agg_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agg_aristaActionPerformed
        double weight = Double.parseDouble(input_weight.getText());
       
        if(graph.findCity(vertex2)){
            Edge edge = new Edge(graph.findCity2(Integer.parseInt(input_vertex.getText())), graph.findCity2(num), weight);
            graph.findcity2(Integer.parseInt(input_vertex.getText())).getListAdy().InsertarFinal(edge);
            JOptionPane.showMessageDialog(null, "Arista añadida con éxito");
        }else{
            JOptionPane.showMessageDialog(null, "No se puede añadir la arista");
        }

    }//GEN-LAST:event_agg_aristaActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Main window1 = new Main(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void input_weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_weightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_weightActionPerformed

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
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add2(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JLabel add_icon;
    private javax.swing.JButton agg_arista;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel city_icon;
    private javax.swing.JTextField input_weight;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
