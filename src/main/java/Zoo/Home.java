/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Zoo;

/**
 *
 * @author migue
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_Archivo = new javax.swing.JMenu();
        item_salir = new javax.swing.JMenuItem();
        jmOpciones = new javax.swing.JMenu();
        item_habitat = new javax.swing.JMenuItem();
        itemAlimento = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jm_Archivo.setText("Archivo");
        jm_Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_ArchivoActionPerformed(evt);
            }
        });

        item_salir.setText("Salir");
        item_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_salirActionPerformed(evt);
            }
        });
        jm_Archivo.add(item_salir);

        jMenuBar1.add(jm_Archivo);

        jmOpciones.setText("Opciones");

        item_habitat.setText("Habitat");
        item_habitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_habitatActionPerformed(evt);
            }
        });
        jmOpciones.add(item_habitat);

        itemAlimento.setText("Alimento");
        itemAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAlimentoActionPerformed(evt);
            }
        });
        jmOpciones.add(itemAlimento);

        jMenuBar1.add(jmOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_ArchivoActionPerformed
        
    }//GEN-LAST:event_jm_ArchivoActionPerformed

    private void item_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_item_salirActionPerformed

    private void item_habitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_habitatActionPerformed
        habitat ventanaHabitat = new habitat();
        escritorio.add(ventanaHabitat);
        ventanaHabitat.show();
    }//GEN-LAST:event_item_habitatActionPerformed

    private void itemAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAlimentoActionPerformed
        Alimento ventanaAlimento = new Alimento();
        escritorio.add(ventanaAlimento);
        ventanaAlimento.show();
    }//GEN-LAST:event_itemAlimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemAlimento;
    private javax.swing.JMenuItem item_habitat;
    private javax.swing.JMenuItem item_salir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmOpciones;
    private javax.swing.JMenu jm_Archivo;
    // End of variables declaration//GEN-END:variables
}
