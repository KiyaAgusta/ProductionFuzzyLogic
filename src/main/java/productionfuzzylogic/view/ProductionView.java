package productionfuzzylogic.view;

import productionfuzzylogic.logic.ProductionLogic;
import javax.swing.table.DefaultTableModel;

public class ProductionView extends javax.swing.JFrame {
    private ProductionLogic logic;
    private static double request, stock;
    private DefaultTableModel resultTableModel;
    
    public ProductionView() {
        initComponents();
        resultTableModel = (DefaultTableModel) resultTable.getModel();
    }

    public void setResult(int flag) {
        int result;
        
        logic = new ProductionLogic(request, stock);
        resultTableModel.setRowCount(0);
        resultTableModel.addRow(new Object[]{"PRODUCTION"});
        
        if (flag == 1) {
            result = (int) Math.round(logic.tsukamotoMethod());                      
            resultTable.setValueAt(result, resultTableModel.getRowCount() - 1, 0);
        } else {
            result = (int) Math.round(logic.sugenoMethod());           
            resultTable.setValueAt(result, resultTableModel.getRowCount() - 1, 0);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        requestLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        requestTextField = new javax.swing.JTextField();
        stockTextField = new javax.swing.JTextField();
        tsukamotoButton = new javax.swing.JButton();
        sugenoButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(204, 255, 255));

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setText("PRODUCTION FUZZY LOGIC");

        requestLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        requestLabel.setText("Request :");

        stockLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stockLabel.setText("Stock :");

        tsukamotoButton.setText("TSUKAMOTO");
        tsukamotoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsukamotoButtonActionPerformed(evt);
            }
        });

        sugenoButton.setText("SUGENO");
        sugenoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sugenoButtonActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCTION"
            }
        ));
        jScrollPane1.setViewportView(resultTable);

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stockLabel)
                            .addComponent(requestLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(requestTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(stockTextField)))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(titleLabel))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(tsukamotoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sugenoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(titleLabel)
                .addGap(30, 30, 30)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestLabel)
                    .addComponent(requestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockLabel)
                    .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sugenoButton)
                    .addComponent(tsukamotoButton))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsukamotoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsukamotoButtonActionPerformed
        request = Double.valueOf(requestTextField.getText());
        stock = Double.valueOf(stockTextField.getText());
        
        setResult(1);
    }//GEN-LAST:event_tsukamotoButtonActionPerformed

    private void sugenoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sugenoButtonActionPerformed
        request = Double.valueOf(requestTextField.getText());
        stock = Double.valueOf(stockTextField.getText());
        
        setResult(2);
    }//GEN-LAST:event_sugenoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProductionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel requestLabel;
    private javax.swing.JTextField requestTextField;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel stockLabel;
    private javax.swing.JTextField stockTextField;
    private javax.swing.JButton sugenoButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton tsukamotoButton;
    // End of variables declaration//GEN-END:variables
}
