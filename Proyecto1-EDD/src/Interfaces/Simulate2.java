package Interfaces;

import org.graphstream.graph.*;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import Functions.ShowGraph;
    /**
     * Interfaz en donde se va a mostrar por pantalla el grafo creado.
     * @author Christian
     */
public class Simulate2 extends javax.swing.JFrame {

     /**
     * Se crea la ventana Simulate2.
     */
    public static Main v1;
    
    public Simulate2(Main v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * 
     * Código generado por NetBeans que contiene todo los datos de la interfaz
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        finish = new javax.swing.JButton();
        optimal_distance = new javax.swing.JScrollPane();
        optimal_route = new javax.swing.JScrollPane();
        show_graph = new javax.swing.JButton();
        graph_icon = new javax.swing.JLabel();
        TITULO_Principal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 108, -1, -1));

        finish.setForeground(new java.awt.Color(0, 0, 0));
        finish.setText("Finalizar");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        getContentPane().add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 130, 40));

        optimal_distance.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(optimal_distance, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 150, 30));

        optimal_route.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(optimal_route, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, 30));

        show_graph.setForeground(new java.awt.Color(0, 0, 0));
        show_graph.setText("Mostrar grafo");
        show_graph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_graphActionPerformed(evt);
            }
        });
        getContentPane().add(show_graph, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 130, 60));

        graph_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/graph.png"))); // NOI18N
        getContentPane().add(graph_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Grafo");
        getContentPane().add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ruta óptima:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 110, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Distancia óptima:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     *  Cierra la ventana actual y abre Main
     * @param evt El evento de acción desencadenado por el botón "Finalizar"
     */
    private void finishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Main window1 = new Main(b);
        window1.setVisible(true);
    }//GEN-LAST:event_finishActionPerformed

    private void show_graphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_graphActionPerformed

    System.setProperty("org.graphstream.ui", "swing");
    
    ShowGraph showGraph = new ShowGraph();

    showGraph.showGraph();
    }//GEN-LAST:event_show_graphActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Simulate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Se muestra en pantalla la ventana Simulate2 */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulate2(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JLabel background;
    private javax.swing.JButton finish;
    private javax.swing.JLabel graph_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane optimal_distance;
    private javax.swing.JScrollPane optimal_route;
    private javax.swing.JButton show_graph;
    // End of variables declaration//GEN-END:variables
}
