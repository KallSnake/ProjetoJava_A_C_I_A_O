package controller;


import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelUsuarios;

public class ControllerUsuarios {
    
    ConexaoDB conecta = new ConexaoDB();
    ModelUsuarios musuario = new ModelUsuarios();
    
    
    public void salvar(ModelUsuarios musuario) {

        conecta.conexao();

        try {

            String sql = ("INSERT INTO USUARIOS(\"NOME_USUARIO\",\"SOBRENOME_USUARIO\",\"NOME_DE_USUARIO\",\"SENHA_USUARIO\") VALUES(?,?,?,?)");

            PreparedStatement pstm = conecta.cnx.prepareStatement(sql);

            pstm.setString(1, musuario.getNome_usuario());
            pstm.setString(2, musuario.getSobrenome_usuario());
            pstm.setString(3, musuario.getNome_de_usuario());
            pstm.setString(4, musuario.getSenha_usuario());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao cadastrar dados \n Error: " + ex);

        }

        conecta.desconecta();

    }
    
    
    public void editar(ModelUsuarios musuario) {

        conecta.conexao();

        try {

            String sql = ("update "
                    + "usuarios"
                    + " set "
                    + "nome_usuario=?,"
                    + "sobrenome_usuario=?,"
                    + "nome_de_usuario=?,"
                    + "senha_usuario=? "
                    + "where "
                    + "cod_usuario=?");

            PreparedStatement pstm = conecta.cnx.prepareStatement(sql);

            pstm.setString(1, musuario.getNome_usuario());
            pstm.setString(2, musuario.getSobrenome_usuario());
            pstm.setString(3, musuario.getNome_de_usuario());
            pstm.setString(4, musuario.getSenha_usuario());
            pstm.setInt(5, musuario.getCod_usuario());
            
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados do usuário alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
        }

        conecta.desconecta();
    }
    
    
    public void excluir(ModelUsuarios musuario) {
        
        conecta.conexao();

        try {
            
            String sql = ("delete from usuarios where cod_usuario=?");
            
            PreparedStatement pstm = conecta.cnx.prepareStatement(sql);
            
            pstm.setInt(1, musuario.getCod_usuario());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário \n Error: " + ex);
        }

        conecta.desconecta();
    }

    
    public ModelUsuarios buscarUsuario(ModelUsuarios musuario) {
        
        conecta.conexao();
        
        String sql = ("select * from  usuarios where nome_usuario like '%" + musuario.getPesquisa() + "%' ");
        
        conecta.executaSQL(sql);

        try {
            
            conecta.rs.first();
            
            musuario.setCod_usuario(conecta.rs.getInt("cod_usuario"));
            musuario.setNome_usuario(conecta.rs.getString("nome_usuario"));
            musuario.setSobrenome_usuario(conecta.rs.getString("sobrenome_usuario"));
            musuario.setNome_de_usuario(conecta.rs.getString("nome_de_usuario"));
            musuario.setSenha_usuario(conecta.rs.getString("senha_usuario"));

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao pesquisar usuário!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar usuário! \n Error: " + ex);

        }

        conecta.desconecta();
        
        return musuario;
    } 
        
    
    
    
}
