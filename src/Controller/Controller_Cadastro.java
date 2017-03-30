package Controller;

import Beans.Bean_Cadastro;
import DAO.DAO_Endereco;
import DAO.DAO_Login;
import DAO.DAO_Pessoa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Controller_Cadastro {

    //Instancia...
    DAO_Endereco DE;
    DAO_Pessoa DP;
    DAO_Login DL;

    public Controller_Cadastro() {

        //Recebe...
        DE = new DAO_Endereco();
        DP = new DAO_Pessoa();
        DL = new DAO_Login();
    }

    /*  Função para verificar os dados do cliente, qualquer teste ou formalização
     de dados pode e deve ser feito exclusivamente aqui.
     */
    public boolean VerificarDados(Bean_Cadastro Cadastro) {

        //VERIFICADOR DA PESSOA***************************************************************************************
        //Se o nome do cliente estiver vazio, notificar.
        if (Cadastro.getNOME().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo Nome não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        //VERIFICADOS DO LOGIN ***************************************************************************************
        //Se o nome do cliente estiver vazio, notificar.
        if (Cadastro.getUSUARIO().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo USUARIO não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }
        if (Cadastro.getSENHA().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo SENHA não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        if (Cadastro.getSENHA1().equals("")) {
            JOptionPane.showMessageDialog(null, "Confirme a senha.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        if (Cadastro.getSENHA().contentEquals(Cadastro.getSENHA1())) {
        } else {
            JOptionPane.showMessageDialog(null, "Senha deve ser iguais.", "ERRO NA CONFIRMAÇÃO DA SENHA!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        //VERIFICADOR DO ENDEREÇO***********************************************************************************
        if (Cadastro.getRUA().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo RUA não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        //Se tudo passou sem erro, retorna valor verdadeiro.
        DP.CadastrarCliente(Cadastro);
        DL.CadastrarLogin(Cadastro);
        DE.CadastrarEndereco(Cadastro);
        return true;
    }

}
