
package assg4;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OrderFrame extends javax.swing.JFrame {

    double total = 0.0;
    private static final String[] images = {
        "pic1.jpg", "pic2.jpg"};
    
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(images[0])),
        new ImageIcon(getClass().getResource(images[1]))};
    
    public OrderFrame() {
        initComponents();
        
         jComboBox1.addItemListener(
            new ItemListener() 
            {
                @Override
                public void itemStateChanged(ItemEvent event)
                {
                    if (event.getStateChange() == ItemEvent.SELECTED)
                    {
                        jLabel10.setIcon(icons[jComboBox1.getSelectedIndex()]);
                    }
                }
            });
        
        // INITIALIZE THE IMAGE LABEL AND ADD TO THE LAYOUT
        jLabel10.setIcon(icons[0]);

        // CENTER WINDOW
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        
        if(jComboBox1.getSelectedIndex() == 0)
        {
            jComboBox2.removeAllItems();
            for(int i=0; i<Main.productList.size(); i++)
            {
                if(Main.productList.get(i) instanceof Mask)
                {
                    Mask mask = (Mask) Main.productList.get(i);
                    jComboBox2.addItem(mask.getMaskBrand());
                }
            }
        }
        else if(jComboBox1.getSelectedIndex() == 1)
        {
            jComboBox2.removeAllItems();
            for(int i=0; i<Main.productList.size(); i++)
            {
                if(Main.productList.get(i) instanceof HandSanitizer)
                {
                    HandSanitizer hand = (HandSanitizer) Main.productList.get(i);
                    jComboBox2.addItem(hand.getHandSanitizerBrand());
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("WELCOME TO");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MICRO-VICTORY COMPANY");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Customer Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Product Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Face Mask", "Hand Sanitizer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Product Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Customer Address:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Customer Phone Number:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Payment Method:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Credit Card");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Online Payment");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Product Brand:");

        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Delivery Charges(RM):");

        jTextField4.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Total Price(RM):");

        jTextField5.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jTextField2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel11)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(11, 11, 11)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // GO BACK BUTTON
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CustomerFrame frame = new CustomerFrame();
        frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // CALCULATE BUTTON
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        total = 0.0;
        
        try
        {
            String custName = jTextField1.getText();
            String custAddress = jTextField2.getText();
            String custPhoneNo = jTextField3.getText();
            String brandName = jComboBox2.getSelectedItem().toString();
            
            if(custName.equals("") || custAddress.equals("") || custPhoneNo.equals("") || jTextField6.getText().equals("")
                    || (jRadioButton1.isSelected() == false && jRadioButton2.isSelected() == false))
            {
                JOptionPane.showMessageDialog(null, "There is blank input.");
            }
            else
            {
                int productQuantity = Integer.parseInt(jTextField6.getText());
                for(int i=0; i<Main.productList.size(); i++)
                {
                    if(Main.productList.get(i) instanceof Mask)
                    {
                        Mask mask = (Mask) Main.productList.get(i);
                        if(brandName.equals(mask.getMaskBrand()))
                        {
                            if(productQuantity > mask.getProductQuantity())
                            {
                                JOptionPane.showMessageDialog(null, "There is not enough stock!");
                            }
                            else
                            {
                                total += Main.productList.get(i).getProductPrice();
                            }
                        }
                    }
                    else if(Main.productList.get(i) instanceof HandSanitizer)
                    {
                        HandSanitizer hand = (HandSanitizer) Main.productList.get(i);
                        if(brandName.equals(hand.getHandSanitizerBrand()))
                        {
                            if(productQuantity > hand.getProductQuantity())
                            {
                                JOptionPane.showMessageDialog(null, "There is not enough stock!");
                            }
                            else
                            {
                                total += Main.productList.get(i).getProductPrice();
                            }
                        }
                    }
                }
                total *= productQuantity;
                if(total < 200)
                {
                    jTextField4.setText(15+"");
                }
                else
                {
                    jTextField4.setText(5+"");
                }
                jTextField5.setText(total+"");
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() == 0)
        {
            jComboBox2.removeAllItems();
            for(int i=0; i<Main.productList.size(); i++)
            {
                if(Main.productList.get(i) instanceof Mask)
                {
                    Mask mask = (Mask) Main.productList.get(i);
                    jComboBox2.addItem(mask.getMaskBrand());
                }
            }
        }
        else if(jComboBox1.getSelectedIndex() == 1)
        {
            jComboBox2.removeAllItems();
            for(int i=0; i<Main.productList.size(); i++)
            {
                if(Main.productList.get(i) instanceof HandSanitizer)
                {
                    HandSanitizer hand = (HandSanitizer) Main.productList.get(i);
                    jComboBox2.addItem(hand.getHandSanitizerBrand());
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // SUBMIT BUTTON
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        if(jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") ||
                jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") ||
                (jRadioButton1.isSelected() == false && jRadioButton2.isSelected() == false))
        {
            JOptionPane.showMessageDialog(null, "There is blank input!");
        }
        else
        {
            try
            {
                String custName = jTextField1.getText();
                String productName = jComboBox1.getSelectedItem().toString();
                String productBrand = jComboBox2.getSelectedItem().toString();
                int productQuantity = Integer.parseInt(jTextField6.getText());
                int orderID = Main.orderList.size()+1;
                String address = jTextField2.getText();
                String phoneNo = jTextField3.getText();
                String paymentMethod = "";
                if(jRadioButton1.isSelected())
                    paymentMethod = "Credit Card";
                else
                    paymentMethod = "Online Payment";
                
                double deliveryCharge = Double.parseDouble(jTextField4.getText());
                double totalPrice = Double.parseDouble(jTextField5.getText());
                
                Order order = new Order(orderID, custName, productName, productQuantity, 
                        totalPrice, deliveryCharge, address, phoneNo, paymentMethod, "Pending");
                Main.orderList.add(order);
                
                for(int i=0; i<Main.productList.size(); i++)
                {
                    if(Main.productList.get(i) instanceof Mask)
                    {
                        Mask mask = (Mask) Main.productList.get(i);
                        if(productBrand.equals(mask.getMaskBrand()))
                            Main.productList.get(i).setProductQuantity(Main.productList.get(i).getProductQuantity() - productQuantity);
                    }
                    else if(Main.productList.get(i) instanceof HandSanitizer)
                    {
                        HandSanitizer hand = (HandSanitizer) Main.productList.get(i);
                        if(productBrand.equals(hand.getHandSanitizerBrand()))
                            Main.productList.get(i).setProductQuantity(Main.productList.get(i).getProductQuantity() - productQuantity);
                    }
                }
                
                try
                {
                    FileWriter fw = new FileWriter("orders.txt", true);
                    PrintWriter pw = new PrintWriter(fw);
                    
                    pw.println(orderID + "\n" + custName + "\n" + productName + "\n" + productQuantity + "\n" + totalPrice + "\n" + 
                            deliveryCharge + "\n" + address+ "\n" + phoneNo+ "\n" + paymentMethod+ "\n" + "Pending");
                    pw.close();
                    
                    JOptionPane.showMessageDialog(null, "The order is successfully added!\nYour order ID is " + orderID
                            + ".\nWhen you track your order, the order ID is necessary.");
                    
                    jTextField1.setText("");
                    jTextField2.setText("");
                    jTextField3.setText("");
                    jTextField4.setText("");
                    jTextField5.setText("");
                    jTextField6.setText("");
                }
                catch(IOException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
