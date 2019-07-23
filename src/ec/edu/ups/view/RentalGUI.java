/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.view;

/**
 *
 * @author edd
 */
public class RentalGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form RentalGUI
     */
    public RentalGUI() {
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

        billPanel = new javax.swing.JPanel();
        customerPanel = new javax.swing.JPanel();
        dniCustomerLB = new javax.swing.JLabel();
        nameCustomerLB = new javax.swing.JLabel();
        directionCustomerLB = new javax.swing.JLabel();
        lastnameCustomerLB = new javax.swing.JLabel();
        phoneCustomerLB = new javax.swing.JLabel();
        directionCustomerTxt = new javax.swing.JTextField();
        nameCustomerTxt = new javax.swing.JTextField();
        dniCustomerTxt = new javax.swing.JTextField();
        lastnameCustomerTxt = new javax.swing.JTextField();
        phoneCustomerTxt = new javax.swing.JTextField();
        searchCustomerBtn = new javax.swing.JButton();
        createCustomerBtn = new javax.swing.JButton();
        billDetailPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailVehicleTable = new javax.swing.JTable();
        addDetailBtn = new javax.swing.JButton();
        editDetailBtn = new javax.swing.JButton();
        billBtnPanel = new javax.swing.JPanel();
        createBillBtn = new javax.swing.JButton();
        cancelBillBtn = new javax.swing.JButton();
        printBillBtn = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        customerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cliente"));

        dniCustomerLB.setText("Cédula:");

        nameCustomerLB.setText("Nombre:");

        directionCustomerLB.setText("Dirección:");

        lastnameCustomerLB.setText("Apellido:");

        phoneCustomerLB.setText("Número:");

        nameCustomerTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCustomerTxtActionPerformed(evt);
            }
        });

        searchCustomerBtn.setText("Buscar");

        createCustomerBtn.setText("Crear");

        javax.swing.GroupLayout customerPanelLayout = new javax.swing.GroupLayout(customerPanel);
        customerPanel.setLayout(customerPanelLayout);
        customerPanelLayout.setHorizontalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(dniCustomerLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dniCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(nameCustomerLB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(directionCustomerLB)
                        .addGap(18, 18, 18)
                        .addComponent(directionCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(phoneCustomerLB)
                        .addGap(18, 18, 18)
                        .addComponent(phoneCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(customerPanelLayout.createSequentialGroup()
                        .addComponent(lastnameCustomerLB)
                        .addGap(18, 18, 18)
                        .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(customerPanelLayout.createSequentialGroup()
                                .addComponent(searchCustomerBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createCustomerBtn))
                            .addComponent(lastnameCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customerPanelLayout.setVerticalGroup(
            customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dniCustomerLB)
                    .addComponent(dniCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustomerBtn)
                    .addComponent(createCustomerBtn))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCustomerLB)
                    .addComponent(lastnameCustomerLB)
                    .addComponent(nameCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(customerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directionCustomerLB)
                    .addComponent(phoneCustomerLB)
                    .addComponent(directionCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneCustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        billDetailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle"));

        detailVehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(detailVehicleTable);

        addDetailBtn.setText("Agregar Detalle");

        editDetailBtn.setText("Editar Detalle");

        javax.swing.GroupLayout billDetailPanelLayout = new javax.swing.GroupLayout(billDetailPanel);
        billDetailPanel.setLayout(billDetailPanelLayout);
        billDetailPanelLayout.setHorizontalGroup(
            billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billDetailPanelLayout.createSequentialGroup()
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(billDetailPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(billDetailPanelLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(addDetailBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editDetailBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billDetailPanelLayout.setVerticalGroup(
            billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(billDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDetailBtn)
                    .addComponent(editDetailBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        createBillBtn.setText("Crear Factura");

        cancelBillBtn.setText("Anular Factura");

        printBillBtn.setText("Imprimir Factura");
        printBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBillBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout billBtnPanelLayout = new javax.swing.GroupLayout(billBtnPanel);
        billBtnPanel.setLayout(billBtnPanelLayout);
        billBtnPanelLayout.setHorizontalGroup(
            billBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billBtnPanelLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(createBillBtn)
                .addGap(50, 50, 50)
                .addComponent(cancelBillBtn)
                .addGap(47, 47, 47)
                .addComponent(printBillBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billBtnPanelLayout.setVerticalGroup(
            billBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billBtnPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billBtnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBillBtn)
                    .addComponent(cancelBillBtn)
                    .addComponent(printBillBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout billPanelLayout = new javax.swing.GroupLayout(billPanel);
        billPanel.setLayout(billPanelLayout);
        billPanelLayout.setHorizontalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(billBtnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(billDetailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        billPanelLayout.setVerticalGroup(
            billPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billDetailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(billBtnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(billPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameCustomerTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCustomerTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameCustomerTxtActionPerformed

    private void printBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printBillBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDetailBtn;
    private javax.swing.JPanel billBtnPanel;
    private javax.swing.JPanel billDetailPanel;
    private javax.swing.JPanel billPanel;
    private javax.swing.JButton cancelBillBtn;
    private javax.swing.JButton createBillBtn;
    private javax.swing.JButton createCustomerBtn;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JTable detailVehicleTable;
    private javax.swing.JLabel directionCustomerLB;
    private javax.swing.JTextField directionCustomerTxt;
    private javax.swing.JLabel dniCustomerLB;
    private javax.swing.JTextField dniCustomerTxt;
    private javax.swing.JButton editDetailBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastnameCustomerLB;
    private javax.swing.JTextField lastnameCustomerTxt;
    private javax.swing.JLabel nameCustomerLB;
    private javax.swing.JTextField nameCustomerTxt;
    private javax.swing.JLabel phoneCustomerLB;
    private javax.swing.JTextField phoneCustomerTxt;
    private javax.swing.JButton printBillBtn;
    private javax.swing.JButton searchCustomerBtn;
    // End of variables declaration//GEN-END:variables
}