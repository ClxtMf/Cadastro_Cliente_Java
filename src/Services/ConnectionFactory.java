package Services;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ConnectionFactory {

   private final String URL = "jdbc:mysql://127.0.0.1:3306/test";
    private final String Driver = "com.mysql.jdbc.Driver";
    private final String Usuario = "root";
    private final String Senha = "root";
    private static Connection con;

    public ConnectionFactory() {

        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(URL, Usuario, Senha);
            con.setAutoCommit(false);

            JOptionPane.showMessageDialog(null, "Conectou com sucesso.", "Servidor Conectado", 0, new ImageIcon("Images/hack.gif"));
          
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro na conxao com o banco de dados..", "ERRO DE Banco", 0);
        }

    }

    public static Connection getConnection() {
        if (con == null) {
            new ConnectionFactory();
        }
        return con;
    }

    public static void CloseConnection() {

        try {
            if (!con.isClosed()) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
