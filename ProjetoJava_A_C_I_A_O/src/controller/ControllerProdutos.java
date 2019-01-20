package controller;

import java.sql.*;
import javax.swing.JOptionPane;
import model.ModelProdutos;

public class ControllerProdutos {
    
    
    ConexaoDB conectaProdutos = new ConexaoDB();
    ModelProdutos mprodutos = new ModelProdutos();

    public void salvar(ModelProdutos mprodutos) {

        conectaProdutos.conexao();

        try {

            String sql = ("INSERT INTO "
                    + "PRODUTOS"
                    + "(\"DESC_PROD\","
                    + "\"QTD_PROD\","
                    + "\"UNID_PROD\","
                    + "\"PRECO_PROD\","
                    + "\"NOME_TIPO\","
                    + "\"COD_CATPROD\","
                    + "\"COD_EVENTO\") "
                    + "VALUES(?,?,?,?,?,?,?)");

            PreparedStatement pstm = conectaProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mprodutos.getDesc_produto());
            pstm.setInt(2, mprodutos.getQtd_produto());
            pstm.setString(3, mprodutos.getUnid_produto());
            pstm.setFloat(4, mprodutos.getPreco_produto());
            pstm.setString(5, mprodutos.getNome_tipo());
            pstm.setInt(6, mprodutos.getCod_cadprod());
            pstm.setInt(7, mprodutos.getCod_evento_prod());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n Error: " + ex);

        }

        conectaProdutos.desconecta();

    }

    public void editar(ModelProdutos mprodutos) {

        conectaProdutos.conexao();

        try {

            String sql = ("UPDATE "
                    + "PRODUTOS"
                    + " SET "
                    + "DESC_PROD=?,"
                    + "QTD_PROD=?,"
                    + "UNID_PROD=?,"
                    + "PRECO_PROD=?,"
                    + "NOME_TIPO=?,"
                    + "COD_CATPROD=?,"
                    + "COD_EVENTO=? "
                    + "WHERE "
                    + "COD_PROD=?");

            PreparedStatement pstm = conectaProdutos.cnx.prepareStatement(sql);

            pstm.setString(1, mprodutos.getDesc_produto());
            pstm.setInt(2, mprodutos.getQtd_produto());
            pstm.setString(3, mprodutos.getUnid_produto());
            pstm.setFloat(4, mprodutos.getPreco_produto());
            pstm.setString(5, mprodutos.getNome_tipo());
            pstm.setInt(6, mprodutos.getCod_cadprod());
            pstm.setInt(7, mprodutos.getCod_evento_prod());
            pstm.setInt(8, mprodutos.getCod_produto());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados do produto alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
        }

        conectaProdutos.desconecta();
    }

    public void excluir(ModelProdutos mprodutos) {

        conectaProdutos.conexao();

        try {

            String sql = ("DELETE FROM "
                    + "PRODUTOS "
                    + "WHERE "
                    + "COD_PROD=?");

            PreparedStatement pstm = conectaProdutos.cnx.prepareStatement(sql);

            pstm.setInt(1, mprodutos.getCod_produto());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir produto \n Error: " + ex);
        }

        conectaProdutos.desconecta();
    }

    public ModelProdutos buscarProdutos(ModelProdutos mprodutos) {

        conectaProdutos.conexao();

        String sql = ("SELECT * FROM "
                + "PRODUTOS "
                + "WHERE "
                + "DESC_PROD "
                + "LIKE '%" + mprodutos.getPesquisa() + "%' ");

        conectaProdutos.executaSQL(sql);

        try {

            conectaProdutos.rs.first();

            mprodutos.setCod_produto(conectaProdutos.rs.getInt("COD_PROD"));
            mprodutos.setDesc_produto(conectaProdutos.rs.getString("DESC_PROD"));
            mprodutos.setQtd_produto(conectaProdutos.rs.getInt("QTD_PROD"));
            mprodutos.setUnid_produto(conectaProdutos.rs.getString("UNID_PROD"));
            mprodutos.setPreco_produto(conectaProdutos.rs.getFloat("PRECO_PROD"));
            mprodutos.setNome_tipo(conectaProdutos.rs.getString("NOME_TIPO"));
            mprodutos.setCod_cadprod(conectaProdutos.rs.getInt("COD_CATPROD"));
            mprodutos.setCod_evento_prod(conectaProdutos.rs.getInt("COD_EVENTO"));

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao buscar produto!");
            // JOptionPane.showMessageDialog(null, "Erro ao procurar produto! \n Error: " + ex);

        }

        conectaProdutos.desconecta();

        return mprodutos;
    }

    
    
    
}
