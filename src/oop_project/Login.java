

package oop_project;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        login = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        bsignin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bsignup = new javax.swing.JButton();
        jcshow_password = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(200, 500));

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 200, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setPreferredSize(new java.awt.Dimension(600, 500));

        login.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        login.setText("LOGIN");

        username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        username.setText("Username");

        UsernameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setText("Password");

        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        bsignin.setBackground(new java.awt.Color(0, 102, 102));
        bsignin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bsignin.setForeground(new java.awt.Color(255, 255, 255));
        bsignin.setText("Sign in");
        bsignin.setActionCommand("Singn in");
        bsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsigninActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("don't have an account?");

        bsignup.setBackground(new java.awt.Color(255, 153, 0));
        bsignup.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bsignup.setForeground(new java.awt.Color(255, 255, 255));
        bsignup.setText("Sign up");
        bsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsignupActionPerformed(evt);
            }
        });

        jcshow_password.setBackground(new java.awt.Color(255, 255, 255));
        jcshow_password.setText("Show password");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password)
                    .addComponent(username)
                    .addComponent(UsernameField)
                    .addComponent(PasswordField)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcshow_password)
                            .addGroup(LeftLayout.createSequentialGroup()
                                .addComponent(bsignin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bsignup)))
                        .addGap(2, 2, 2)))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(248, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(245, 245, 245))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(login)
                .addGap(18, 18, 18)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcshow_password)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsignin)
                    .addComponent(jLabel4)
                    .addComponent(bsignup))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(200, 0, 600, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("LOGIN");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void bsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsignupActionPerformed
        SignUp signUpFrame = new SignUp();
        signUpFrame.setVisible(true);
        signUpFrame.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_bsignupActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        if(jcshow_password.isSelected()) {
            PasswordField.setEchoChar((char)0);
        }else {
            PasswordField.setEchoChar('•');
        }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void bsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsigninActionPerformed
        HomePage homePageFrame = new HomePage();
        homePageFrame.setVisible(true);
        homePageFrame.setLocationRelativeTo(null);
        setVisible(false);
    }//GEN-LAST:event_bsigninActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JButton bsignin;
    private javax.swing.JButton bsignup;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JLabel login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
