/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author piano-man
 */
public class manage_books extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;

    /**
     * Creates new form manage_books
     */
    public manage_books() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mb1 = new javax.swing.JTextField();
        mb2 = new javax.swing.JTextField();
        mb3 = new javax.swing.JTextField();
        mb4 = new javax.swing.JTextField();
        mb5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Author");

        jLabel3.setText("Id");

        jLabel4.setText("Issued");

        jLabel5.setText("Roll Number");

        mb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mb5, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(mb4, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(mb3)
                            .addComponent(mb1)
                            .addComponent(mb2))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(mb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(mb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mb4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{
    Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/library_management_system","root","bubu");
     String name = mb1.getText();
     String author = mb2.getText();
     String id = mb3.getText();
     String issued = mb4.getText();
     String rno = mb5.getText();
     int flag=0;
     if(issued.equals("yes"))
     {
         String query = "select count(*) as count from book_info where rno='"+(rno)+"';";
         pst=con.prepareStatement(query);
         ResultSet rs1=null;
         rs1=pst.executeQuery(query);
         rs1.next();
         int count = rs1.getInt("count");
         System.out.println(count);
         if(count==4)
         {
             JOptionPane.showMessageDialog(null,"You have issued four books for this number already");
             flag=1;
         }
         
         
     }
     if(flag==0)
     {
     
 
     Date da = new Date();
     Calendar c = Calendar.getInstance();
     c.setTime(da);
     c.add(Calendar.DATE, 15);
     Date newDate = c.getTime();
     java.sql.Date issue_date = new java.sql.Date(da.getTime());
     java.sql.Date due_date = new java.sql.Date(newDate.getTime());
     System.out.println(da);
     System.out.println(newDate);
     String query = "insert into book_info values('"+(name)+"','"+(author)+"','"+(id)+"','"+(issued)+"','"+(rno)+"','"+(issue_date)+"','"+(due_date)+"');";
     pst=con.prepareStatement(query);
     pst.executeUpdate(query);
     mb1.setText("");
     mb2.setText("");
     mb3.setText("");
     mb4.setText("");
     mb5.setText("");   
   }
}
catch(Exception e){
    System.out.println(e.getMessage());
    
}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
    Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/library_management_system","root","bubu");
     String name = mb1.getText();
     String author = mb2.getText();
     String id = mb3.getText();
     String issued = mb4.getText();
     String rno = mb5.getText();
     int flag=0,flag2=0;
     if(issued.equals("yes"))
     {
         String query = "select count(*) as count from book_info where rno='"+(rno)+"';";
         pst=con.prepareStatement(query);
         ResultSet rs1=null;
         rs1=pst.executeQuery(query);
         rs1.next();
         int count = rs1.getInt("count");
         System.out.println(count);
         if(count==4)
         {
             JOptionPane.showMessageDialog(null,"You have issued four books for this number already");
             flag=1;
         }
         
         
     }
     
     
         if(issued.equals("no"))
         {
             String query1 = "select * from book_info where id='"+(id)+"';";
             pst=con.prepareStatement(query1);
             ResultSet rs2=null;
             rs2=pst.executeQuery(query1);
             rs2.next();
             java.sql.Date d3 = rs2.getDate("due_date");
             System.out.println(d3);
             Date da = new Date();
             java.sql.Date current_date = new java.sql.Date(da.getTime());
             long diff = (d3.getTime()-current_date.getTime());
             System.out.println(diff);
             if(diff<0)
             {
                 long fine = (5*Math.abs(diff));
                 JOptionPane.showMessageDialog(null,"you have to pay a fine of rupees"+fine);
                 flag2=1;
             }
     String query = "update book_info set name='"+(name)+"',author='"+(author)+"',id='"+(id)+"',issued='"+(issued)+"',rno='"+(rno)+"',issue_date=NULL,due_date=NULL where id='"+(id)+"';";
     pst=con.prepareStatement(query);
     pst.executeUpdate(query);
     mb1.setText("");
     mb2.setText("");
     mb3.setText("");
     mb4.setText("");
     mb5.setText(""); 
             
             
         }
     if(flag==0&&issued.equals("yes"))
     {
     Date da = new Date();
     Calendar c = Calendar.getInstance();
     c.setTime(da);
     c.add(Calendar.DATE, 15);
     Date newDate = c.getTime();
     java.sql.Date issue_date = new java.sql.Date(da.getTime());
     java.sql.Date due_date = new java.sql.Date(newDate.getTime());
     String query = "update book_info set name='"+(name)+"',author='"+(author)+"',id='"+(id)+"',issued='"+(issued)+"',rno='"+(rno)+"',issue_date='"+(issue_date)+"',due_date='"+(due_date)+"' where id='"+(id)+"';";
     pst=con.prepareStatement(query);
     pst.executeUpdate(query);
     mb1.setText("");
     mb2.setText("");
     mb3.setText("");
     mb4.setText("");
     mb5.setText("");   
   }
    
  
     
 }
catch(Exception e){
    System.out.println(e.getMessage());
    
}       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
delete_book d1 = new delete_book();
this.setVisible(false);
d1.setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(manage_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage_books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage_books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField mb1;
    private javax.swing.JTextField mb2;
    private javax.swing.JTextField mb3;
    private javax.swing.JTextField mb4;
    private javax.swing.JTextField mb5;
    // End of variables declaration//GEN-END:variables
}
