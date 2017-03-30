package Controller;

import Beans.Bean_Cadastro;
import DAO.DAO_Endereco;
import DAO.DAO_Logar;
import DAO.DAO_Login;
import DAO.DAO_Pessoa;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Controller_Alterar {

    //Instancia...
    DAO_Pessoa DP;
    DAO_Logar DO;
    DAO_Login DL;
    DAO_Endereco DE;
    Bean_Cadastro BC;

    public Controller_Alterar() {

        //Recebe...
        DP = new DAO_Pessoa();
        DO = new DAO_Logar();
        DL = new DAO_Login();
        DE = new DAO_Endereco();
        BC = new Bean_Cadastro();

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

        //VERIFICADOR DO ENDEREÇO***********************************************************************************
        if (Cadastro.getRUA().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo RUA não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        //Se tudo passou sem erro, retorna valor verdadeiro.
        DP.AtualizarPessoa(Cadastro);
        DE.AtualizarEndereco(Cadastro);
        DL.AtualizarLogin(Cadastro);

        return true;
    }

    public boolean VerificarLogin(Bean_Cadastro Cadastro) {

        if (Cadastro.getUSUARIO().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo USUARIO não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }
        if (Cadastro.getSENHA().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo SENHA não pode estar vazio.", "ERRO DE PREENCHIMENTO!", 0, new ImageIcon("Images/no.gif"));
            return false;
        }

        //Loga pra pegar ID_Login, usa na PEssoa e pega os dados
        if (DO.Logar(Cadastro) == true && DO.Dados_Pessoa(Cadastro) == true) {
                     
           //Se der certo vai pro proximo
        }else{
             JOptionPane.showMessageDialog(null, "logar.", "Erro!", 0, new ImageIcon("Images/no.gif"));
             return false;
        }
         
            if (Cadastro.getCPF().contentEquals(Cadastro.getCPF1())) {
                DP.RemoverPessoa(Cadastro);
                DE.RemoverEndereco(Cadastro);
                DL.RemoverLogin(Cadastro);

            } else {
                JOptionPane.showMessageDialog(null, "CPF INVALIDO.", "ERRO NA CONFIRMAÇÃO DO CPF!", 0, new ImageIcon("Images/no.gif"));
                return false;
            }
        return true;
    }
}
