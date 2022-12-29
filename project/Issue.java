package project;

import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;
import javax.swing.*;

/**
 *
 * @author Vinay Hajare & Neha Deshpande
 */
public class Issue extends javax.swing.JFrame {

    /**
     * Creates new form Issue
     */
    public Issue() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bkid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bkname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        borid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        borname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        borcontact = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 50, -1, -1));

        bkid.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        bkid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkidActionPerformed(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 46, 210, 33));

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 129, -1, -1));

        bkname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        bkname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bknameActionPerformed(evt);
            }
        });
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 125, 210, 33));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Borrower ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 208, -1, -1));

        borid.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        borid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boridActionPerformed(evt);
            }
        });
        jPanel1.add(borid, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 204, 210, 33));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Borrower Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 287, -1, -1));

        borname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        borname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bornameActionPerformed(evt);
            }
        });
        jPanel1.add(borname, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 283, 210, 33));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Borrower Contact");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 358, -1, 30));

        borcontact.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        borcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borcontactActionPerformed(evt);
            }
        });
        jPanel1.add(borcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 210, 33));

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book22.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 133, -1));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book37.png"))); // NOI18N
        jButton1.setText("Issue Book");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG2.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 750, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bkidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bkidActionPerformed

    private void bknameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bknameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bknameActionPerformed

    private void boridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boridActionPerformed

    private void bornameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bornameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bornameActionPerformed

    private void borcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borcontactActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close button action on  click
        JOptionPane.showMessageDialog(this, "Sure to Leave ?","Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //issue button action
        if(bkid.getText().equals("")||bkname.getText().equals("")||borid.getText().equals("")||borname.getText().equals("")||borcontact.getText().equals(""))
        {
           JOptionPane.showMessageDialog(this,"Please fill all fields !!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
               //extracting the enter data by user
               String BKID = bkid.getText();
               String BKNAME = bkname.getText();
               String BORID = borid.getText();
               String BORNAME = borname.getText();
               String BORCONTACT = borcontact.getText();
               String qty = null;
               
               //taking the current date
               String DATE_FORMAT = "yyyy-MM-dd";//format of date
               DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);//formater class object
               Date currentDate = new Date();//current date
               String ISS_DATE = dateFormat.format(currentDate);
               //adding 7 days to current date using calender class
               Calendar c = Calendar.getInstance();
               c.setTime(currentDate);
               c.add(Calendar.DATE,7);
               String RET_DATE = dateFormat.format(c.getTime());
               
               //establishing the connection
               Connection con = connect.dbconnection();
               Statement st = con.createStatement();
               Statement st1 = con.createStatement();
               Statement st2 = con.createStatement();
               //changing the issued_books table
               String sql = "insert into issued_books(BK_ID,BK_NAME,BOR_ID,BOR_NAME,BOR_CONTACT,ISS_DATE,RET_DATE) values('"+BKID+"','"+BKNAME+"','"+BORID+"','"+BORNAME+"','"+BORCONTACT+"','"+ISS_DATE+"','"+RET_DATE+"')";
               //changing the books table by decrementing the quantity
               String s = "update books set BK_QTY = BK_QTY - 1 where BK_ID='"+BKID+"'";
               //checking is book available or not 
               String s1 = "select * from books where BK_ID='"+BKID+"'";
               //executing select query
               ResultSet rs = st2.executeQuery(s1);
               if(rs.next())
               {
                qty = rs.getString("BK_QTY");
               }
               
               if(qty.equals("0"))
               {
                
                   JOptionPane.showMessageDialog(this,"Book is not available !!","Warning",JOptionPane.WARNING_MESSAGE);
                   //clearing text field
                   bkid.setText("");
                   bkname.setText("");
                   borid.setText("");
                   borname.setText("");
                   borcontact.setText("");
               }
               else
               {        
               //executing both statement
               st.executeUpdate(sql);
               st1.executeUpdate(s);
               //showing success message
               JOptionPane.showMessageDialog(this,"Book issued Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
               //Clearing the text field
               bkid.setText("");
               bkname.setText("");
               borid.setText("");
               borname.setText("");
               borcontact.setText("");
               }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Issue j1 = new Issue();
                ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Downloads\\book17.png");
                j1.setIconImage(img.getImage());
                j1.setTitle("Issue Book");
                j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField bkname;
    private javax.swing.JTextField borcontact;
    private javax.swing.JTextField borid;
    private javax.swing.JTextField borname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
