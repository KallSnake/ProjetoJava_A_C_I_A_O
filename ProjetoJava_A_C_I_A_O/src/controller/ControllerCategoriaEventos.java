package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelCategoriaEventos;


public class ControllerCategoriaEventos {
    
     ConexaoDB conectaCategoriaEventos = new ConexaoDB();
     ModelCategoriaEventos mcateven = new ModelCategoriaEventos();
     
     
    public void salvar(ModelCategoriaEventos mcateven) {

        conectaCategoriaEventos.conexao();

        try {

            String sql = ("INSERT INTO "
                    + "CATEGORIA_EVENTOS"
                    + "(\"NOME_CATEVEN\") "
                    + "VALUES(?)");

            PreparedStatement pstm = conectaCategoriaEventos.cnx.prepareStatement(sql);

            pstm.setString(1, mcateven.getNome_cateven());
          

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Categoria de evento salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao salvar dados \n Error: " + ex);

        }

        conectaCategoriaEventos.desconecta();

    }

    public void editar(ModelCategoriaEventos mcateven) {

        conectaCategoriaEventos.conexao();

        try {

            String sql = ("UPDATE "
                    + "CATEGORIA_EVENTOS"
                    + " SET "
                    + "NOME_CATEVEN=? "
                    + "WHERE "
                    + "COD_CATEVEN=?");

            PreparedStatement pstm = conectaCategoriaEventos.cnx.prepareStatement(sql);

            pstm.setString(1, mcateven.getNome_cateven());
            pstm.setInt(2, mcateven.getCod_cateven());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
        }

        conectaCategoriaEventos.desconecta();
    }

    public void excluir(ModelCategoriaEventos mcateven) {

        conectaCategoriaEventos.conexao();

        try {

            String sql = ("DELETE FROM "
                    + "categoria_eventos "
                    + "WHERE "
                    + "cod_cateven=?");

            PreparedStatement pstm = conectaCategoriaEventos.cnx.prepareStatement(sql);

            pstm.setInt(1, mcateven.getCod_cateven());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Categoria de evento excluido com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir dados \n Error: " + ex);
        }

        conectaCategoriaEventos.desconecta();
    }

    public ModelCategoriaEventos buscarCategoriaEventos(ModelCategoriaEventos mcateven) {

        conectaCategoriaEventos.conexao();

        String sql = ("SELECT * FROM "
                + "CATEGORIA_EVENTOS "
                + "WHERE "
                + "NOME_CATEVEN LIKE '%" + mcateven.getPesquisa() + "%' ");

        conectaCategoriaEventos.executaSQL(sql);

        try {

            conectaCategoriaEventos.rs.first();

            mcateven.setCod_cateven(conectaCategoriaEventos.rs.getInt("cod_cateven"));
            mcateven.setNome_cateven(conectaCategoriaEventos.rs.getString("nome_cateven"));
         

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao pesquisar categoria!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar categoria! \n Error: " + ex);

        }

        conectaCategoriaEventos.desconecta();

        return mcateven;
    }

 
    
    
}
