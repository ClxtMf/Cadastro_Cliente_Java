package DAO;

import Beans.Bean_Cadastro;
import Services.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DAO_Pessoa {

    public DAO_Pessoa() {

    }

    public void CadastrarCliente(Bean_Cadastro Cadastro) {

        try {

               String SQLInsertion = "INSERT INTO tb_pessoa (NOME, RG, CPF, PROFISSAO, SEXO) VALUES (?,  ?,  ?, ?, ? );";
            

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);

            STM.setString(1, Cadastro.getNOME());
            STM.setString(2, Cadastro.getRG());
            STM.setString(3, Cadastro.getCPF());
            STM.setString(4, Cadastro.getPROFISSAO());
            STM.setString(5, Cadastro.getSEXO());
         
        

            STM.execute();
            

            ConnectionFactory.getConnection().commit();;
          

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar Pessoa, erro de SQL no método 'CadastrarCliente'.", "ERRO DE SQL", 0);
        }
        
    }
    
        public void AtualizarPessoa(Bean_Cadastro Atualizar) {

        try {

               String SQLInsertion = "UPDATE  tb_pessoa SET NOME = ?, RG= ?, CPF= ?, PROFISSAO= ?, SEXO= ?  WHERE ID_PESSOA = "+Atualizar.getID_PESSOA()+";";
            

            PreparedStatement STM = ConnectionFactory.getConnection().prepareStatement(SQLInsertion);
            
   
            STM.setString(1, Atualizar.getNOME());
            STM.setString(2, Atualizar.getRG());
            STM.setString(3, Atualizar.getCPF());
            STM.setString(4, Atualizar.getPROFISSAO());
            STM.setString(5, Atualizar.getSEXO());
            
                   JOptionPane.showMessageDialog(null, "Cadastrado.."+Atualizar.getNOME(), "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));
         
        
            STM.executeUpdate();
            STM.execute();

            ConnectionFactory.getConnection().commit();;
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso..", "CADASTRO EFETIVADO", 0, new ImageIcon("Images/hack2.gif"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Impossível cadastrar, erro de SQL..", "ERRO DE SQL", 0);
        }
        
    } 
        
            public void RemoverPessoa(Bean_Cadastro Remover) {
        try {
            //Abre a conecxão e cria um Statement.
            Statement st = ConnectionFactory.getConnection().createStatement();

            //RS recebe o valor
              st.executeUpdate("DELETE FROM tb_pessoa WHERE ID_PESSOA = " + Remover.getID_LOGIN() + ";");
              

 

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AQUI NO REMOVERPESSOAr..", "ERRO DE SQL", 0);
        }
                
          
    }
}
