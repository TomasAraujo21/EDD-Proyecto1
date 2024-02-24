package Interfaces;

import javax.swing.JOptionPane;

/**
 * Interfaz de bienvenida en donde se encuentra un breve resúmen del programa, sus funcionalidades
 * y los autores de la misma.
 * @author Christian
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Se crea la ventana Welcome.
     */
    public Welcome() {
        initComponents();
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

        next = new javax.swing.JButton();
        check_icon = new javax.swing.JLabel();
        ant_colony1 = new javax.swing.JLabel();
        ant_colony = new javax.swing.JLabel();
        TITULO_Principal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setForeground(new java.awt.Color(0, 0, 0));
        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 40));

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/team.png"))); // NOI18N
        getContentPane().add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 80, 80));

        ant_colony1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow.png"))); // NOI18N
        getContentPane().add(ant_colony1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 120, 91));

        ant_colony.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/antcolony.png"))); // NOI18N
        getContentPane().add(ant_colony, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 210, 161));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Bienvenido!");
        getContentPane().add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Presiona siguiente para continuar");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 280, 40));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido a nuestro proyecto de algoritmo de optimización");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 570, 40));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("basado en el comportamiento de las colonias de hormigas.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 540, 40));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Podrás elegir entre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 310, 40));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Christian Rodríguez");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 40));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("- Eliminar ciudad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 150, 40));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Cargar grafo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 120, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Empezar simulación");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 190, 40));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Añadir ciudad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 40));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hecho por:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 80, 40));

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tomás Araujo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 90, 40));

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Gabriel Flores");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 100, 40));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
    * Muestra un mensaje indicando que debe de cargar un grafo antes de comenzar.
    * Cierra la ventana actual y abre Load.
    * @param evt El evento de acción desencadenado por el botón "Siguiente"
    */
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        JOptionPane.showMessageDialog(null, "Debes de cargar un grafo antes de comenzar el programa!");
        this.setVisible(false);
        Main window = new Main(this);
        Load window1 = new Load(window);
        window1.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Se muestra en pantalla la ventana Welcome */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JLabel ant_colony;
    private javax.swing.JLabel ant_colony1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel check_icon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton next;
    // End of variables declaration//GEN-END:variables
}
