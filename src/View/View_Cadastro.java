package View;

import Beans.Bean_Cadastro;
import Controller.Controller_Cadastro;
import Services.ConnectionFactory;
import javax.swing.text.MaskFormatter;

public class View_Cadastro extends javax.swing.JInternalFrame {

    //Mascara para deixar os formatos do CPF e TEL correto.
    MaskFormatter FormatoCpf;
    MaskFormatter FormatoTel;

    //Instancia as Views
    Bean_Cadastro BC;

    //Os Controllers
    Controller_Cadastro CC;

    public View_Cadastro() {
        initComponents();

        //Beans
        BC = new Bean_Cadastro();

        //Controllers
        CC = new Controller_Cadastro();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        Painel_Cadastro_Cliente = new javax.swing.JLabel();
        B_Save = new javax.swing.JButton();
        B_Clean = new javax.swing.JButton();
        Tarja_layout = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        Pane_Layer_Login = new javax.swing.JLayeredPane();
        F_Password = new javax.swing.JPasswordField();
        L_User = new javax.swing.JLabel();
        L_Password = new javax.swing.JLabel();
        L_Password1 = new javax.swing.JLabel();
        F_Password1 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        F_User = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
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
        Painel_letras_baixa = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Cliente");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        Painel_Cadastro_Cliente.setBackground(new java.awt.Color(153, 153, 153));
        Painel_Cadastro_Cliente.setFont(new java.awt.Font("Sylfaen", 3, 65)); // NOI18N
        Painel_Cadastro_Cliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Painel_Cadastro_Cliente.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Cadastro_Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel_Cadastro_Cliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        B_Save.setText("Salvar");
        B_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_SaveActionPerformed(evt);
            }
        });

        B_Clean.setText("Limpar");
        B_Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_CleanActionPerformed(evt);
            }
        });

        Tarja_layout.setBackground(new java.awt.Color(102, 102, 102));
        Tarja_layout.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout Tarja_layoutLayout = new javax.swing.GroupLayout(Tarja_layout);
        Tarja_layout.setLayout(Tarja_layoutLayout);
        Tarja_layoutLayout.setHorizontalGroup(
            Tarja_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Tarja_layoutLayout.setVerticalGroup(
            Tarja_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        Pane_Layer_Dados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel2.setText("Nome:");

        jLabel5.setText("RG:");

        jLabel7.setText("Profissão:");

        jLabel6.setText("CPF:");

        jLabel4.setText("Sexo:");

        jLabel3.setText("Idade:");

        jLabel13.setText("*");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        Pane_Layer_DadosLayout.setVerticalGroup(
            Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_DadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_DadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(F_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap())
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
        Pane_Layer_Dados.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Pane_Layer_Login.setBorder(javax.swing.BorderFactory.createTitledBorder("Login"));
        Pane_Layer_Login.setToolTipText("Login");

        F_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_PasswordActionPerformed(evt);
            }
        });

        L_User.setText("Usuário:");

        L_Password.setText("Senha:");

        L_Password1.setText("Repita a senha:");

        F_Password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_Password1ActionPerformed(evt);
            }
        });

        jLabel14.setText("*");

        jLabel15.setText("*");

        F_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_UserActionPerformed(evt);
            }
        });

        jLabel16.setText("*");

        javax.swing.GroupLayout Pane_Layer_LoginLayout = new javax.swing.GroupLayout(Pane_Layer_Login);
        Pane_Layer_Login.setLayout(Pane_Layer_LoginLayout);
        Pane_Layer_LoginLayout.setHorizontalGroup(
            Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                        .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L_User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(F_Password))
                            .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(F_User))))
                    .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                        .addComponent(L_Password1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(F_Password1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        Pane_Layer_LoginLayout.setVerticalGroup(
            Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_Layer_LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_User)
                        .addComponent(F_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Password)
                    .addComponent(F_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_Layer_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Password1)
                        .addComponent(F_Password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pane_Layer_Login.setLayer(F_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(L_User, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(L_Password, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(L_Password1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(F_Password1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(F_User, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Pane_Layer_Login.setLayer(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        Painel_letras_baixa.setText("Itens com * são de preenchimento obrigatorio.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Tarja_layout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pane_Layer_Dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pane_Layer_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Painel_letras_baixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pane_Layer_Endereco)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pane_Layer_Dados)
                    .addComponent(Pane_Layer_Login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pane_Layer_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Clean, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Painel_letras_baixa))
                .addGap(18, 18, 18)
                .addComponent(Tarja_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_CleanActionPerformed

        //Limpa as lacunas
       Clean();

       
    }//GEN-LAST:event_B_CleanActionPerformed

    private void B_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_SaveActionPerformed

        /*  Assim que pressionar o botão Salvar ira executar Fillbeans para passar os 
         atributos para os Beans... */
        FillBeans();

        /*  Os dados que agora estão com os Beans serão testado e verificado pelos 
         Controllers, se não ouver problemas, ira salvar os dados e limpar as lacunas... */
        if (CC.VerificarDados(BC)) {
            
            //Se retornar True, vai salvar e limpar a tela.
            Clean();

        }
    }//GEN-LAST:event_B_SaveActionPerformed

    private void F_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_PasswordActionPerformed

    private void F_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_UserActionPerformed

    private void F_Password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_Password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_Password1ActionPerformed

    private void F_RUAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_RUAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F_RUAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Clean;
    private javax.swing.JButton B_Save;
    private javax.swing.JTextField F_BAIRRO;
    private javax.swing.JTextField F_CIDADE;
    private javax.swing.JTextField F_CPF;
    private javax.swing.JTextField F_IDADE;
    private javax.swing.JTextField F_NOME;
    private javax.swing.JTextField F_NUMERO;
    private javax.swing.JTextField F_PROFISSAO;
    private javax.swing.JPasswordField F_Password;
    private javax.swing.JPasswordField F_Password1;
    private javax.swing.JTextField F_RG;
    private javax.swing.JTextField F_RUA;
    private javax.swing.JTextField F_SEXO;
    private javax.swing.JTextField F_User;
    private javax.swing.JLabel L_Password;
    private javax.swing.JLabel L_Password1;
    private javax.swing.JLabel L_User;
    private javax.swing.JLabel Painel_Cadastro_Cliente;
    private javax.swing.JLabel Painel_letras_baixa;
    private javax.swing.JLayeredPane Pane_Layer_Dados;
    private javax.swing.JLayeredPane Pane_Layer_Endereco;
    private javax.swing.JLayeredPane Pane_Layer_Login;
    private javax.swing.JPanel Tarja_layout;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /*  Atributos recebido sobre os dados do cliente
     sera armazenado momentaniamente na classe
     Beans_Client para melhor organização.
     */
    public void FillBeans() {
        
        //Beans da Pessoa
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

        /*Beans do User/Password
        PS: Password é o digitado, Password1 é a que vai ser usado
        no teste e que vai receber do BD pra teste*/
        BC.setUSUARIO(F_User.getText());
        BC.setSENHA(F_Password.getText());
        BC.setSENHA1(F_Password1.getText());
        
        
    }

    final void Clean() {
        
    /*      Função para limpar texto, chame sempre que necessario
     vale lembrar que funções "final" são de uso exclusivo da 
     classe a qual pertençe. */
        
        F_NOME.setText("");
        F_BAIRRO.setText("");
        F_CIDADE.setText("");
        F_CPF.setText("");
        F_IDADE.setText("");
        F_NUMERO.setText("");
        F_PROFISSAO.setText("");
        F_Password.setText("");
        F_Password1.setText("");
        F_RG.setText("");
        F_RUA.setText("");
        F_User.setText("");
        F_SEXO.setText("");
        
    }
}
