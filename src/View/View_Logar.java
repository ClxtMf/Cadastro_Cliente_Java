package View;

import Beans.Bean_Cadastro;
import Controller.Controller_Alterar;
import Controller.Controller_Logar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class View_Logar extends javax.swing.JInternalFrame {

    //Instancia as Views
    Bean_Cadastro BC;
    Controller_Logar CL;
    Controller_Alterar CA;

    public View_Logar() {
        initComponents();

        //Beans
        BC = new Bean_Cadastro();
        CL = new Controller_Logar();
        CA = new Controller_Alterar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane_Layer_Login = new javax.swing.JLayeredPane();
        F_Password = new javax.swing.JPasswordField();
        L_User = new javax.swing.JLabel();
        L_Password = new javax.swing.JLabel();
        F_User = new javax.swing.JTextField();
        B_Login = new javax.swing.JButton();
        B_Recuperar = new javax.swing.JButton();
        B_Novo_Cadastro = new javax.swing.JButton();
        Pane_Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pane_Rodape = new javax.swing.JPanel();
        Pane_Layer_Dados = new javax.swing.JLayeredPane();
        F_NOME = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        F_PROFISSAO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        F_CPF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        F_IDADE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        F_RG = new javax.swing.JTextField();
        F_SEXO = new javax.swing.JTextField();
        Pane_Layer_Endereco = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        F_RUA = new javax.swing.JTextField();
        F_BAIRRO = new javax.swing.JTextField();
        F_NUMERO = new javax.swing.JTextField();
        F_CIDADE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        B_Salvar = new javax.swing.JButton();
        B_Alterar = new javax.swing.JButton();
        B_Remover = new javax.swing.JButton();
        B_Logout = new javax.swing.JButton();

        setClosable(true);

        Pane_Layer_Login.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        Pane_Layer_Login.setToolTipText("Login");

        F_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_PasswordActionPerformed(evt);
            }
        });

        L_User.setText("Usuário:");

        L_Password.setText("Senha:");

        F_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_UserActionPerformed(evt);
            }
        });

        B_Login.setText("Login");
        B_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LoginActionPerformed(evt);
            }
        });

        B_Recuperar.setText("Perdeu a senha?");
        B_Recuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_RecuperarActionPerformed(evt);
            }
        });

        B_Novo_Cadastro.setText("Novo Cadastro");

        javax.swing.GroupLayout Pane_Layer_LoginLayout = new javax.swing.GroupLayout(Pane_Layer_Login);
        Pane_Layer_Login.setLayout(Pane_Layer_LoginLayout);
        Pane_Layer_LoginLayout.setHorizontalGroup(
            Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_Layer_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                        .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F_User)
                            .addComponent(F_Password)))
                    .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                        .addComponent(B_Novo_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(B_Recuperar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B_Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );
        Pane_Layer_LoginLayout.setVerticalGroup(
            Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_User)
                    .addComponent(F_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Password)
                    .addComponent(F_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Recuperar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Novo_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(B_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Pane_Layer_Login.setLayer(F_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(L_User, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(L_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(F_User, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(B_Login, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(B_Recuperar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(B_Novo_Cadastro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pane_Login.setBackground(new java.awt.Color(102, 102, 102));
        Pane_Login.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 3, 65)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        javax.swing.GroupLayout Pane_LoginLayout = new javax.swing.GroupLayout(Pane_Login);
        Pane_Login.setLayout(Pane_LoginLayout);
        Pane_LoginLayout.setHorizontalGroup(
            Pane_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_LoginLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_LoginLayout.setVerticalGroup(
            Pane_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Pane_Rodape.setBackground(new java.awt.Color(102, 102, 102));
        Pane_Rodape.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout Pane_RodapeLayout = new javax.swing.GroupLayout(Pane_Rodape);
        Pane_Rodape.setLayout(Pane_RodapeLayout);
        Pane_RodapeLayout.setHorizontalGroup(
            Pane_RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Pane_RodapeLayout.setVerticalGroup(
            Pane_RodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        Pane_Layer_Dados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        F_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_NOMEActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel5.setText("RG:");

        jLabel7.setText("Profissão:");

        jLabel6.setText("CPF:");

        jLabel4.setText("Sexo:");

        jLabel3.setText("Idade:");

        javax.swing.GroupLayout Pane_Layer_DadosLayout = new javax.swing.GroupLayout(Pane_Layer_Dados);
        Pane_Layer_Dados.setLayout(Pane_Layer_DadosLayout);
        Pane_Layer_DadosLayout.setHorizontalGroup(
            Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                        .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                                .addComponent(F_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F_SEXO))
                            .addComponent(F_RG)
                            .addComponent(F_CPF)
                            .addComponent(F_PROFISSAO)))
                    .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(F_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        Pane_Layer_DadosLayout.setVerticalGroup(
            Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(F_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(F_IDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(F_SEXO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(F_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(F_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(F_PROFISSAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        Pane_Layer_Dados.setLayer(F_NOME, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(F_PROFISSAO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(F_CPF, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(F_IDADE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(F_RG, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Dados.setLayer(F_SEXO, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pane_Layer_Endereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        jLabel9.setText("Bairro:");

        jLabel11.setText("Cidade:");

        jLabel8.setText("Rua:");

        jLabel10.setText("Número:");

        F_RUA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_RUAActionPerformed(evt);
            }
        });

        jLabel12.setText("*");

        javax.swing.GroupLayout Pane_Layer_EnderecoLayout = new javax.swing.GroupLayout(Pane_Layer_Endereco);
        Pane_Layer_Endereco.setLayout(Pane_Layer_EnderecoLayout);
        Pane_Layer_EnderecoLayout.setHorizontalGroup(
            Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(F_NUMERO))
                    .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(22, 22, 22)
                        .addComponent(F_CIDADE))
                    .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                        .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(27, 27, 27)
                        .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(F_BAIRRO)
                            .addComponent(F_RUA))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        Pane_Layer_EnderecoLayout.setVerticalGroup(
            Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_EnderecoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(F_RUA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(F_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(F_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_EnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(F_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_Layer_Endereco.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(F_RUA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(F_BAIRRO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(F_NUMERO, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(F_CIDADE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Endereco.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        B_Salvar.setText("Salvar");
        B_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SalvarActionPerformed(evt);
            }
        });

        B_Alterar.setText("Alterar");
        B_Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_AlterarActionPerformed(evt);
            }
        });

        B_Remover.setText("Remover");
        B_Remover.setToolTipText("Esse provesso irar apagar sua conta completamente.");

        B_Logout.setText("Logout");
        B_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pane_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pane_Rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Pane_Layer_Endereco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pane_Layer_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Pane_Layer_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pane_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pane_Layer_Login)
                    .addComponent(Pane_Layer_Dados))
                .addGap(18, 18, 18)
                .addComponent(Pane_Layer_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(B_Remover, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Alterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Pane_Rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void F_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_UserActionPerformed

    private void F_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_PasswordActionPerformed

    private void B_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LoginActionPerformed

        //botao login
          /*  Assim que pressionar o botão Salvar  ira executar Fillbeans para passar os 
         atributos para os Beans... */
        FillBeans();
if(CL.VerificarDados(BC) == true){
   
         
            FillDados();
         
            trava(false);

        
}
       

    }//GEN-LAST:event_B_LoginActionPerformed

    private void B_RecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_RecuperarActionPerformed

        // Botão recuperar senha

    }//GEN-LAST:event_B_RecuperarActionPerformed

    private void F_RUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_RUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_RUAActionPerformed

    private void B_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_LogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_LogoutActionPerformed

    private void F_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_NOMEActionPerformed

    private void B_AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_AlterarActionPerformed
        trava(true);
        JOptionPane.showMessageDialog(null, "APOS MODIFICAR DADOS, CLICAR EM SALVAR! .", "CUIDADO!", 0, new ImageIcon("Images/PARTY HARD.gif"));

    }//GEN-LAST:event_B_AlterarActionPerformed

    private void B_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SalvarActionPerformed

        FillBeans();

        if (CA.VerificarDados(BC)) {

            trava(false);
        }
    }//GEN-LAST:event_B_SalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Alterar;
    private javax.swing.JButton B_Login;
    private javax.swing.JButton B_Logout;
    private javax.swing.JButton B_Novo_Cadastro;
    private javax.swing.JButton B_Recuperar;
    private javax.swing.JButton B_Remover;
    private javax.swing.JButton B_Salvar;
    private javax.swing.JTextField F_BAIRRO;
    private javax.swing.JTextField F_CIDADE;
    private javax.swing.JTextField F_CPF;
    private javax.swing.JTextField F_IDADE;
    private javax.swing.JTextField F_NOME;
    private javax.swing.JTextField F_NUMERO;
    private javax.swing.JTextField F_PROFISSAO;
    private javax.swing.JPasswordField F_Password;
    private javax.swing.JTextField F_RG;
    private javax.swing.JTextField F_RUA;
    private javax.swing.JTextField F_SEXO;
    private javax.swing.JTextField F_User;
    private javax.swing.JLabel L_Password;
    private javax.swing.JLabel L_User;
    private javax.swing.JLayeredPane Pane_Layer_Dados;
    private javax.swing.JLayeredPane Pane_Layer_Endereco;
    private javax.swing.JLayeredPane Pane_Layer_Login;
    private javax.swing.JPanel Pane_Login;
    private javax.swing.JPanel Pane_Rodape;
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
    // End of variables declaration//GEN-END:variables

    final void FillBeans() {

        BC.setNOME(F_NOME.getText());
        BC.setIDADE(F_IDADE.getText());
        BC.setPROFISSAO(F_PROFISSAO.getText());
        BC.setRG(F_RG.getText());
        BC.setCPF(F_CPF.getText());
        BC.setSEXO(F_SEXO.getText());

        //Beans do Endereço
        BC.setRUA(F_RUA.getText());
        BC.setBAIRRO(F_BAIRRO.getText());
        BC.setCIDADE(F_CIDADE.getText());
        BC.setNUM(F_NUMERO.getText());

        //Beans do User/Password
        BC.setUSUARIO(F_User.getText());
        BC.setSENHA(F_Password.getText());
    }

    final void FillDados() {

        //Beans do Loign
        F_User.setText(BC.getUSUARIO());
        F_Password.setText(BC.getSENHA());

        //Beans da pessoa
        F_NOME.setText(BC.getNOME());
        F_IDADE.setText(BC.getIDADE());
        F_CPF.setText(BC.getCPF());
        F_PROFISSAO.setText(BC.getPROFISSAO());
        F_RG.setText(BC.getRG());
        F_SEXO.setText(BC.getSEXO());

        //Beans endereço
        F_RUA.setText(BC.getRUA());
        F_BAIRRO.setText(BC.getBAIRRO());
        F_CIDADE.setText(BC.getCIDADE());
        F_NUMERO.setText(BC.getNUM());

    }

    final void trava(boolean valor) {
        //Beans do Loign
        F_NOME.setEnabled(valor);
        F_IDADE.setEnabled(valor);
        F_CPF.setEnabled(valor);
        F_PROFISSAO.setEnabled(valor);
        F_RG.setEnabled(valor);
        F_SEXO.setEnabled(valor);

        //Beans do Loign
        F_User.setEnabled(valor);
        F_Password.setEnabled(valor);

        //Beans endereço
        F_RUA.setEnabled(valor);
        F_BAIRRO.setEnabled(valor);
        F_CIDADE.setEnabled(valor);
        F_NUMERO.setEnabled(valor);

    }

    public void Limpa() {

        F_NOME.setText("");
        F_BAIRRO.setText("");
        F_CIDADE.setText("");
        F_CPF.setText("");
        F_IDADE.setText("");
        F_NUMERO.setText("");
        F_PROFISSAO.setText("");
        F_Password.setText("");

        F_RG.setText("");
        F_RUA.setText("");
        F_User.setText("");
        F_SEXO.setText("");

    }

}
