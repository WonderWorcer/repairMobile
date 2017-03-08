/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.rem.otdel;

import main.rem.otdel.DetailsStore;
import main.rem.otdel.Orders;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import main.rem.otdel.EngineerForm;

/**
 *
 * @author tigler
 */
public class LoginFrame extends javax.swing.JFrame {

    String managerLogin = "manager1";
    String managerParol = "manager11";

    String engineerLogin = "engineer1";
    String engineerParol = "engineer11";


    String adminLogin = "admin";
    String adminParol = "admin";

    /**
     * Creates new form Login
     */
    public LoginFrame() {
        initComponents();
        jLabelIncorrect.setVisible(false);
        jLabelIncorrect.setForeground(Color.RED);
        UIManager.put("OptionPane.yesButtonText", "Да");
        UIManager.put("OptionPane.noButtonText", "Нет");
        UIManager.put("OptionPane.cancelButtonText", "Отмена");
        UIManager.put("OptionPane.okButtonText", "Готово");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabelLogin = new javax.swing.JLabel();
        jLabelParol = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        jLabelIncorrect = new javax.swing.JLabel();
        jCheckBoxParol = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Инициализация пользователя"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jLabelLogin.setText("Логин");

        jLabelParol.setText("Пароль");

        jPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldKeyPressed(evt);
            }
        });

        jTextFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoginKeyPressed(evt);
            }
        });

        jButtonEnter.setText("Войти");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        jButtonEnter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonEnterKeyPressed(evt);
            }
        });

        jLabelIncorrect.setText("Логин или пароль некорректны");

        jCheckBoxParol.setText("Показать пароль");
        jCheckBoxParol.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBoxParolItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxParol))
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIncorrect)
                            .addComponent(jLabelLogin)
                            .addComponent(jLabelParol))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelParol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxParol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelIncorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEnter)
                .addGap(18, 18, 18))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        try {
            // TODO add your handling code here:
            ResultSet resSet = null;
            String userLogin = null;
            String userPassword = null;
            String loginTextField = jTextFieldLogin.getText();
            char[] parol = jPasswordField.getPassword();
            String passwordTextField = String.valueOf(parol);
            int hashPass = passwordTextField.hashCode();

            resSet = RepairMobile.st.executeQuery("select manager.login,manager.password, manager.PK_manager  from manager");

            while (resSet.next()) {
                userLogin = resSet.getString(1);
                userPassword = resSet.getString(2);
                int hashUserPassword = Integer.parseInt(userPassword);
                if (loginTextField.equals(userLogin) && hashPass == hashUserPassword) {
                    Orders orders = null;
                    orders = new Orders(resSet.getInt(3));
                    orders.setVisible(true);
                    this.dispose();
                }
            }

            resSet = RepairMobile.st.executeQuery("select engineer.login,engineer.password, engineer.PK_engineer from engineer");

            while (resSet.next()) {
                userLogin = resSet.getString(1);
                userPassword = resSet.getString(2);
                int hashUserPassword = Integer.parseInt(userPassword);
                if (loginTextField.equals(userLogin) && hashPass == hashUserPassword) {
                    EngineerForm engineerForm = null;
                    engineerForm = new EngineerForm(resSet.getInt(3));
                    engineerForm.setVisible(true);
                    this.dispose();
                }
            }

            if (loginTextField.equals(adminLogin) && passwordTextField.equals(adminParol)) {
                DetailsStore admin = new DetailsStore();
                admin.setVisible(true);
                this.dispose();
            } else {
                jLabelIncorrect.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jTextFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonEnter.doClick();
        }
    }//GEN-LAST:event_jTextFieldLoginKeyPressed

    private void jPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonEnter.doClick();
        }
    }//GEN-LAST:event_jPasswordFieldKeyPressed

    private void jButtonEnterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonEnterKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonEnter.doClick();
        }
    }//GEN-LAST:event_jButtonEnterKeyPressed

    private void jCheckBoxParolItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBoxParolItemStateChanged
        if (jCheckBoxParol.isSelected() == true) {
            jPasswordField.setEchoChar((char) 0);
        } else {
            jPasswordField.setEchoChar((char) 8226);
        }
    }//GEN-LAST:event_jCheckBoxParolItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JCheckBox jCheckBoxParol;
    private javax.swing.JLabel jLabelIncorrect;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelParol;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldLogin;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
