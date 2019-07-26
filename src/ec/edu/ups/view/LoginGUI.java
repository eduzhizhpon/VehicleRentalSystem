/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.view;

import ec.edu.ups.conectionDB.ConnectionJava;
import ec.edu.ups.controller.UserController;
import ec.edu.ups.model.Employee;
import ec.edu.ups.model.User;
import ec.edu.ups.services.Services;
import javax.swing.JOptionPane;

/**
 *
 * @author edd
 */
public class LoginGUI extends javax.swing.JFrame {

    private Services services;
    
    private UserController conUser;
    private ConnectionJava connection;
    
    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        connection = new ConnectionJava();
        services = new Services();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        passwordLb = new javax.swing.JLabel();
        userLb = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        loginBt = new javax.swing.JButton();
        image = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(940, 560));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 933, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        inputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordLb.setText("Contraseña:");
        inputPanel.add(passwordLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 70, 40));

        userLb.setText("Usuario:");
        inputPanel.add(userLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 40));

        usernameTxt.setOpaque(false);
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        inputPanel.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, 40));

        passwordTxt.setOpaque(false);
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        inputPanel.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 340, 40));

        loginBt.setText("Ingresar");
        loginBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtActionPerformed(evt);
            }
        });
        inputPanel.add(loginBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 30));

        image.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void loginBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtActionPerformed
        
        try{
            
            char [] input = this.passwordTxt.getPassword();
            
            String passMd5 = services.getMd5(String.valueOf(input));
            
            startConnection(this.usernameTxt.getText(), String.valueOf(input));
            
            conUser = new UserController();
            User user = new User();
            
            
            conUser.readUser(connection, user, usernameTxt.getText());
            
            if (rootPaneCheckingEnabled) {
                
            }
            
            MainGUI m = new MainGUI(user, connection);
            
            m.setVisible(true);
            
            dispose();
            
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error en el nombre de usuario"
                    + " o la contraseña."
                    + "\n" + ex);
            
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_loginBtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void startConnection(String username, String password){
        this.connection = new ConnectionJava();
        try{
            this.connection.startConnection(username, password);
        } catch (NullPointerException e){
            throw e;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel image;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBt;
    private javax.swing.JLabel passwordLb;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel userLb;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
