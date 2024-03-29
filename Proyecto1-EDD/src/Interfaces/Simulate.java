package Interfaces;

/**
 * Interfaz en donde se va a mostrar por pantalla los datos del grafo cargados anteriormente. 
 * @author Christian
 */
import EDD.Vertex;
import static Interfaces.Main.graph;
import javax.swing.DefaultComboBoxModel;

public class Simulate extends javax.swing.JFrame {

    /**
     * Se crea la ventana Simulate.
     */
    public static Main v1;
    DefaultComboBoxModel comboModel1 = new DefaultComboBoxModel(); 
    DefaultComboBoxModel comboModel2 = new DefaultComboBoxModel(); 
    
    public Simulate(Main v1) {
        initComponents();
        this.v1 = v1;
        v1.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        for (int i = 0; i < graph.numberCities(); i++) {
            Vertex currentVertex = (Vertex)graph.getCities().getValor(i);
            comboModel1.addElement(currentVertex.getNumCity());
            comboModel2.addElement(currentVertex.getNumCity());
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

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        run = new javax.swing.JButton();
        back = new javax.swing.JButton();
        alpha = new javax.swing.JTextField();
        beta = new javax.swing.JTextField();
        rho = new javax.swing.JTextField();
        number_ants = new javax.swing.JTextField();
        number_cycles = new javax.swing.JTextField();
        TITULO_Principal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        start_icon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 108, -1, -1));

        jComboBox1.setModel(comboModel2);
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 70, 30));

        jComboBox2.setModel(comboModel1);
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 70, 30));

        run.setForeground(new java.awt.Color(0, 0, 0));
        run.setText("Iniciar");
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        getContentPane().add(run, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 90, 50));

        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 50));

        alpha.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(alpha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 80, 30));

        beta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 80, 30));

        rho.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(rho, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 80, 30));

        number_ants.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(number_ants, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 80, 30));

        number_cycles.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(number_cycles, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 30));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Empezar simulación");
        getContentPane().add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Número de ciclos:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Número de hormigas:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 180, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Rho:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 40, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Beta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 60, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Alpha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Ciudad destino:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Ciudad inicial:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 30));

        start_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start.png"))); // NOI18N
        getContentPane().add(start_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("C");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents
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
    /**
     *  Cierra la ventana actual y abre Simulate2
     * @param evt El evento de acción desencadenado por el botón "Iniciar"
     */
    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        this.setVisible(false);
        Welcome x = new Welcome();
        Main b = new Main(x);
        Simulate2 windows2 = new Simulate2(b);
        windows2.setVisible(true);
    }//GEN-LAST:event_runActionPerformed

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
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Se muestra en pantalla la ventana Simulate */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulate(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JTextField alpha;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField beta;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField number_ants;
    private javax.swing.JTextField number_cycles;
    private javax.swing.JTextField rho;
    private javax.swing.JButton run;
    private javax.swing.JLabel start_icon;
    // End of variables declaration//GEN-END:variables
}
