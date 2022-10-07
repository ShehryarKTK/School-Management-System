/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui.with.classes.test;
import static gui.with.classes.test.Home.school;
import static gui.with.classes.test.StuReg.cmbgender;
import static gui.with.classes.test.StuReg.txtclass;
import static gui.with.classes.test.StuReg.txtdate;
import static gui.with.classes.test.StuReg.txtname;
import static gui.with.classes.test.StuReg.txtrollno;
import static gui.with.classes.test.StuReg.txtsubject;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Shehryar Khattak
 */
public class GU_with_class extends javax.swing.JFrame {

    /**
     * Creates new form GU_with_class
     */
    
    public GU_with_class() {
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

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btneditinfo = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Registration");

        jLabel1.setText("Name");

        jLabel2.setText("ID");

        jLabel3.setText("Salary");

        txtsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalaryActionPerformed(evt);
            }
        });

        jLabel4.setText("Date of Joining");

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "[-----Select gender-----]", "Male", "Female" }));

        jLabel5.setText("Gender");

        jLabel6.setText("Subject");

        txtsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(57, 57, 57))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(58, 58, 58)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbgender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtname)
                    .addComponent(txtid)
                    .addComponent(txtsalary)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28))
        );

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Get Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnedit.setBackground(new java.awt.Color(255, 102, 0));
        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btneditinfo.setBackground(new java.awt.Color(255, 102, 0));
        btneditinfo.setText("Edit Info");
        btneditinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(55, 55, 55)
                        .addComponent(jButton2)
                        .addGap(76, 76, 76)
                        .addComponent(btnedit)
                        .addGap(52, 52, 52)
                        .addComponent(btneditinfo))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(btnedit)
                    .addComponent(btneditinfo))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(cmbgender.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(GU_with_class.this,"Select gender" );
            return;
        }
        
        String name=txtname.getText();
        String id=txtid.getText();
        String date=txtdate.getText();
        String gender=cmbgender.getSelectedItem().toString();
        String subject=txtsubject.getText();
        double salary=Double.parseDouble(txtsalary.getText());
       
        Home.school.addTeacher(new Teacher(id,name, date,gender,subject,salary));
        txtname.setText("");
        txtid.setText("");
        txtsalary.setText("");
        txtdate.setText("");
        txtsubject.setText("");
        cmbgender.setSelectedIndex(0);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(school.getTeachers().isEmpty()){
         JOptionPane.showMessageDialog(GU_with_class.this, "Teacher list is empty");
         return;
     }  
        
    String name=JOptionPane.showInputDialog("Enter Name of Teacher");
    ArrayList<Teacher> teachers=Home.school.getTeachers();
   for(int index=0 ;index<teachers.size();index++){
    Teacher teacher=teachers.get(index);
    if(teacher.getName().equals(name)){
        JOptionPane.showMessageDialog(GU_with_class.this,"Teacher Name: "+teacher.getName()+"\ngender: "+teacher.getGender()
        +"\nID: "+teacher.getId()
        +"\nSubject: "+teacher.getSubject()+"\nDate of joining: "+teacher.getDateofjoining()
        +"\nSalary: "+teacher.getSalary());
    }
       
}
      
          
           
       
       
       
         
    

    
            
            
        
        
    
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryActionPerformed

    private void txtsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubjectActionPerformed

    private void btneditinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditinfoActionPerformed
        String name=txtname.getText();
        String ID=txtid.getText();
        double salary=Double.parseDouble(txtsalary.getText());
        String subject=txtsubject.getText();
        String date=txtdate.getText();
        String gender=cmbgender.getSelectedItem().toString();
        
        ArrayList<Teacher> teachers=Home.school.getTeachers();
    for(int index=0 ;index<teachers.size();index++){
    Teacher teacher=teachers.get(index);
    if(teacher.getName().equals(name)){
        teacher.setName(name);
        teacher.setId(ID);
        teacher.setSubject(subject);
        teacher.setDateofjoining(date);
        teacher.setSalary(salary);
        teacher.setGender(gender);
        
    }}
             
        txtname.setText("");
        txtid.setText("");
        txtsubject.setText("");
        txtdate.setText("");
        txtsubject.setText("");  
        txtsalary.setText("");
        cmbgender.setSelectedIndex(0);
    }//GEN-LAST:event_btneditinfoActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    if(school.getTeachers().isEmpty()){
         JOptionPane.showMessageDialog(GU_with_class.this, "Teacher list is empty");
         return;
     }  
     String name=JOptionPane.showInputDialog("Enter Name of Teacher");
     
   
    ArrayList<Teacher> teachers=Home.school.getTeachers();
   for(int index=0 ;index<teachers.size();index++){
    Teacher teacher=teachers.get(index);
    if(teacher.getName().equals(name)){
        txtname.setText(teacher.getName());
        txtid.setText(teacher.getId());
        txtsalary.setText(Double.toString(teacher.getSalary()));
        txtdate.setText(teacher.getDateofjoining());
        txtsubject.setText(teacher.getSubject() );
        cmbgender.setSelectedItem(teacher.getGender());
    }
    }
    }//GEN-LAST:event_btneditActionPerformed

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
            java.util.logging.Logger.getLogger(GU_with_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GU_with_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GU_with_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GU_with_class.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GU_with_class().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btneditinfo;
    public static javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtdate;
    public static javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtname;
    public static javax.swing.JTextField txtsalary;
    public static javax.swing.JTextField txtsubject;
    // End of variables declaration//GEN-END:variables
}
