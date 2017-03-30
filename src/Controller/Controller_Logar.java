package Controller;

import Beans.Bean_Cadastro;
import DAO.DAO_Logar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Controller_Logar {

    //Instancia...
    DAO_Logar DL;
    Bean_Cadastro BC;

    public Controller_Logar() {

        //Recebe...
        DL = new DAO_Logar();
        BC = new Bean_Cadastro();

    }

    /*  Função para verificar os dados do cliente, qualquer teste ou formalização de dados pode e deve ser feito 
    exclusivamente aqui.  */
    
    public boolean VerificarDados(Bean_Cadastro Logar) {

        //Se as duas lacunas estiverem vazio...
        if (Logar.getUSUARIO().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo USUARIO não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }
        if (Logar.getSENHA().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo SENHA não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }
      
        return !VerificarSenha(Logar) != true;
    }

    public boolean VerificarSenha(Bean_Cadastro senha) {
        //Chama o Logar pra criar conexão e ver se a senha que ele digitou confere
        if (DL.Logar(senha) == true) {

            if (!senha.getSENHA1().contentEquals(senha.getSENHA())) {
                JOptionPane.showMessageDialog(null, "Senha ERRADA", "NAOOOO", 0, new ImageIcon("Imagens/yes.gif"));
                //Ta errado, volta
                return false;
            }
            //Ta certo, avisa
            JOptionPane.showMessageDialog(null, "SENHA CERTA .", "CERTO", 0, new ImageIcon("Images/hack2.gif"));
            //Preenche os dados da pessoa pra ele ver
            DL.Dados_Pessoa(senha);
            DL.Dados_Endereco(senha);
            
        }
        //retorna verdadeiro pro VerificarDados
        return true;

    }
}
