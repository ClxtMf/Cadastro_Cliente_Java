package DAO;

import Beans.Bean_Cadastro;
import Services.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DAO_Login {

    public DAO_Login() {

    }

    public void CadastrarLogin(Bean_Cadastro Cadastro) {

        try {

            String SQLInsertion = "INSERT INTO tb_login (USUARIO, SENHA) VALUES (?, ? );";

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);

            STM.setString(1, Cadastro.getUSUARIO());
            STM.setString(2, Cadastro.getSENHA());

            STM.execute();

            ConnectionFactory.getConnection().commit();;
   

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar, erro de SQL no método 'CadastrarLogin'.", "ERRO DE SQL", 0);
        }

    }
        public void AtualizarLogin(Bean_Cadastro Atualizar) {

        try {

               String SQLInsertion = "UPDATE  tb_login SET USUARIO = ?, SENHA= ?  WHERE ID_LOGIN = "+Atualizar.getID_PESSOA()+";";
            

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);
            
   
            STM.setString(1, Atualizar.getUSUARIO());
            STM.setString(2, Atualizar.getSENHA());

           
            
                   JOptionPane.showMessageDialog(null, "Cadastrado LOGIN.."+Atualizar.getUSUARIO(), "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));
         
        
            STM.executeUpdate();
            STM.execute();

            ConnectionFactory.getConnection().commit();;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso..", "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar, erro de SQL..", "ERRO DE SQL", 0);
        }
        
    }
            public void RemoverLogin(Bean_Cadastro Remover) {
        try {
            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
           st.executeUpdate("DELETE FROM tb_login WHERE ID_LOGIN = " + Remover.getID_LOGIN() + ";");
           
           JOptionPane.showMessageDialog(null, "Usuário" + Remover.getUSUARIO() + " Removido com sucesso..", "REMOÇÃO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL Class RemoverLogin..", "ERRO DE SQL", 0);
        }
}
}
