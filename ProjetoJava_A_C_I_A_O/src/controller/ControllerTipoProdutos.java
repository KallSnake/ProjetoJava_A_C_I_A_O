package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelTipoProdutos;


public class ControllerTipoProdutos {
    
     ConexaoDB conectaTipoProdutos = new ConexaoDB();
     ModelTipoProdutos mtipoprod = new ModelTipoProdutos();
     
     
    public void salvar(ModelTipoProdutos mtipoprod) {

        conectaTipoProdutos.conexao();

        try {

            String sql = ("INSERT INTO "
                    + "TIPO_PRODUTOS"
                    + "(\"NOME_TIPO\") "
                    + "VALUES(?)");

            PreparedStatement pstm = conectaTipoProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mtipoprod.getNome_tipo());
          

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n Error: " + ex);

        }

        conectaTipoProdutos.desconecta();

    }

    public void editar(ModelTipoProdutos mtipoprod) {

        conectaTipoProdutos.conexao();

        try {

            String sql = ("UPDATE "
                    + "TIPO_PRODUTOS"
                    + " SET "
                    + "NOME_TIPO=? "
                    + "WHERE "
                    + "COD_TIPO=?");

            PreparedStatement pstm = conectaTipoProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mtipoprod.getNome_tipo());
            pstm.setInt(2, mtipoprod.getCod_tipo());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
        }

        conectaTipoProdutos.desconecta();
    }

    public void excluir(ModelTipoProdutos mtipoprod) {

        conectaTipoProdutos.conexao();

        try {

            String sql = ("DELETE FROM "
                    + "TIPO_PRODUTOS "
                    + "WHERE "
                    + "COD_TIPO=?");

            PreparedStatement pstm = conectaTipoProdutos.cnx.prepareStatement(sql);

            pstm.setInt(1, mtipoprod.getCod_tipo());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados excluido com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir dados \n Error: " + ex);
        }

        conectaTipoProdutos.desconecta();
    }

    public ModelTipoProdutos buscarTipoProdutos(ModelTipoProdutos mtipoprod) {

        conectaTipoProdutos.conexao();

        String sql = ("SELECT * FROM "
                + "TIPO_PRODUTOS "
                + "WHERE "
                + "NOME_TIPO "
                + "LIKE '%" + mtipoprod.getPesquisa() + "%' ");

        conectaTipoProdutos.executaSQL(sql);

        try {

            conectaTipoProdutos.rs.first();

            mtipoprod.setCod_tipo(conectaTipoProdutos.rs.getInt("COD_TIPO"));
            mtipoprod.setNome_tipo(conectaTipoProdutos.rs.getString("NOME_TIPO"));
         

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao pesquisar tipo do produto!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar tipo do produto! \n Error: " + ex);

        }

        conectaTipoProdutos.desconecta();

        return mtipoprod;
    }

 
    
}
