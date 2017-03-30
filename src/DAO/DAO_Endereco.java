package DAO;

import Beans.Bean_Cadastro;
import Services.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DAO_Endereco {

    public DAO_Endereco() {

    }

    public void CadastrarEndereco(Bean_Cadastro Cadastro) {

        try {

            String SQLInsertion = "INSERT INTO tb_endereco (RUA, BAIRRO, NUM, CIDADE) VALUES (?, ?, ?, ? );";

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);

            STM.setString(1, Cadastro.getRUA());
            STM.setString(2, Cadastro.getBAIRRO());
            STM.setString(3, Cadastro.getNUM());
            STM.setString(4, Cadastro.getCIDADE());

            STM.execute();

            ConnectionFactory.getConnection().commit();;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso.", "CADASTRO EFETIVADO", 0, new ImageIcon("Images/PARTY HARD.gif"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar, erro de SQL no método 'CadastrarEndereco'.", "ERRO DE SQL", 0);
        }
    }
    
         public void AtualizarEndereco(Bean_Cadastro Atualizar) {

        try {

               String SQLInsertion = "UPDATE  tb_endereco SET RUA = ?, BAIRRO= ?, NUM= ?, CIDADE= ?  WHERE ID_END = "+Atualizar.getID_PESSOA()+";";
            

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);
            
   
            STM.setString(1, Atualizar.getRUA());
            STM.setString(2, Atualizar.getBAIRRO());
            STM.setString(3, Atualizar.getNUM());
            STM.setString(4, Atualizar.getCIDADE());
           
            
                   JOptionPane.showMessageDialog(null, "Cadastrado ENDERECO.."+Atualizar.getRUA(), "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));
         
        
            STM.executeUpdate();
            STM.execute();

            ConnectionFactory.getConnection().commit();;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso..", "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar, erro de SQL..", "ERRO DE SQL", 0);
        }
        
    }
       
    public void RemoverEndereco(Bean_Cadastro Remover) {
        try {
            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
            st.executeUpdate("DELETE FROM tb_endereco WHERE ID_END = " + Remover.getID_LOGIN() + ";");
 st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro SQL ClaENDERECOss ..", "ERRO DE SQL", 0);
        }
    }
}
