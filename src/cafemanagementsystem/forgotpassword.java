/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafemanagementsystem;

import dao.UserDao;
import javax.swing.JOptionPane;
import model.UserClass;
/**
 *
 * @author BENJAMIN DUTTA
 */
public class forgotpassword extends javax.swing.JFrame {

    /**
     * Creates new form forgotpassword
     */
    
    private String dbanswer=null;
    public String emailPattern="^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    private String email=null;
    
    
    public forgotpassword() {
        initComponents();
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtSecQuestion.setEditable(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void clear(){
        btnUpdate.setEnabled(false);
        btnSearch.setEnabled(false);
        txtEmail.setText("");
        txtSecQuestion.setText("");
        txtPassword.setText("");
        txtAnswer.setText("");
        
    }
    public void validateEmail(){
        email=txtEmail.getText();
        if(email.matches(emailPattern)){
            btnSearch.setEnabled(true);
        }else{
            btnSearch.setEnabled(false);
        }
    }
    public void validateFields(){
        String password=txtPassword.getText();
        String secQuestion=txtSecQuestion.getText();
        String answer=txtAnswer.getText();
        
        if(!password.equals("")&&!secQuestion.equals("")&&!answer.equals("")){
            btnUpdate.setEnabled(true);
        }else{
            btnUpdate.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new java.awt.TextField();
        txtSecQuestion = new java.awt.TextField();
        txtAnswer = new java.awt.TextField();
        txtPassword = new java.awt.TextField();
        btnUpdate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSingup = new javax.swing.JButton();
        btnLongin = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Forgot Password?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 145, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 211, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Your Security Question :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 259, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 327, 37, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Your answer:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 295, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Enter New Password :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 337, 154, -1));

        txtEmail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 205, 380, -1));

        txtSecQuestion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtSecQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSecQuestionKeyReleased(evt);
            }
        });
        getContentPane().add(txtSecQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 256, 380, -1));

        txtAnswer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnswerKeyReleased(evt);
            }
        });
        getContentPane().add(txtAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 292, 380, -1));

        txtPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 337, 380, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 379, -1, -1));

        btnClean.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClean.setText("Clear");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        getContentPane().add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 379, -1, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 379, -1, -1));

        btnSingup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSingup.setText("Signup");
        btnSingup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSingupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSingup, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 444, -1, -1));

        btnLongin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLongin.setText("Login");
        btnLongin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLonginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLongin, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 444, -1, -1));

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(953, 205, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/first page background.PNG"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateEmail();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSecQuestionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecQuestionKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtSecQuestionKeyReleased

    private void txtAnswerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnswerKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtAnswerKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "Do you really want to close the application?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                System.exit(0);
            }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSingupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSingupActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_btnSingupActionPerformed

    private void btnLonginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLonginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
          new login().setVisible(true);
    }//GEN-LAST:event_btnLonginActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String answer=txtAnswer.getText();
        String password=txtPassword.getText();
        
        if(answer.equals(dbanswer)){
            UserDao.updatePassword(email, password);
            clear();
        }else{
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">Incorrect Answer</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        email=txtEmail.getText();
        UserClass user=null;
        user=UserDao.getSecurityQuestion(email);
        if(user==null){
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:red\">Incorrect Email</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            btnSearch.setEnabled(false);
            txtEmail.setEditable(false);
            dbanswer=user.getAnswer();
            txtSecQuestion.setText(user.getSecurityQuestion());
            validateFields();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLongin;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSingup;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private java.awt.TextField txtAnswer;
    private java.awt.TextField txtEmail;
    private java.awt.TextField txtPassword;
    private java.awt.TextField txtSecQuestion;
    // End of variables declaration//GEN-END:variables
}
