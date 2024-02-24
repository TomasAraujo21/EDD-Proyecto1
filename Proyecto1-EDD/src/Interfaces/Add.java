package Interfaces;



import EDD.Edge;
import EDD.Vertex;
import EDD.Graph;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add_icon = new javax.swing.JLabel();
        city_icon = new javax.swing.JLabel();
        add_vertex = new javax.swing.JButton();
        agg_aristaAndPeso = new javax.swing.JButton();
        input_vertex = new javax.swing.JTextField();
        input_arista = new javax.swing.JTextField();
        input_weight = new javax.swing.JTextField();
        finish = new javax.swing.JButton();
        back = new javax.swing.JButton();
        TITULO_Principal = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Número del vértice:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arista:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Peso:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

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
        jPanel1.add(add_vertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 130, -1));

        agg_aristaAndPeso.setForeground(new java.awt.Color(0, 0, 0));
        agg_aristaAndPeso.setText("Añadir peso y arista");
        agg_aristaAndPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agg_aristaAndPesoActionPerformed(evt);
            }
        });
        jPanel1.add(agg_aristaAndPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 160, 40));

        input_vertex.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(input_vertex, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, -1));

        input_arista.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(input_arista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, -1));

        input_weight.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(input_weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 160, -1));

        finish.setForeground(new java.awt.Color(0, 0, 0));
        finish.setText("Finalizar");
        finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishActionPerformed(evt);
            }
        });
        jPanel1.add(finish, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 90, 50));

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

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 *  Acción del botón Agregar arista y peso.
 *  Agrega una nueva Arista y Peso con el respectivo número al grafo.
 * @param evt El evento de acción desencadenado por el botón "Agregar arista y peso"
 */
    private void agg_aristaAndPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agg_aristaAndPesoActionPerformed
        // Cambia input_arista a número
        int num = Integer.parseInt(input_arista.getText());
        
        // Crea un nuevo vertice con el número dado
        Vertex vertex2 = new Vertex(num);
        
        // Cambia input_weight a número
        int weight = Integer.parseInt(input_weight.getText());
        
        // Chequea si el vértice ya existe en el gráfico
        if(graph.findCity(vertex2)){
            
            // Crea una nueva arista con el vértice dado y el peso
            Edge edge = new Edge(graph.findCity2(Integer.parseInt(input_vertex.getText())), graph.findCity2(num), weight);
            
            // Añade la arista a la lista de adyacencia del vértice.
            graph.findCity2(Integer.parseInt(input_vertex.getText())).getListAdy().InsertarFinal(edge);
            
            // Muestra un mensaje de éxito.
            JOptionPane.showMessageDialog(null, "Arista y peso añadido con éxito");
        }else{
            // Muestra un mensaje de error si no se puede añadir la arista y el peso.
            JOptionPane.showMessageDialog(null, "No se puede añadir la arista y el peso");
        }
    }//GEN-LAST:event_agg_aristaAndPesoActionPerformed
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
            
            // Añade el vertice al grafo
            graph.addCity(vertexAux);
            
            // Muestra un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Vértice creado con éxito");
            
            // Cierra la ventana actual y abre Main
            this.setVisible(false);
            Welcome b = new Welcome();
            Main window1 = new Main(b);
            window1.setVisible(true);
        } catch (NumberFormatException ex) {
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
    private javax.swing.JButton agg_aristaAndPeso;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel city_icon;
    private javax.swing.JButton finish;
    private javax.swing.JTextField input_arista;
    private javax.swing.JTextField input_vertex;
    private javax.swing.JTextField input_weight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
