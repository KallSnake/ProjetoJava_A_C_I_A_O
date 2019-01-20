package controller;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDB {

    private final String DRIVER_CLASS = "org.hsqldb.jdbcDriver";
    Connection cnx = null;
    private final String usuario = "SA";
    private final String senha = "";
    private final String PathBase = "C:\\Users\\Eduardo\\Documents\\ProjetoJava_A_C_I_A_O\\libhsql\\projetojava\\aciao";
    private final String URL = "jdbc:hsqldb:file:" + PathBase + ";shutdown=true;hsqldb.write_delay=false; ";
    public Statement stm;  // PREPARAR E REALIZAR PESQUISAS
    public ResultSet rs;  // GUARDAR O QUE FOI PESQUISADO

    // C:\Users\Eduardo\Documents\ProjetoJava_A_C_I_A_O\libhsql\projetojava
    
    public void conexao() {

        try {
            Class.forName(DRIVER_CLASS);
            // Estabelendo ConexaoDB
            cnx = DriverManager.getConnection(URL, usuario, senha);
           // JOptionPane.showMessageDialog(null, "Conexão com a Base de Dados realizado com sucesso!!");
        } catch (ClassNotFoundException e) {
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar com a Base de Dados!");
            // JOptionPane.showMessageDialog(null, "Erro ao conectar com a Base de Dados!! \n ERRO: " + e);
        }

    }

    public void desconecta() {
        try {
            cnx.close();
            cnx = null;
           // JOptionPane.showMessageDialog(null, "Base de Dados desconectado com sucesso!!");
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com a Base de Dados!");
            // JOptionPane.showMessageDialog(null, "Erro ao desconectar com a Base de Dados! \n ERRO: " + e);

        }
    }

    public void executaSQL(String sql) {
        try {
            stm = cnx.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao executar sql!");
            // JOptionPane.showMessageDialog(null, "Erro ao executaSQL!" + ex);
        }

    }

}
