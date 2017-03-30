package DAO;

import Beans.Bean_Cadastro;
import Services.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAO_Logar {


    public DAO_Logar() {

    }

    //Void Public Logar, aonde usarei o objeto Logar com os dados do Bean
    public boolean Logar(Bean_Cadastro Logar) {

        try {

            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
            ResultSet RS = st.executeQuery("SELECT * FROM tb_login WHERE USUARIO = '" + Logar.getUSUARIO() + "'");

            //Se não tiver esse usuário no banco, avisa o cara.
            boolean moreRecords = RS.first();

            if (moreRecords == false) {
                JOptionPane.showMessageDialog(null, "O usuário não existe!");
                return false;

            } else {

                //Pega os dados do BD e coloca nessas variáveis...
                String login = RS.getString("USUARIO");
                String senha = RS.getString("SENHA");
                int id_login = Integer.parseInt(RS.getString("ID_LOGIN"));

                //Vai la no Bean Cadastro e salva senha 1 como a senha correta.
                Logar.setSENHA1(senha);
                Logar.setID_LOGIN(id_login);
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL Class DAO_Logar..", "ERRO DE SQL", 0);
        }
        return true;
    }

    public boolean Dados_Pessoa(Bean_Cadastro Logar) {

        try {
            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
            ResultSet RS = st.executeQuery("SELECT * FROM tb_pessoa WHERE ID_PESSOA = "+Logar.getID_LOGIN()+"");

            //Pega os dados do BD e coloca nessas variáveis...
            while (RS.next()) {
                int ID_PESSOA = Integer.parseInt(RS.getString("ID_PESSOA"));
                String NOME = RS.getString("NOME");
                String RG = RS.getString("RG");
                String CPF = RS.getString("CPF");
                String PROFISSAO = RS.getString("PROFISSAO");
                String SEXO = RS.getString("SEXO");
                String IDADE = RS.getString("IDADE");
                
                 Logar.setID_PESSOA(ID_PESSOA);
                Logar.setNOME(NOME);
                Logar.setRG(RG);
                Logar.setCPF(CPF);
           
                Logar.setPROFISSAO(PROFISSAO);
                Logar.setSEXO(SEXO);
                Logar.setIDADE(IDADE);
               
         
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL Class DAO_Logar..", "ERRO DE SQL", 0);
        }
        return true;
    }
    
      public void Dados_Endereco(Bean_Cadastro Logar) {

        try {
            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
            ResultSet RS = st.executeQuery("SELECT * FROM tb_endereco WHERE ID_END = "+Logar.getID_LOGIN()+"");

            //Pega os dados do BD e coloca nessas variáveis...
            while (RS.next()) {
            
                String RUA = RS.getString("RUA");
                String BAIRRO = RS.getString("BAIRRO");
                String NUM = RS.getString("NUM");
                String CIDADE = RS.getString("CIDADE");
                
                Logar.setRUA(RUA);
                Logar.setBAIRRO(BAIRRO);
                Logar.setNUM(NUM);
                Logar.setCIDADE(CIDADE);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL Class DAO_Logar..", "ERRO DE SQL", 0);
        }
    }
}
