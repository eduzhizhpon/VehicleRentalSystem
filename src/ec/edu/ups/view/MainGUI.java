/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.view;

import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author edd
 */
public class MainGUI extends javax.swing.JFrame {

    
    
    /**
     * Creates new form MainGUI
     * @param useType
     */
    public MainGUI(char useType) {
        initComponents();
        setSize(1100,900);
        setLocationRelativeTo(null);
        
        this.userType = useType;
    }

    public char getUserType() {
        return userType;
    }

    public void setUserType(char userType) {
        this.userType = userType;
    }

    public MyDataGUI getData() {
        return data;
    }

    public void setData(MyDataGUI data) {
        this.data = data;
    }

    public JMenu getHelpJM() {
        return helpJM;
    }

    public void setHelpJM(JMenu helpJM) {
        this.helpJM = helpJM;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopMain = new javax.swing.JDesktopPane();
        mainBar = new javax.swing.JMenuBar();
        myDataJm = new javax.swing.JMenu();
        myDataJMI = new javax.swing.JMenuItem();
        logoutJMI = new javax.swing.JMenuItem();
        addJM = new javax.swing.JMenu();
        addOfficeJMI = new javax.swing.JMenuItem();
        addVehicleJMI = new javax.swing.JMenuItem();
        addCompanyJMI = new javax.swing.JMenuItem();
        createJM = new javax.swing.JMenu();
        creUserJMI = new javax.swing.JMenuItem();
        creVehicleJMI = new javax.swing.JMenuItem();
        creRentalJMI = new javax.swing.JMenuItem();
        creBillJMI = new javax.swing.JMenuItem();
        helpJM = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(desktopMain, java.awt.BorderLayout.CENTER);

        myDataJm.setText("Mi Perfil");
        myDataJm.setName(""); // NOI18N

        myDataJMI.setText("Mis Datos");
        myDataJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myDataJMIActionPerformed(evt);
            }
        });
        myDataJm.add(myDataJMI);

        logoutJMI.setText("Cerrar Sesión");
        myDataJm.add(logoutJMI);

        mainBar.add(myDataJm);

        addJM.setText("Agregar");

        addOfficeJMI.setText("Gestionar Oficina");
        addOfficeJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOfficeJMIActionPerformed(evt);
            }
        });
        addJM.add(addOfficeJMI);

        addVehicleJMI.setText("Gestionar Vehículos");
        addJM.add(addVehicleJMI);

        addCompanyJMI.setText("Empresa");
        addJM.add(addCompanyJMI);

        mainBar.add(addJM);

        createJM.setText("Crear");

        creUserJMI.setText("Usuario");
        creUserJMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creUserJMIActionPerformed(evt);
            }
        });
        createJM.add(creUserJMI);

        creVehicleJMI.setText("Vehículo");
        createJM.add(creVehicleJMI);

        creRentalJMI.setText("Alquiler");
        createJM.add(creRentalJMI);

        creBillJMI.setText("Factura");
        createJM.add(creBillJMI);

        mainBar.add(createJM);

        helpJM.setText("Ayuda");
        mainBar.add(helpJM);

        setJMenuBar(mainBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myDataJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myDataJMIActionPerformed
        // TODO add your handling code here:
        
        if (data == null)
            data = new MyDataGUI(getWidth(), getHeight());
        if (data.isVisible()){
            try {
                data.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            this.desktopMain.add(data);
            data.setVisible(true);
        }
    }//GEN-LAST:event_myDataJMIActionPerformed

    private boolean loadMenus(){
        
        switch(getUserType()){
            case 'C':
                
                break;
            case 'A':
                
                break;
            case 'E':
                
                break;
            default:
                System.out.println("fail load Menus");
                return false;
            
            
        }
        return true;
    }
    
    private boolean customerMenus(){
        
        
        
        return true;
    }
    
    private void addOfficeJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOfficeJMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addOfficeJMIActionPerformed

    private void creUserJMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creUserJMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creUserJMIActionPerformed

    private MyDataGUI data;
    private List<JMenu> menus;
    private char userType;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCompanyJMI;
    private javax.swing.JMenu addJM;
    private javax.swing.JMenuItem addOfficeJMI;
    private javax.swing.JMenuItem addVehicleJMI;
    private javax.swing.JMenuItem creBillJMI;
    private javax.swing.JMenuItem creRentalJMI;
    private javax.swing.JMenuItem creUserJMI;
    private javax.swing.JMenuItem creVehicleJMI;
    private javax.swing.JMenu createJM;
    private javax.swing.JDesktopPane desktopMain;
    private javax.swing.JMenu helpJM;
    private javax.swing.JMenuItem logoutJMI;
    private javax.swing.JMenuBar mainBar;
    private javax.swing.JMenuItem myDataJMI;
    private javax.swing.JMenu myDataJm;
    // End of variables declaration//GEN-END:variables
    
}

