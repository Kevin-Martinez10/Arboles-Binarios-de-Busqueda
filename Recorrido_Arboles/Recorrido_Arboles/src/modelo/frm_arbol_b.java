/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author paiz2
 */
public class frm_arbol_b extends javax.swing.JFrame {
String strRecorrido = "";
    /**
     * Creates new form frm_arbol_b
     */
    public frm_arbol_b() {
        initComponents();
         txtConsola.setText("Programa iniciado correctamente..." + System.lineSeparator());
        
        btnLimpiarArbol.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        j_arbol = new javax.swing.JTree();
        btn_agregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtConsola = new javax.swing.JTextArea();
        btnLimpiarArbol = new javax.swing.JButton();
        btnPreorden = new javax.swing.JButton();
        btnOrden = new javax.swing.JButton();
        btnPostorden = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(j_arbol);

        btn_agregar.setText("Agregar Millon de Numeros");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        txtConsola.setColumns(20);
        txtConsola.setRows(5);
        jScrollPane2.setViewportView(txtConsola);

        btnLimpiarArbol.setText("Limpiar");
        btnLimpiarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarArbolActionPerformed(evt);
            }
        });

        btnPreorden.setText("Preorden");
        btnPreorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreordenActionPerformed(evt);
            }
        });

        btnOrden.setText("Inorden");
        btnOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenActionPerformed(evt);
            }
        });

        btnPostorden.setText("Postorden");
        btnPostorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostordenActionPerformed(evt);
            }
        });

        txtTitulo.setText("ARBOL BINARIO DE BUSQUEDA - UMG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTitulo)
                                        .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(btnPreorden, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPostorden, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(btnLimpiarArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(191, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPreorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPostorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarArbol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
         
            
            Random dado = new Random();
             for(int i=0; i<25;i++){
                   int valorNuevo = 0;
                  do{
                   valorNuevo=dado.nextInt();
                     }while(valorNuevo<0);
            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
                 System.out.println("Nuevo nodo No. ("+(i+1)+") agregado. Espere por favor, esto puede demorar varios minutos");
            if(nodoRaiz != null)
            {
                DefaultMutableTreeNode nodoAuxiliar = nodoRaiz;
                DefaultMutableTreeNode nodoPadre;
                boolean arbol = true;
                while(arbol){
                    nodoPadre = nodoAuxiliar;
                    String s = nodoAuxiliar.getUserObject().toString().split("-")[1].trim();
                    int valorNodoActual = Integer.parseInt(s);
                    if(valorNuevo < valorNodoActual){
                        nodoAuxiliar = (DefaultMutableTreeNode) nodoAuxiliar.getFirstChild();
                        
                        if(nodoAuxiliar.getUserObject().toString().equals("I - NULL"))
                        {
                            nodoAuxiliar.setUserObject("I - " + valorNuevo);
                            nodoAuxiliar.add(new DefaultMutableTreeNode("I - NULL"));
                            nodoAuxiliar.add(new DefaultMutableTreeNode("D - NULL"));
                            
                         txtConsola.setText(txtConsola.getText() + "Nuevo nodo No. ("+(i+1)+") agregado: " +valorNuevo + System.lineSeparator());
                            arbol = false;
                        }
                    }
                    else
                    {
                        nodoAuxiliar = (DefaultMutableTreeNode) nodoAuxiliar.getLastChild();
                        
                        if(nodoAuxiliar.getUserObject().toString().equals("D - NULL"))
                        {
                            nodoAuxiliar.setUserObject("D - " + valorNuevo);
                            nodoAuxiliar.add(new DefaultMutableTreeNode("I - NULL"));
                            nodoAuxiliar.add(new DefaultMutableTreeNode("D - NULL"));
                            
                           txtConsola.setText(txtConsola.getText() + "Nuevo nodo No. ("+(i+1)+") agregado: " + valorNuevo + System.lineSeparator());
                           arbol = false;
                        }
                    }
                }
            }
            else {               
                              
                nodoRaiz = new DefaultMutableTreeNode("R - " + valorNuevo);
                DefaultMutableTreeNode nodoIzquierdo = new DefaultMutableTreeNode("I - NULL");
                DefaultMutableTreeNode nodoDerecho = new DefaultMutableTreeNode("D - NULL");
                
                nodoRaiz.add(nodoIzquierdo);
                nodoRaiz.add(nodoDerecho);
                
                DefaultTreeModel modeloArbol = (DefaultTreeModel) j_arbol.getModel();
                modeloArbol.setRoot(nodoRaiz);
                
               txtConsola.setText(txtConsola.getText() + "Nodo RA??Z agregado: " + valorNuevo + System.lineSeparator());
            }

        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btnLimpiarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarArbolActionPerformed
        try
        {
            DefaultTreeModel modeloArbol = (DefaultTreeModel) j_arbol.getModel();
            modeloArbol.setRoot(null);

            txtConsola.setText(txtConsola.getText() + "??Vaciado del ??rbol! " + System.lineSeparator());
            txtConsola.setText("");
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnLimpiarArbolActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnLimpiarArbolActionPerformed

    private void btnPreordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreordenActionPerformed
        try{
            if(j_arbol.getModel().getRoot() == null)
            throw new Exception("??Ning??n nodo en el ??rbol para recorrer!");

            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
            txtConsola.setText(txtConsola.getText() + "Recorrido PREORDEN: ");

            strRecorrido = "";
            RecorridoPreorden(nodoRaiz);
            txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnPreordenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnPreordenActionPerformed

    private void btnOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenActionPerformed
       try{
            if(j_arbol.getModel().getRoot() == null)
            throw new Exception("??Ning??n nodo en el ??rbol para recorrer!");

            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
            txtConsola.setText(txtConsola.getText() + "Recorrido INORDEN: ");

            strRecorrido = "";
            RecorridoInorden(nodoRaiz);
            txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnPreordenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnOrdenActionPerformed

    private void btnPostordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostordenActionPerformed
        try{
            if(j_arbol.getModel().getRoot() == null)
            throw new Exception("??Ning??n nodo en el ??rbol para recorrer!");

            DefaultMutableTreeNode nodoRaiz = (DefaultMutableTreeNode) j_arbol.getModel().getRoot();
            txtConsola.setText(txtConsola.getText() + "Recorrido POSTORDEN: ");

            strRecorrido = "";
            RecorridoPostorden(nodoRaiz);
            txtConsola.setText(txtConsola.getText() + strRecorrido.substring(0, strRecorrido.length() - 3) + "." + System.lineSeparator());
        }catch(Exception ex)
        {
            txtConsola.setText(txtConsola.getText() + "Error en btnPreordenActionPerformed(): " + ex.getMessage() + System.lineSeparator());
        }
    }//GEN-LAST:event_btnPostordenActionPerformed
public void RecorridoPreorden(DefaultMutableTreeNode nodoRaiz)
    {
        if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
        {
            strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
            RecorridoPreorden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
            RecorridoPreorden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
        }
    }
public void RecorridoInorden(DefaultMutableTreeNode nodoRaiz)
    {
        if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
        {
            
            RecorridoInorden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
            strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
            RecorridoInorden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
        }
    }
public void RecorridoPostorden(DefaultMutableTreeNode nodoRaiz)
    {
        if(!nodoRaiz.getUserObject().toString().equals("I - NULL") && !nodoRaiz.getUserObject().toString().equals("D - NULL"))
        {
            
            RecorridoPostorden((DefaultMutableTreeNode) nodoRaiz.getFirstChild());
            RecorridoPostorden((DefaultMutableTreeNode) nodoRaiz.getLastChild());
            strRecorrido += nodoRaiz.getUserObject().toString().split("-")[1].trim() + " - ";
        }
    }

    
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
            java.util.logging.Logger.getLogger(frm_arbol_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_arbol_b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_arbol_b().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarArbol;
    private javax.swing.JButton btnOrden;
    private javax.swing.JButton btnPostorden;
    private javax.swing.JButton btnPreorden;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree j_arbol;
    private javax.swing.JTextArea txtConsola;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
