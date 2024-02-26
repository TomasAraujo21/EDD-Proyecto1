package Interfaces;



import EDD.Edge;
import EDD.Vertex;
import EDD.Graph;
import Functions.Helpers;
import static Interfaces.Main.graph;
import javax.swing.JOptionPane;

/**
 * Interfaz en donde se van a poder añadir ciudades, su peso y su arista.
 * @author Christian
 */

public class Add extends javax.swing.JFrame {

   /**
     * Se crea la ventana Add.
     */
    public static Main v1;
        /**
         * Construye un nuevo Objeto Add
         * @param v1 Implementación del constructor
         */
    public Add(Main v1) {
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
        jLabel1 = new javax.swing.JLabel();
        add_icon = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        add_vertex = new javax.swing.JButton();
        input_vertex = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        TITULO_Principal = new javax.swing.JLabel();
<<<<<<< HEAD
        next = new javax.swing.JButton();
=======
        step2 = new javax.swing.JButton();
>>>>>>> b50a47fc21b21679d96561998a872afaf6db7d1e
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número del vértice:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        add_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
        jPanel1.add(add_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 30, 30));

        city_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cities.png"))); // NOI18N
        jPanel1.add(city_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        add_vertex.setForeground(new java.awt.Color(0, 0, 0));
        add_vertex.setText("Añadir vértice");
        add_vertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_vertexActionPerformed(evt);
            }
        });
        jPanel1.add(add_vertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 130, -1));

        input_vertex.setForeground(new java.awt.Color(0, 0, 0));
        input_vertex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_vertexActionPerformed(evt);
            }
        });
        jPanel1.add(input_vertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 160, -1));

        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 50));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Añadir ciudad");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

<<<<<<< HEAD
        next.setForeground(new java.awt.Color(0, 0, 0));
        next.setText("Siguiente");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        jPanel1.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 50));
=======
        step2.setText("siguiente");
        step2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                step2ActionPerformed(evt);
            }
        });
        jPanel1.add(step2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 90, 50));
>>>>>>> b50a47fc21b21679d96561998a872afaf6db7d1e

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     *  Cierra la ventana actual y abre Main
     * @param evt El evento de acción desencadenado por el botón "Finalizar"
     */
    private void add_vertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_vertexActionPerformed
        try {
            // Cambia input_vertex a número.
            int num = Integer.parseInt(input_vertex.getText());
            
            // Crea un nuevo vertice con el número dado
            Vertex vertexAux = new Vertex(num);
            
            if(!graph.findCity(vertexAux)){
                graph.addCity(vertexAux);
            
                // Muestra un mensaje de éxito
                JOptionPane.showMessageDialog(null, "Vértice creado con éxito");

<<<<<<< HEAD
            // Muestra un mensaje de error si el vértice ya existe   
=======
                // Cierra la ventana actual y abre Main
                
>>>>>>> b50a47fc21b21679d96561998a872afaf6db7d1e
            } else{
                JOptionPane.showMessageDialog(null, "El vértice ya existe!");
            }
        }catch (NumberFormatException ex) {
            // Muestra un mensaje de error si introduces un dato inválido.
            JOptionPane.showMessageDialog(null, "Introduzca un dato válido");
        }
    }//GEN-LAST:event_add_vertexActionPerformed
    /**
     *  Cierra la ventana actual y abre Main.
     * @param evt El evento de acción desencadenado por el botón "Volver"
     */
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Main window1 = new Main(b);
        window1.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void input_vertexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_vertexActionPerformed
        
    }//GEN-LAST:event_input_vertexActionPerformed

<<<<<<< HEAD
    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        this.setVisible(false);
        Welcome q = new Welcome();
        Main x = new Main(q);
        Add i = new Add(x);
        Add2 window2 = new Add2(i);
        window2.setVisible(true);
    }//GEN-LAST:event_nextActionPerformed
=======
    private void step2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_step2ActionPerformed
        this.setVisible(false);
        Welcome b = new Welcome();
        Add2 window1 = new Add2(this);
        window1.setVisible(true);
    }//GEN-LAST:event_step2ActionPerformed
>>>>>>> b50a47fc21b21679d96561998a872afaf6db7d1e

    /**
     * @param args Se muestra en pantalla la ventana Add
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JLabel add_icon;
    private javax.swing.JButton add_vertex;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel city_icon;
    private javax.swing.JTextField input_vertex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
<<<<<<< HEAD
    private javax.swing.JButton next;
=======
    private javax.swing.JButton step2;
>>>>>>> b50a47fc21b21679d96561998a872afaf6db7d1e
    // End of variables declaration//GEN-END:variables
}
