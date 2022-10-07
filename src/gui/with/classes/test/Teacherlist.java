
package gui.with.classes.test;
import static gui.with.classes.test.Home.school;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shehryar Khattak
 */


public class Teacherlist extends javax.swing.JFrame {

    /**
     * C
     */
    
    DefaultTableModel model;
    public Teacherlist(){
        initComponents();
        model=(DefaultTableModel) tblteacher.getModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblteacher = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher List");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tblteacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "ID", "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblteacher);

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Get Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Get List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setText("Clear Teacher list");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(29, 29, 29)
                .addComponent(jButton1)
                .addGap(31, 31, 31)
                .addComponent(jButton2)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(Home.school.getTeachers()==null){
        JOptionPane.showMessageDialog(Teacherlist.this,"Teacher List is empty");
        return;
    }
    model.setRowCount(0);
    ArrayList<Teacher> teachers=school.getTeachers();
   for(int index=0 ;index<teachers.size();index++){
    Teacher teacher=teachers.get(index);
    model.insertRow(tblteacher.getRowCount(),new Object[]{
        teacher.getName(),teacher.getId(),teacher.getSubject()
    });
    
        
                
                
    }
       

    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(school.getTeachers().isEmpty()){
         JOptionPane.showMessageDialog(Teacherlist.this, "Teacher list is empty");
         return;
     }  
        
    int row=tblteacher.getSelectedRow();
        String name = tblteacher.getModel().getValueAt(row,0 ).toString();
         ArrayList<Teacher> teachers=Home.school.getTeachers();
   for(int index=0 ;index<teachers.size();index++){
    Teacher teacher=teachers.get(index);
    if(teacher.getName().equals(name)){
        JOptionPane.showMessageDialog(Teacherlist.this,"Teacher Name: "+teacher.getName()+"\ngender: "+teacher.getGender()
                +"\nID: "+teacher.getId()
        +"\nSubject: "+teacher.getSubject()+"\nDate of joining: "+teacher.getDateofjoining()
        +"\nSalary: "+teacher.getSalary());
    }
       
}  
        
        
        //tblteacher.getValueAt(0,0)
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(tblteacher.getSelectedRow()==-1){
            JOptionPane.showMessageDialog(Teacherlist.this,"Select a row from Table");
            return;
        }
        int row=tblteacher.getSelectedRow();
        String name = tblteacher.getModel().getValueAt(row,0 ).toString();
         ArrayList<Teacher> teachers=Home.school.getTeachers();
          for(int index=0 ;index<teachers.size();index++){
              Teacher teacher=teachers.get(index);
        if(teacher.getName().equals(name)){
            Home.school.getTeachers().remove(index);
         }
          }
      model.removeRow(tblteacher.getSelectedRow());
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        tblteacher.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home.school.getTeachers().clear();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton4ActionPerformed
     
    
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
            java.util.logging.Logger.getLogger(Teacherlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacherlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacherlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacherlist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacherlist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblteacher;
    // End of variables declaration//GEN-END:variables
}
