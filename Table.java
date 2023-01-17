import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Table extends JFrame {
    public Table() {
        initComponents();
        setTitle("Product Information");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prodName = new javax.swing.JLabel();
        stockNum = new javax.swing.JLabel();
        expName = new javax.swing.JLabel();
        prodtxt = new javax.swing.JTextField();
        stocktxt = new javax.swing.JTextField();
        exptxt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnAccType = new javax.swing.JButton();
        priceNum = new javax.swing.JLabel();
        pricetxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        prodName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prodName.setText("Product Name");

        stockNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        stockNum.setText("Stocks");

        expName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        expName.setText("Expiration Date");

        stocktxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stocktxtKeyTyped(evt);
            }
        });

        exptxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                exptxtKeyTyped(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "No. of Stocks", "Expiration Date", "Price"
            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            jTable1MouseExited(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnDelete.setText("DELETE");
    btnDelete.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDeleteActionPerformed(evt);
        }
    });

    btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnUpdate.setText("UPDATE");
    btnUpdate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpdateActionPerformed(evt);
        }
    });

    btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnSave.setText("SAVE");
    btnSave.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSaveActionPerformed(evt);
        }
    });

    btnAccType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnAccType.setText("Logout");
    btnAccType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAccTypeActionPerformed(evt);
        }
    });

    priceNum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    priceNum.setText("Price");

    pricetxt.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            pricetxtKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(prodName)
                                .addComponent(stockNum)
                                .addComponent(expName))
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(prodtxt)
                                .addComponent(stocktxt)
                                .addComponent(exptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(32, 32, 32)
                            .addComponent(priceNum)
                            .addGap(18, 18, 18)
                            .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(btnDelete)
                    .addGap(18, 18, 18)
                    .addComponent(btnUpdate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave)
                    .addGap(97, 97, 97))))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAccType)
            .addGap(77, 77, 77))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(41, 41, 41)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(prodName)
                .addComponent(prodtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(priceNum)
                .addComponent(pricetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(stockNum)
                .addComponent(stocktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(expName)
                .addComponent(exptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(119, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        if(prodtxt.getText().equals("")||stocktxt.getText().equals("")||exptxt.getText().equals("")||pricetxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter all data.");
        }
        else{
            String data[] = {prodtxt.getText(),stocktxt.getText(),exptxt.getText(),pricetxt.getText()};
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            //add string array data
            tblModel.addRow(data);
            //successfully added message
            JOptionPane.showMessageDialog(this, "Data Added successfully!");
            //clear textfield for new entry
            prodtxt.setText("");
            stocktxt.setText("");
            exptxt.setText("");
            pricetxt.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        //for deleting the row
        if(jTable1.getSelectedRowCount()==1){
            // if only one row is selected then delete
            tblModel.removeRow(jTable1.getSelectedRow());    
        }
        else {
            if(jTable1.getRowCount()==0){
                // if the table is empty then this message will appear
                JOptionPane.showMessageDialog(this, "The table is empty.");
            }
            else {
                // if the table is not empty but there is no row selected for deletion then this message will appear
                JOptionPane.showMessageDialog(this, "Please select any single row for deletion.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // set the data to their textfield
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        // this will set the date to their textfield when the row is selected
        String tblProdName = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblStocks = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblExpiDate = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblPrice = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        
        //set to textfield
        prodtxt.setText(tblProdName);
        stocktxt.setText(tblStocks);
        exptxt.setText(tblExpiDate);
        pricetxt.setText(tblPrice);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        btnAdd.setEnabled(false);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        if(prodtxt.getText().equals("")||stocktxt.getText().equals("")||exptxt.getText().equals("")||pricetxt.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please enter all data.");
        }
        else if(jTable1.getSelectedRowCount()== 1){
      
            // if single row has been selected then update           
            String prodname = prodtxt.getText();
            String stocks = stocktxt.getText();
            String expi = exptxt.getText();
            String price = pricetxt.getText();           
            
            //set the updated value on the row
            tblModel.setValueAt(prodname, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(stocks, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(expi, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(price, jTable1.getSelectedRow(), 2);
            
            // show message that the data is updated successfully
            JOptionPane.showMessageDialog(this, "Data is Updated Successfully!");
        }
        else {
            if(jTable1.getRowCount()==0){
                // if the table is empty then this message will appear
                JOptionPane.showMessageDialog(this, "The table is empty.");
            }
            else {
                // if the table is not empty but there is no row selected for update then this message will appear
                JOptionPane.showMessageDialog(this, "Please select any single row for update.");                
            }
        }     
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        try {
            String filePath = "C:\\Users\\Administrator\\Documents\\Sheena Files\\NetBeansProjects\\JavaApplication26\\productinformation.txt";
            File file = new File(filePath);
            if(!(file.exists())){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(int i = 0; i < jTable1.getRowCount(); i++){ // for rows
                for(int u = 0; u <jTable1.getColumnCount(); u++){ // for columns
                    bw.write(jTable1.getValueAt(i, u).toString()+" ");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
            
            }
            catch(FileNotFoundException ex){
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(Table.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccTypeActionPerformed
        
        this.hide();
        type t = new type();
        t.setBounds(100,150,400,300);
        t.setVisible(true);
    }//GEN-LAST:event_btnAccTypeActionPerformed

    private void stocktxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stocktxtKeyTyped
        
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Enter numbers only"); 
        }

    }//GEN-LAST:event_stocktxtKeyTyped

    private void exptxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exptxtKeyTyped
        
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE|| c==KeyEvent.VK_DIVIDE || c==KeyEvent.VK_SUBTRACT)){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Enter numbers only"); 
        }
    }//GEN-LAST:event_exptxtKeyTyped

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        
        prodtxt.setText("");
        stocktxt.setText("");
        exptxt.setText("");
        pricetxt.setText("");
    }//GEN-LAST:event_jTable1MouseExited

    private void pricetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pricetxtKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE )){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Enter numbers only"); 
        }
    }//GEN-LAST:event_pricetxtKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Table().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccType;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel expName;
    private javax.swing.JTextField exptxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel priceNum;
    private javax.swing.JTextField pricetxt;
    private javax.swing.JLabel prodName;
    private javax.swing.JTextField prodtxt;
    private javax.swing.JLabel stockNum;
    private javax.swing.JTextField stocktxt;
    // End of variables declaration//GEN-END:variables
}
