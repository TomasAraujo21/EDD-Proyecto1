package Interfaces;


import EDD.Graph;
import javax.swing.JOptionPane;

/**
 * Interfaz en donde se va a poder navegar entre las distintas interfaces y funcionalidades del programa.
 * @author Christian
 */
public class Main extends javax.swing.JFrame {

    /**
     * Se crea la ventana Main.
     */
    
    public static Welcome v1;
    public static Graph graph = new Graph();
    
    public Main(Welcome v1) {
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
        add_icon = new javax.swing.JLabel();
        cross_icon = new javax.swing.JLabel();
        start_icon = new javax.swing.JLabel();
        check_icon = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        load_icon = new javax.swing.JLabel();
        city_icon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        load = new javax.swing.JButton();
        simulate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TITULO_Principal = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        jPanel1.add(add_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, 30));

        cross_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cross.png"))); // NOI18N
        jPanel1.add(cross_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 30, 30));

        start_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start.png"))); // NOI18N
        jPanel1.add(start_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkmark.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 30, 30));

        city_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cities.png"))); // NOI18N
        jPanel1.add(city_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        load_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file.png"))); // NOI18N
        jPanel1.add(load_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        city_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cities.png"))); // NOI18N
        jPanel1.add(city_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Eliminar ciudad:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        add.setForeground(new java.awt.Color(0, 0, 0));
        add.setText("Añadir");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 117, 48));

        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.setText("Eliminar");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 117, 48));

        load.setForeground(new java.awt.Color(0, 0, 0));
        load.setText("Cargar");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        jPanel1.add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 117, 48));

        simulate.setForeground(new java.awt.Color(0, 0, 0));
        simulate.setText("Simular");
        simulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simulateActionPerformed(evt);
            }
        });
        jPanel1.add(simulate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 117, 48));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Añadir ciudad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empezar simulación:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cargar grafo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Escoge una opción:");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     *  Cierra la ventana actual y abre Load
     * @param evt El evento de acción desencadenado por el botón "Cargar"
     */
    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        Load load = new Load(this);
        this.setVisible(false);
        load.setVisible(true);
    }//GEN-LAST:event_loadActionPerformed
    /**
     *  Cierra la ventana actual y abre Simulate
     * @param evt El evento de acción desencadenado por el botón "Simular"
     */
    private void simulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simulateActionPerformed
        Simulate simulate = new Simulate(this);
        this.setVisible(false);
        simulate.setVisible(true);
    }//GEN-LAST:event_simulateActionPerformed
    /**
     *  Cierra la ventana actual y abre Delete
     * @param evt El evento de acción desencadenado por el botón "Eliminar"
     */
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        Delete delete = new Delete(this);
        this.setVisible(false);
        delete.setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed
    /**
     *  Cierra la ventana actual y abre Add
     * @param evt El evento de acción desencadenado por el botón "Añadir"
     */
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Add add = new Add(this);
        this.setVisible(false);
        add.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    /**
     * @param args Se muestra en pantalla la ventana Main.
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton add;
    private javax.swing.JLabel add_icon;
    private javax.swing.JLabel background;
    private javax.swing.JLabel check_icon;
    private javax.swing.JLabel city_icon;
    private javax.swing.JLabel city_icon1;
    private javax.swing.JLabel cross_icon;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton load;
    private javax.swing.JLabel load_icon;
    private javax.swing.JButton simulate;
    private javax.swing.JLabel start_icon;
    // End of variables declaration//GEN-END:variables
}
