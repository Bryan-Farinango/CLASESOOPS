/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.util.*;
import javax.swing.Icon;
import javax.swing.JOptionPane;



public class HolaMundo extends javax.swing.JFrame {

    ArrayList list = new ArrayList();
    
    
    
    public HolaMundo() {
        initComponents(); //constructor que llama a initComponents --> configuraciones basicas de las ventanas
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTexto = new javax.swing.JLabel();
        txtTexto = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblDialogo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJuegos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtItems = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTexto.setText("Lista");

        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });

        btnOk.setText("Añadir a la lista");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        lblDialogo.setText("...");

        txtItems.setColumns(20);
        txtItems.setRows(5);
        jScrollPane1.setViewportView(txtItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOk)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(lblDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(107, 107, 107))
                    .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto)
                .addGap(170, 170, 170)
                .addComponent(txtJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lblTexto)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtJuegos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(txtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOk)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDialogo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //nos llevo aca despues de dale doble clic a "Ok"
    //btn ok arriba es lo que llamamos una clase abstracta
    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO 
       /* String txt = txtTexto.getText(); //nos devuelve el texto que tenga escrito el input 
        lblHello.setText("Hola " + txt);*/
       
       //String num = txtTexto.getText();
       //int numero = Integer.parseInt(num);
       //double numero = Double.parseDouble(num);
       //double res = ( 1.8 * numero ) +32;
       
       //String fin = Double.toString(res);
       //txtResultado.setText(fin);
       
       
       //muestra un mensaje
       
       /*if( numero > 10){
           //String txxt = txtTexto.getText();
           String txxt = "numero incorrecto";
           JOptionPane.showMessageDialog(rootPane, txxt, "Error", JOptionPane.ERROR_MESSAGE);
       }else{
           double res = ( 1.8 * numero ) +32;
       
           String fin = Double.toString(res);
           txtResultado.setText(fin);
       }
       */
       //String txxt = txtTexto.getText();
       
       //Icon Icon = new Icon(); ----> para implementar imagenes
       //JOptionPane.showMessageDialog(rootPane, txxt, "Error", JOptionPane.QUESTION_MESSAGE );
       //nos da la opcion de esta seguro /si/no
       
       //almaceno en entero porque devuelve un entero
        //si = 0; no = 1; cancelar = 2;
        
       String palabra = txtTexto.getText();
       String vacio = "     ";
       int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro?", "Confirmacion", JOptionPane.YES_NO_OPTION); //JOptionPane.WARNING_MESSAGE); //tambien tiene sobrecargas
       if ( option == 0){
           //lblConvertidor.setText(palabra);
           //txtResultado.setText(palabra);
           
           String txt1 = txtTexto.getText();
           
           this.list.add(txt1);
           JOptionPane.showMessageDialog(rootPane,"El item se ha añadido correctamente");
           //textarea recibe strings
           //item solo existe dentro del for each
           for(Object item : list){
               
               txtItems.setText((String)item);
           }
           
       }else if(option == 1){
           //lblConvertidor.setText(vacio);
           //txtResultado.setText(vacio);
           JOptionPane.showMessageDialog(rootPane, "El item no se ha añadido correctamente");
           
       }
      
      /* String dialogo = JOptionPane.showInputDialog("Ingrese el mensaje");
       lblDialogo.setText(dialogo);
       String op[] = new String[4];
       op[0] = "Call of dutty";
       op[1] = "Fifa 18";
       op[2] = "Agar.io";
       op[3] = "Hallo";
       
       int se = JOptionPane.showOptionDialog(rootPane, "Seleccione tu juego favorito","Juegos", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[3] );
       //String est = Interger.toString(se);
       
       
      //System.out.println("Selecciono " + se);
        txtJuegos.setText(se);
        //System.out.println("Usted Selecciono: " + option);
       
       agregar un switch ojo <---
       
       */
      
      //es un arreglo dinamico que el tamaño se va determinando mientras se ejecuta
      ArrayList list = new ArrayList();
      
      list.add("Hola");
      list.add(1);
      
        System.out.println("Posicion 0: " +  list.get(0));
      
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
        // TODO add your handling code here:
        
       
        
       
      
        
        
    }//GEN-LAST:event_txtTextoActionPerformed

    
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
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HolaMundo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {  //crea un proceso para poder correr una ventana
            public void run() {                           //crea una instancia de mi clase HolaMundo
                new HolaMundo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDialogo;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTextArea txtItems;
    private javax.swing.JTextField txtJuegos;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtTexto;
    // End of variables declaration//GEN-END:variables
}
