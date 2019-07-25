/**
 * @(#)OfficeManagementGUI.java    0.1.0, 25-Jul-2019 
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.view;

/**
 * @since   22-Jul-2019
 * @version 0.1.0
 * @author  Sarmiento Bryan, Serpa Roberto, Zhizhpon Eduardo
 */
public class OfficeManagementGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form OfficeManagementGUI
     */
    public OfficeManagementGUI() {
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

        provincePanel = new javax.swing.JPanel();
        idProvinceText = new javax.swing.JTextField();
        nameProvinceText = new javax.swing.JTextField();
        createProvinceButton = new javax.swing.JButton();
        findProvinceButton = new javax.swing.JButton();
        editProvinceButton = new javax.swing.JButton();
        deleteProvinceButton = new javax.swing.JButton();
        idProvinceLabel = new javax.swing.JLabel();
        nameProvinceLabel = new javax.swing.JLabel();
        officePanel = new javax.swing.JPanel();
        idOfficeLabel = new javax.swing.JLabel();
        mainStreetLabel = new javax.swing.JLabel();
        secStreetLabel = new javax.swing.JLabel();
        numberOfficeLabel = new javax.swing.JLabel();
        postalCodeLabel = new javax.swing.JLabel();
        idOfficeText = new javax.swing.JTextField();
        mainStreetText = new javax.swing.JTextField();
        secStreetText = new javax.swing.JTextField();
        numberOfficeText = new javax.swing.JTextField();
        postalCodeText = new javax.swing.JTextField();
        createOfficeButton = new javax.swing.JButton();
        editOfficeButton = new javax.swing.JButton();
        deleteOfficeButton = new javax.swing.JButton();
        phonesPanel = new javax.swing.JPanel();
        phoneNumberText = new javax.swing.JTextField();
        numbersLabel = new javax.swing.JLabel();
        phonesComboBox = new javax.swing.JComboBox<>();
        createPhoneButton = new javax.swing.JButton();
        editPhoneButton = new javax.swing.JButton();
        deletePhoneButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        phonesTable = new javax.swing.JTable();
        listPanel = new javax.swing.JPanel();
        listComboBox = new javax.swing.JComboBox<>();
        loadListButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        cityPanel = new javax.swing.JPanel();
        createCityButton = new javax.swing.JButton();
        findCityButton = new javax.swing.JButton();
        editCityButton = new javax.swing.JButton();
        deleteCityButton = new javax.swing.JButton();
        idCityText = new javax.swing.JTextField();
        nameCityText = new javax.swing.JTextField();
        idCityLabel = new javax.swing.JLabel();
        nameCityLabel = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setTitle("Gestión de Oficinas");

        provincePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Provincias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        createProvinceButton.setText("Crear");

        findProvinceButton.setText("Buscar");

        editProvinceButton.setText("Editar");

        deleteProvinceButton.setText("Eliminar");

        idProvinceLabel.setText("Id:");

        nameProvinceLabel.setText("Nombre:");

        javax.swing.GroupLayout provincePanelLayout = new javax.swing.GroupLayout(provincePanel);
        provincePanel.setLayout(provincePanelLayout);
        provincePanelLayout.setHorizontalGroup(
            provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, provincePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(provincePanelLayout.createSequentialGroup()
                        .addComponent(createProvinceButton)
                        .addGap(18, 18, 18)
                        .addComponent(findProvinceButton)
                        .addGap(18, 18, 18)
                        .addComponent(editProvinceButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteProvinceButton))
                    .addGroup(provincePanelLayout.createSequentialGroup()
                        .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(idProvinceLabel)
                            .addComponent(nameProvinceLabel))
                        .addGap(18, 18, 18)
                        .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameProvinceText)
                            .addComponent(idProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(104, 104, 104))
        );
        provincePanelLayout.setVerticalGroup(
            provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(provincePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idProvinceLabel))
                .addGap(15, 15, 15)
                .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameProvinceLabel))
                .addGap(15, 15, 15)
                .addGroup(provincePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProvinceButton)
                    .addComponent(findProvinceButton)
                    .addComponent(editProvinceButton)
                    .addComponent(deleteProvinceButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        officePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Oficinas"));

        idOfficeLabel.setText("Id:");

        mainStreetLabel.setText("Calle Principal:");

        secStreetLabel.setText("Calle Secundaria:");

        numberOfficeLabel.setText("Número:");

        postalCodeLabel.setText("Código Postal:");

        createOfficeButton.setText("Crear");
        createOfficeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOfficeButtonActionPerformed(evt);
            }
        });

        editOfficeButton.setText("Editar");

        deleteOfficeButton.setText("Eliminar");

        phonesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Teléfonos"));

        phoneNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextActionPerformed(evt);
            }
        });

        numbersLabel.setText("Número:");

        phonesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Móvil", "Convencional" }));

        createPhoneButton.setText("Crear");
        createPhoneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPhoneButtonActionPerformed(evt);
            }
        });

        editPhoneButton.setText("Editar");

        deletePhoneButton.setText("Eliminar");

        phonesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "TIPO", "NUMERO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(phonesTable);
        if (phonesTable.getColumnModel().getColumnCount() > 0) {
            phonesTable.getColumnModel().getColumn(0).setResizable(false);
            phonesTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout phonesPanelLayout = new javax.swing.GroupLayout(phonesPanel);
        phonesPanel.setLayout(phonesPanelLayout);
        phonesPanelLayout.setHorizontalGroup(
            phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, phonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(phonesPanelLayout.createSequentialGroup()
                        .addComponent(numbersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneNumberText))
                    .addComponent(phonesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(phonesPanelLayout.createSequentialGroup()
                        .addComponent(createPhoneButton)
                        .addGap(18, 18, 18)
                        .addComponent(editPhoneButton)
                        .addGap(18, 18, 18)
                        .addComponent(deletePhoneButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        phonesPanelLayout.setVerticalGroup(
            phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(phonesPanelLayout.createSequentialGroup()
                        .addGroup(phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numbersLabel))
                        .addGap(18, 18, 18)
                        .addComponent(phonesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(phonesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createPhoneButton)
                            .addComponent(editPhoneButton)
                            .addComponent(deletePhoneButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout officePanelLayout = new javax.swing.GroupLayout(officePanel);
        officePanel.setLayout(officePanelLayout);
        officePanelLayout.setHorizontalGroup(
            officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(phonesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(officePanelLayout.createSequentialGroup()
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(officePanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(postalCodeLabel)
                            .addComponent(numberOfficeLabel)
                            .addComponent(idOfficeLabel)
                            .addComponent(mainStreetLabel)
                            .addComponent(secStreetLabel))
                        .addGap(18, 18, 18)
                        .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idOfficeText)
                            .addComponent(mainStreetText)
                            .addComponent(secStreetText)
                            .addComponent(numberOfficeText)
                            .addComponent(postalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(officePanelLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(createOfficeButton)
                        .addGap(18, 18, 18)
                        .addComponent(editOfficeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteOfficeButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        officePanelLayout.setVerticalGroup(
            officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(officePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idOfficeLabel)
                    .addComponent(idOfficeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mainStreetLabel)
                    .addComponent(mainStreetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(secStreetLabel)
                    .addComponent(secStreetText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfficeLabel)
                    .addComponent(numberOfficeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postalCodeLabel)
                    .addComponent(postalCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(officePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createOfficeButton)
                    .addComponent(editOfficeButton)
                    .addComponent(deleteOfficeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(phonesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        listPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

        listComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Provincias", "Ciudades" }));

        loadListButton.setText("Cargar");
        loadListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadListButtonActionPerformed(evt);
            }
        });

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listTable);

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(listPanelLayout.createSequentialGroup()
                        .addComponent(listComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loadListButton)
                        .addGap(51, 51, 51))))
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadListButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cityPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ciudades"));
        cityPanel.setPreferredSize(new java.awt.Dimension(412, 154));

        createCityButton.setText("Crear");

        findCityButton.setText("Buscar");
        findCityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCityButtonActionPerformed(evt);
            }
        });

        editCityButton.setText("Editar");

        deleteCityButton.setText("Eliminar");
        deleteCityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCityButtonActionPerformed(evt);
            }
        });

        idCityLabel.setText("Id:");

        nameCityLabel.setText("Nombre:");

        javax.swing.GroupLayout cityPanelLayout = new javax.swing.GroupLayout(cityPanel);
        cityPanel.setLayout(cityPanelLayout);
        cityPanelLayout.setHorizontalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createCityButton)
                    .addComponent(idCityLabel)
                    .addComponent(nameCityLabel))
                .addGap(18, 18, 18)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameCityText)
                    .addGroup(cityPanelLayout.createSequentialGroup()
                        .addComponent(findCityButton)
                        .addGap(18, 18, 18)
                        .addComponent(editCityButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCityButton))
                    .addComponent(idCityText))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cityPanelLayout.setVerticalGroup(
            cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cityPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idCityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameCityLabel))
                .addGap(15, 15, 15)
                .addGroup(cityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCityButton)
                    .addComponent(findCityButton)
                    .addComponent(editCityButton)
                    .addComponent(deleteCityButton))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(provincePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(officePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(provincePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(officePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findCityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findCityButtonActionPerformed

    private void deleteCityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCityButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteCityButtonActionPerformed

    private void createOfficeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOfficeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createOfficeButtonActionPerformed

    private void phoneNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextActionPerformed

    private void createPhoneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPhoneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createPhoneButtonActionPerformed

    private void loadListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadListButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cityPanel;
    private javax.swing.JButton createCityButton;
    private javax.swing.JButton createOfficeButton;
    private javax.swing.JButton createPhoneButton;
    private javax.swing.JButton createProvinceButton;
    private javax.swing.JButton deleteCityButton;
    private javax.swing.JButton deleteOfficeButton;
    private javax.swing.JButton deletePhoneButton;
    private javax.swing.JButton deleteProvinceButton;
    private javax.swing.JButton editCityButton;
    private javax.swing.JButton editOfficeButton;
    private javax.swing.JButton editPhoneButton;
    private javax.swing.JButton editProvinceButton;
    private javax.swing.JButton findCityButton;
    private javax.swing.JButton findProvinceButton;
    private javax.swing.JLabel idCityLabel;
    private javax.swing.JTextField idCityText;
    private javax.swing.JLabel idOfficeLabel;
    private javax.swing.JTextField idOfficeText;
    private javax.swing.JLabel idProvinceLabel;
    private javax.swing.JTextField idProvinceText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listComboBox;
    private javax.swing.JPanel listPanel;
    private javax.swing.JTable listTable;
    private javax.swing.JButton loadListButton;
    private javax.swing.JLabel mainStreetLabel;
    private javax.swing.JTextField mainStreetText;
    private javax.swing.JLabel nameCityLabel;
    private javax.swing.JTextField nameCityText;
    private javax.swing.JLabel nameProvinceLabel;
    private javax.swing.JTextField nameProvinceText;
    private javax.swing.JLabel numberOfficeLabel;
    private javax.swing.JTextField numberOfficeText;
    private javax.swing.JLabel numbersLabel;
    private javax.swing.JPanel officePanel;
    private javax.swing.JTextField phoneNumberText;
    private javax.swing.JComboBox<String> phonesComboBox;
    private javax.swing.JPanel phonesPanel;
    private javax.swing.JTable phonesTable;
    private javax.swing.JLabel postalCodeLabel;
    private javax.swing.JTextField postalCodeText;
    private javax.swing.JPanel provincePanel;
    private javax.swing.JLabel secStreetLabel;
    private javax.swing.JTextField secStreetText;
    // End of variables declaration//GEN-END:variables
}
