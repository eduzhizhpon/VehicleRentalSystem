/**
 * @(#)VehicleManagementGUI.java    0.1.0, 25-Jul-2019 
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.view;

import ec.edu.ups.conectionDB.ConnectionJava;
import ec.edu.ups.controller.ModelController;
import ec.edu.ups.model.Brand;
import ec.edu.ups.model.Model;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;

/**
 * @since   22-Jul-2019
 * @version 0.1.0
 * @author  Sarmiento Bryan, Serpa Roberto, Zhizhpon Eduardo
 */
public class VehicleManagementGUI extends javax.swing.JInternalFrame {

    private ModelController conModel;
    private ConnectionJava connection;
    
    /**
     * Creates new form VehicleManagementGUI
     * @param connection
     * @param mainGUI
     */
    public VehicleManagementGUI(ConnectionJava connection, MainGUI mainGUI) {
        initComponents();
        
        this.addInternalFrameListener(new InternalFrameListener() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                mainGUI.setVehicleManagementGUI(null);
            }

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameIconified(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeiconified(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameActivated(InternalFrameEvent e) {
            }

            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
            }
        });
        
        
        conModel = new ModelController();
        this.connection = connection;
        
        listBrands();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        brandPanel = new javax.swing.JPanel();
        createBrandButton = new javax.swing.JButton();
        findBrandButton = new javax.swing.JButton();
        editBrandButton = new javax.swing.JButton();
        deleteBrandButton = new javax.swing.JButton();
        idBrandText = new javax.swing.JTextField();
        nameBrandText = new javax.swing.JTextField();
        idBrandLabel = new javax.swing.JLabel();
        nameBrandLabel = new javax.swing.JLabel();
        modelPanel = new javax.swing.JPanel();
        idModelText = new javax.swing.JTextField();
        nameModelText = new javax.swing.JTextField();
        idModelLabel = new javax.swing.JLabel();
        nameModelLabel = new javax.swing.JLabel();
        createModelButton = new javax.swing.JButton();
        findModelButton = new javax.swing.JButton();
        editModelButton = new javax.swing.JButton();
        deleteModelButton = new javax.swing.JButton();
        costModelLabel = new javax.swing.JLabel();
        costModelText = new javax.swing.JTextField();
        listPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        selectComboBox = new javax.swing.JComboBox<>();
        searchListButton = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJTable = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setTitle("Administrar Datos Vehiculo");

        brandPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marcas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        createBrandButton.setText("Crear");
        createBrandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBrandButtonActionPerformed(evt);
            }
        });

        findBrandButton.setText("Buscar");
        findBrandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBrandButtonActionPerformed(evt);
            }
        });

        editBrandButton.setText("Editar");
        editBrandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBrandButtonActionPerformed(evt);
            }
        });

        deleteBrandButton.setText("Eliminar");
        deleteBrandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBrandButtonActionPerformed(evt);
            }
        });

        idBrandText.setEditable(false);
        idBrandText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBrandTextActionPerformed(evt);
            }
        });

        idBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        idBrandLabel.setText("Id:");

        nameBrandLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameBrandLabel.setText("Nombre:");

        javax.swing.GroupLayout brandPanelLayout = new javax.swing.GroupLayout(brandPanel);
        brandPanel.setLayout(brandPanelLayout);
        brandPanelLayout.setHorizontalGroup(
            brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createBrandButton)
                    .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(idBrandLabel)
                        .addComponent(nameBrandLabel)))
                .addGap(15, 15, 15)
                .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameBrandText)
                    .addComponent(idBrandText)
                    .addGroup(brandPanelLayout.createSequentialGroup()
                        .addComponent(findBrandButton)
                        .addGap(15, 15, 15)
                        .addComponent(editBrandButton)
                        .addGap(15, 15, 15)
                        .addComponent(deleteBrandButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        brandPanelLayout.setVerticalGroup(
            brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brandPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBrandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBrandLabel))
                .addGap(20, 20, 20)
                .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameBrandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameBrandLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(brandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBrandButton)
                    .addComponent(findBrandButton)
                    .addComponent(editBrandButton)
                    .addComponent(deleteBrandButton))
                .addGap(25, 25, 25))
        );

        modelPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modelos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        idModelText.setEditable(false);

        idModelLabel.setText("Id:");

        nameModelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameModelLabel.setText("Nombre:");

        createModelButton.setText("Crear");
        createModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createModelButtonActionPerformed(evt);
            }
        });

        findModelButton.setText("Buscar");
        findModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findModelButtonActionPerformed(evt);
            }
        });

        editModelButton.setText("Editar");
        editModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editModelButtonActionPerformed(evt);
            }
        });

        deleteModelButton.setText("Eliminar");
        deleteModelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteModelButtonActionPerformed(evt);
            }
        });

        costModelLabel.setText("Precio:");

        javax.swing.GroupLayout modelPanelLayout = new javax.swing.GroupLayout(modelPanel);
        modelPanel.setLayout(modelPanelLayout);
        modelPanelLayout.setHorizontalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(modelPanelLayout.createSequentialGroup()
                        .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameModelLabel)
                            .addComponent(idModelLabel)
                            .addComponent(costModelLabel))
                        .addGap(30, 30, 30)
                        .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idModelText)
                            .addComponent(nameModelText)
                            .addComponent(costModelText)))
                    .addGroup(modelPanelLayout.createSequentialGroup()
                        .addComponent(createModelButton)
                        .addGap(15, 15, 15)
                        .addComponent(findModelButton)
                        .addGap(15, 15, 15)
                        .addComponent(editModelButton)
                        .addGap(15, 15, 15)
                        .addComponent(deleteModelButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        modelPanelLayout.setVerticalGroup(
            modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idModelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idModelLabel))
                .addGap(15, 15, 15)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameModelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameModelLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costModelLabel)
                    .addComponent(costModelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createModelButton)
                    .addComponent(findModelButton)
                    .addComponent(editModelButton)
                    .addComponent(deleteModelButton))
                .addGap(15, 15, 15))
        );

        listPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        buttonsPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        selectComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marcas", "Modelos" }));
        selectComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectComboBoxActionPerformed(evt);
            }
        });

        searchListButton.setText("Buscar");
        searchListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchListButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(selectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(searchListButton)
                .addGap(25, 25, 25))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchListButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tablePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        listJTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(listJTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(brandPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(modelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchListButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchListButtonActionPerformed

    private void findModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findModelButtonActionPerformed
        
        try{
            
            Model model = new Model();
            this.conModel.readModel(connection, model, 
                    this.nameModelText.getText());
            
            if (model.getModName() == null) {
                throw new NullPointerException();
            } else {
                this.nameModelText.setText(model.getModName());
                this.idModelText.setText("" + model.getModId());
                this.costModelText.setText("" + model.getModCost());
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se encontró el modelo ingresado.", 
                    "Advertencia", JOptionPane.QUESTION_MESSAGE);
        }
        
    }//GEN-LAST:event_findModelButtonActionPerformed

    private void idBrandTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBrandTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBrandTextActionPerformed

    private void editBrandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBrandButtonActionPerformed
        
        try{
            Brand brand = new Brand();
            brand.setBraId(Integer.parseInt(this.idBrandText.getText()));
            brand.setBraName(this.nameBrandText.getText());
            this.conModel.getConBrand().updateBrand(connection, brand);
            
            listBrands();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al editar."
                    + e.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_editBrandButtonActionPerformed

    private void findBrandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBrandButtonActionPerformed
        
        try{
            Brand brand = new Brand();
            this.conModel.getConBrand().readBrand(connection, brand, 
                    this.nameBrandText.getText());
            
            if (brand.getBraName() == null) {
                throw new NullPointerException();
            }else{
                this.nameBrandText.setText(brand.getBraName());
                this.idBrandText.setText("" + brand.getBraId());
                
                listModels();
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se encontró la Marca ingresada.", "Advertencia", 
                    JOptionPane.QUESTION_MESSAGE);
        }
        
    }//GEN-LAST:event_findBrandButtonActionPerformed

    private void createBrandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBrandButtonActionPerformed
        
        try{
            Brand brand = new Brand();
            brand.setBraName(this.nameBrandText.getText());

            if (this.conModel.getConBrand().createBrand(connection, brand)){
                JOptionPane.showMessageDialog(null, 
                        "Marca " + brand.getBraName() + " creada.", 
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                
                this.nameBrandText.setText("");
                listBrands();
                
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al crear la marca", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createBrandButtonActionPerformed

    private void selectComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectComboBoxActionPerformed

    private void deleteBrandButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBrandButtonActionPerformed
        
        try{
            
            this.conModel.getConBrand().deleteBrand(connection, 
                    this.nameBrandText.getText());
            listBrands();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la marca", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_deleteBrandButtonActionPerformed

    private void createModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createModelButtonActionPerformed
        
        try{
            
            Model model = new Model();
            model.setModName(this.nameModelText.getText());
            model.setModCost(Double.parseDouble(this.costModelText.getText()));

            if (this.conModel.createModel(connection, model, 
                    Integer.parseInt(this.idBrandText.getText()))){
                
                JOptionPane.showMessageDialog(null, 
                        "Modelo " + model.getModName()+ " creado.", 
                        "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                
                this.nameModelText.setText("");
                
                //OJO ACABAR EL LIST MODELS
                listModels();
                
            }
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al crear el modelo", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createModelButtonActionPerformed

    private void editModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editModelButtonActionPerformed
        
        try{
            
            Model model = new Model();
            model.setModId(Integer.parseInt(this.idModelText.getText()));
            model.setModName(this.nameModelText.getText());
            model.setModCost(Double.parseDouble(this.costModelText.getText()));
            
            this.conModel.updateModel(connection, model);
            
            //OJO HACER EL OTRO
            listModels();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al editar."
                    + e.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_editModelButtonActionPerformed

    private void deleteModelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteModelButtonActionPerformed
        
        try{
            
            this.conModel.deleteModel(connection, 
                    Integer.parseInt(this.idModelText.getText()));
            
            // OJO
            listModels();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la marca", 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_deleteModelButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel brandPanel;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel costModelLabel;
    private javax.swing.JTextField costModelText;
    private javax.swing.JButton createBrandButton;
    private javax.swing.JButton createModelButton;
    private javax.swing.JButton deleteBrandButton;
    private javax.swing.JButton deleteModelButton;
    private javax.swing.JButton editBrandButton;
    private javax.swing.JButton editModelButton;
    private javax.swing.JButton findBrandButton;
    private javax.swing.JButton findModelButton;
    private javax.swing.JLabel idBrandLabel;
    private javax.swing.JTextField idBrandText;
    private javax.swing.JLabel idModelLabel;
    private javax.swing.JTextField idModelText;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listJTable;
    private javax.swing.JPanel listPanel;
    private javax.swing.JPanel modelPanel;
    private javax.swing.JLabel nameBrandLabel;
    private javax.swing.JTextField nameBrandText;
    private javax.swing.JLabel nameModelLabel;
    private javax.swing.JTextField nameModelText;
    private javax.swing.JButton searchListButton;
    private javax.swing.JComboBox<String> selectComboBox;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

    private void listBrands(){
        
        DefaultTableModel tableModel = new DefaultTableModel();
        List<Brand> brands = new ArrayList<>();
        
        String [] colums = {"Id", "Nombre"}; 
        String [][] rows;
        
        try{
            this.conModel.getConBrand().getBrands(connection, brands);
            int n = brands.size();
            
            rows = new String[n][2];
            
            for (int i = 0; i < n; i++) {
                rows[i][0] = "" + brands.get(i).getBraId();
                rows[i][1] = brands.get(i).getBraName();
            }
            
            tableModel.setDataVector(rows, colums);
            this.listJTable.setModel(tableModel);
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    private void listModels(){
        
        DefaultTableModel tableModel = new DefaultTableModel();
        List<Model> models = new ArrayList<>();
        
        Brand brand = new Brand(Integer.parseInt(this.idBrandText.getText()), 
                this.nameBrandText.getText());
        
        
        String [] colums = {"Id", "Nombre"}; 
        String [][] rows;
        
        try{
            this.conModel.getModels(connection, models, brand);
            int n = models.size();
            
            rows = new String[n][2];
            
            for (int i = 0; i < n; i++) {
                rows[i][0] = "" + models.get(i).getModId();
                rows[i][1] = models.get(i).getModName();
            }
            
            tableModel.setDataVector(rows, colums);
            this.listJTable.setModel(tableModel);
        } catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
}
