
package assg4;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.swing.JOptionPane;

public class ViewProductFrame extends javax.swing.JFrame {

    public ViewProductFrame() {
        initComponents();
        
        // CENTER WINDOW
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        
        // SHOW DETAILS OF PRODUCTS ON TEXTAREA
        String str = "";
        for(int i=0; i<Main.productList.size(); i++)
        {
            str += Main.productList.get(i).showDetails();
        }
        jTextArea1.setText(str);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MICRO-VICTORY COMPANY VIEW ALL PRODUCTS");

        jButton2.setText("Display less than the price");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Display more than the price");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Display by category");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Less than price button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Your input is blank!");
        }
        else
        {
            try
            {
                double input = Double.parseDouble(jTextField1.getText());
                Product[] productArr = new Product[Main.productList.size()];
                for(int i=0; i<Main.productList.size(); i++)
                {
                    productArr[i]=Main.productList.get(i);
                }

                jTextArea1.setText("");
                List<Product> list = Arrays.asList(productArr);
                Predicate<Product> lessThanPrice = e -> (e.getProductPrice() < input);
                Function<Product, Double> byProductPrice = Product::getProductPrice;
                Comparator<Product> productPriceComparator = Comparator.comparing(byProductPrice);
                list.stream().filter(lessThanPrice).sorted(productPriceComparator).forEach(x->jTextArea1.append(x.showDetails()));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // More than price button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Your input is blank!");
        }
        else
        {
            try
            {
                double input = Double.parseDouble(jTextField1.getText());
                Product[] productArr = new Product[Main.productList.size()];
                for(int i=0; i<Main.productList.size(); i++)
                {
                    productArr[i]=Main.productList.get(i);
                }

                jTextArea1.setText("");
                List<Product> list = Arrays.asList(productArr);
                Predicate<Product> moreThanPrice = e -> (e.getProductPrice() > input);
                Function<Product, Double> byProductPrice = Product::getProductPrice;
                Comparator<Product> productPriceComparator = Comparator.comparing(byProductPrice);
                list.stream().filter(moreThanPrice).sorted(productPriceComparator).forEach(x->jTextArea1.append(x.showDetails()));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Category button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextField1.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Your input is blank!");
        }
        else
        {
            try
            {
                String input = jTextField1.getText();
                Product[] productArr = new Product[Main.productList.size()];
                for(int i=0; i<Main.productList.size(); i++)
                {
                    productArr[i]=Main.productList.get(i);
                }

                jTextArea1.setText("");
                List<Product> list = Arrays.asList(productArr);
                Predicate<Product> productNameMatch = e -> (e.getProductName().equals(input));
                Function<Product, String> byProductName = Product::getProductName;
                Comparator<Product> productNameComparator = Comparator.comparing(byProductName);
                list.stream().filter(productNameMatch).sorted(productNameComparator).forEach(x->jTextArea1.append(x.showDetails()));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Go back button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(Main.currentUser.equals("admin"))
        {
            AdminFrame frame = new AdminFrame();
            frame.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            CustomerFrame frame = new CustomerFrame();
            frame.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
