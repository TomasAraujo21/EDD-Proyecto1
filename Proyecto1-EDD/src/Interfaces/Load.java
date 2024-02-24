package Interfaces;

/**
 * Interfaz en donde se va a poder cargar y guardar un grafo en formato ".txt".
 * @author Christian
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Load extends javax.swing.JFrame {

    /**
     * Se crea la ventana Load.
     */

    public static Main v1;
    
    public Load(Main v1) {
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
        check_icon = new javax.swing.JLabel();
        load_icon = new javax.swing.JLabel();
        TITULO_Principal = new javax.swing.JLabel();
        route = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LoadFile = new javax.swing.JTextArea();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        check_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkmark.png"))); // NOI18N
        jPanel1.add(check_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 30, 30));

        load_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/file.png"))); // NOI18N
        jPanel1.add(load_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 60, 60));

        TITULO_Principal.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        TITULO_Principal.setForeground(new java.awt.Color(255, 255, 255));
        TITULO_Principal.setText("Cargar grafo");
        jPanel1.add(TITULO_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        route.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(route, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 290, -1));

        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setText("Buscar");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, -1));

        LoadFile.setColumns(20);
        LoadFile.setForeground(new java.awt.Color(0, 0, 0));
        LoadFile.setRows(5);
        jScrollPane1.setViewportView(LoadFile);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 288, 178));

        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 80, 30));

        save.setForeground(new java.awt.Color(0, 0, 0));
        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 110, -1));

        background.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        background.setText("Gabriel Flores");
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        //Creo el Objeto JFileChooser
        JFileChooser fc = new JFileChooser();

        //Creo el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");

        //Le indico el filtro
        fc.setFileFilter(filtro);

        //Abrimos la ventana, guardamos la op seleccionada por el usuario
        int seleccion = fc.showOpenDialog(this);

        //Si el usario presiona aceptar
        if(seleccion == JFileChooser.APPROVE_OPTION){

            //Selecciono el fichero
            File fichero = fc.getSelectedFile();

            //Escribir la ruta del fichero
            this.route.setText(fichero.getAbsolutePath());

            try(FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                while(valor != -1){
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                this.LoadFile.setText(cadena);
            }catch (IOException e1){
                e1.printStackTrace();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se escogió un archivo válido");
        }
    }//GEN-LAST:event_searchActionPerformed
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

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
  
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args Se muestra en pantalla la ventana Load.
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
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Load.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Load(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea LoadFile;
    private javax.swing.JLabel TITULO_Principal;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel check_icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel load_icon;
    private javax.swing.JTextField route;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
