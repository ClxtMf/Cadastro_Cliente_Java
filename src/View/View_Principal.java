package View;

import Services.Desktop;
import java.awt.GridLayout;
import javax.swing.JFrame;

public class View_Principal extends javax.swing.JFrame {

    //Instanciando Desktop pra deixar uma imagem no fundo do sistema.
    Desktop DT;

    //Das janelas
    View_Cadastro VC;
    View_Logar VL;
    View_Remover VR;

    public View_Principal() {
        
        //Método construtor, assim que iniciar, faça isso;
        initComponents();
        //Deixa tela full screen
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());

        //Essa imagem como Desktop
        DT = new Desktop("Images/wp.jpg");
        getContentPane().add(DT);

        
    }

    //Coisa do sistema, melhor não mecher, ta funcionando assim...
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        V_P_Barra_Menu = new javax.swing.JMenuBar();
        V_P_M_Menu = new javax.swing.JMenu();
        V_P_MI_Novo_Cadastro = new javax.swing.JMenuItem();
        V_I_M_Login = new javax.swing.JMenuItem();
        V_M_I_Remover = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tópicos Especiais em T.I - II.");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        V_P_M_Menu.setText("Menu");
        V_P_M_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_P_M_MenuActionPerformed(evt);
            }
        });

        V_P_MI_Novo_Cadastro.setText("Novo Cadastro");
        V_P_MI_Novo_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_P_MI_Novo_CadastroActionPerformed(evt);
            }
        });
        V_P_M_Menu.add(V_P_MI_Novo_Cadastro);

        V_I_M_Login.setText("Login");
        V_I_M_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_I_M_LoginActionPerformed(evt);
            }
        });
        V_P_M_Menu.add(V_I_M_Login);

        V_M_I_Remover.setText("Remover");
        V_M_I_Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_M_I_RemoverActionPerformed(evt);
            }
        });
        V_P_M_Menu.add(V_M_I_Remover);

        V_P_Barra_Menu.add(V_P_M_Menu);

        setJMenuBar(V_P_Barra_Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void V_P_MI_Novo_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_P_MI_Novo_CadastroActionPerformed
        
        //Chama tela de novo cadastro;
        VC = new View_Cadastro();
        DT.add(VC);
        VC.setVisible(true);


    }//GEN-LAST:event_V_P_MI_Novo_CadastroActionPerformed


    private void V_P_M_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_P_M_MenuActionPerformed

    }//GEN-LAST:event_V_P_M_MenuActionPerformed

    private void V_I_M_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_I_M_LoginActionPerformed

        //Chama a tela de login;
        VL = new View_Logar();
        DT.add(VL);
        VL.setVisible(true);

        
    }//GEN-LAST:event_V_I_M_LoginActionPerformed


    private void V_M_I_RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_M_I_RemoverActionPerformed
       
        //Chama tela de Remover;
        VR = new View_Remover();
        DT.add(VR);
        VR.setVisible(true);
        
        
    }//GEN-LAST:event_V_M_I_RemoverActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(View_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem V_I_M_Login;
    private javax.swing.JMenuItem V_M_I_Remover;
    private javax.swing.JMenuBar V_P_Barra_Menu;
    private javax.swing.JMenuItem V_P_MI_Novo_Cadastro;
    private javax.swing.JMenu V_P_M_Menu;
    // End of variables declaration//GEN-END:variables

}
