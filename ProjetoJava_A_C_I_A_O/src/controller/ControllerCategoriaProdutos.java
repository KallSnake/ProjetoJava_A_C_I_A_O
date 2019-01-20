package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelCategoriaProdutos;


public class ControllerCategoriaProdutos {
    
     ConexaoDB conectaCategoriaProdutos = new ConexaoDB();
     ModelCategoriaProdutos mcatprod = new ModelCategoriaProdutos();
     
     
    public void salvar(ModelCategoriaProdutos mcatprod) {

        conectaCategoriaProdutos.conexao();

        try {

            String sql = ("INSERT INTO "
                    + "CATEGORIA_PRODUTOS"
                    + "(\"NOME_CATPROD\") "
                    + "VALUES(?)");

            PreparedStatement pstm = conectaCategoriaProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mcatprod.getNome_catprod());
          

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n Error: " + ex);

        }

        conectaCategoriaProdutos.desconecta();

    }

    public void editar(ModelCategoriaProdutos mcatprod) {

        conectaCategoriaProdutos.conexao();

        try {

            String sql = ("UPDATE "
                    + "CATEGORIA_PRODUTOS"
                    + " SET "
                    + "NOME_CATPROD=? "
                    + "WHERE "
                    + "COD_CATPROD=?");

            PreparedStatement pstm = conectaCategoriaProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mcatprod.getNome_catprod());
            pstm.setInt(2, mcatprod.getCod_catprod());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
        }

        conectaCategoriaProdutos.desconecta();
    }

    public void excluir(ModelCategoriaProdutos mcatprod) {

        conectaCategoriaProdutos.conexao();

        try {

            String sql = ("DELETE FROM "
                    + "CATEGORIA_PRODUTOS "
                    + "WHERE "
                    + "COD_CATPROD=?");

            PreparedStatement pstm = conectaCategoriaProdutos.cnx.prepareStatement(sql);

            pstm.setInt(1, mcatprod.getCod_catprod());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados excluido com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir dados \n Error: " + ex);
        }

        conectaCategoriaProdutos.desconecta();
    }

    public ModelCategoriaProdutos buscarCategoriaProdutos(ModelCategoriaProdutos mcatprod) {

        conectaCategoriaProdutos.conexao();

        String sql = ("SELECT * FROM "
                + "CATEGORIA_PRODUTOS "
                + "WHERE "
                + "NOME_CATPROD "
                + "LIKE '%" + mcatprod.getPesquisa() + "%' ");

        conectaCategoriaProdutos.executaSQL(sql);

        try {

            conectaCategoriaProdutos.rs.first();

            mcatprod.setCod_catprod(conectaCategoriaProdutos.rs.getInt("COD_CATPROD"));
            mcatprod.setNome_catprod(conectaCategoriaProdutos.rs.getString("NOME_CATPROD"));
         

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao pesquisar categoria do produto!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar categoria! \n Error: " + ex);

        }

        conectaCategoriaProdutos.desconecta();

        return mcatprod;
    }

 
    
}
