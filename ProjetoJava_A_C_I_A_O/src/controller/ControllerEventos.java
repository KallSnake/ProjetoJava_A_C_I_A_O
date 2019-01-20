package controller;


import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.ModelEventos;

public class ControllerEventos {
    
    ConexaoDB conectaEvento = new ConexaoDB();
    ModelEventos meventos = new ModelEventos();
    Calendar dataInicio = Calendar.getInstance();
    Calendar dataFim = Calendar.getInstance();
    int codCategoriaEvento;
    
    
    
    public void salvar(ModelEventos meventos) {

        conectaEvento.conexao();

        try {

            String sqlSalvar = ("INSERT INTO "
                    + "EVENTOS"
                    + "(\"NOME_EVENTO\","
                    + "\"AV_RUA_EVENTO\","
                    + "\"NUM_EVENTO\","
                    + "\"CEP_EVENTO\","
                    + "\"COMPLEMENTO_EVENTO\","
                    + "\"BAIRRO_EVENTO\","
                    + "\"CIDADE_EVENTO\","
                    + "\"ESTADO_EVENTO\","
                    + "\"DATA_INICIO_EVENTO\","
                    + "\"HORA_INICIO_EVENTO\","
                    + "\"DATA_FIM_EVENTO\","
                    + "\"HORA_FIM_EVENTO\","
                    + "\"COD_CATEVEN\") "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");

            PreparedStatement pstm = conectaEvento.cnx.prepareStatement(sqlSalvar);

            pstm.setString(1, meventos.getNome_evento());
            pstm.setString(2, meventos.getNome_rua_evento());
            pstm.setString(3, meventos.getNumero_evento());
            pstm.setString(4, meventos.getCep_evento());
            pstm.setString(5, meventos.getComplemento_evento());
            pstm.setString(6, meventos.getBairro_evento());
            pstm.setString(7, meventos.getCidade_evento());
            pstm.setString(8, meventos.getEstado_evento());
            
            pstm.setDate(9, new Date(
                    meventos.getData_inicio_evento().getTimeInMillis()));
            
            pstm.setString(10, meventos.getHora_inicio_evento());
            
            pstm.setDate(11, new Date(
                    meventos.getData_termino_evento().getTimeInMillis()));
            
            pstm.setString(12, meventos.getHora_termino_evento());
            pstm.setInt(13, meventos.getCod_categoria_evento());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Evento salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n Error: " + ex);

        }

        conectaEvento.desconecta();

    }
    
    
    public void editar(ModelEventos meventos) {

        conectaEvento.conexao();
        
        // JOptionPane.showMessageDialog(null, meventos.getCod_categoria_evento());

        try {

            String sqlEditar = ("UPDATE "
                    + "EVENTOS "
                    + "SET "
                    + "NOME_EVENTO=?,"
                    + "AV_RUA_EVENTO=?,"
                    + "NUM_EVENTO=?,"
                    + "CEP_EVENTO=?,"
                    + "COMPLEMENTO_EVENTO=?,"
                    + "BAIRRO_EVENTO=?,"
                    + "CIDADE_EVENTO=?,"
                    + "ESTADO_EVENTO=?,"
                    + "DATA_INICIO_EVENTO=?,"
                    + "HORA_INICIO_EVENTO=?,"
                    + "DATA_FIM_EVENTO=?,"
                    + "HORA_FIM_EVENTO=?,"
                    + "COD_CATEVEN=? "
                    + "WHERE "
                    + "COD_EVENTO=?");

            PreparedStatement pstm = conectaEvento.cnx.prepareStatement(sqlEditar);

            pstm.setString(1, meventos.getNome_evento());
            pstm.setString(2, meventos.getNome_rua_evento());
            pstm.setString(3, meventos.getNumero_evento());
            pstm.setString(4, meventos.getCep_evento());
            pstm.setString(5, meventos.getComplemento_evento());
            pstm.setString(6, meventos.getBairro_evento());
            pstm.setString(7, meventos.getCidade_evento());
            pstm.setString(8, meventos.getEstado_evento());
            pstm.setDate(9, new Date(meventos.getData_inicio_evento().getTimeInMillis()));
            pstm.setString(10, meventos.getHora_inicio_evento());
            pstm.setDate(11, new Date(meventos.getData_termino_evento().getTimeInMillis()));
            pstm.setString(12, meventos.getHora_termino_evento());
            pstm.setInt(13, meventos.getCod_categoria_evento());
            pstm.setInt(14, meventos.getCod_evento());
            
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados do evento alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
            conectaEvento.desconecta();
        }

        conectaEvento.desconecta();
    }
    
    
    public void excluir(ModelEventos meventos) {
        
        conectaEvento.conexao();

        try {
            
            String sqlExcluir = ("DELETE FROM "
                    + "EVENTOS "
                    + "WHERE "
                    + "COD_EVENTO=?");
            
            PreparedStatement pstm = conectaEvento.cnx.prepareStatement(sqlExcluir);
            
            pstm.setInt(1, meventos.getCod_evento());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Evento excluido com sucesso!");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados \n Error: " + ex);
        }

        conectaEvento.desconecta();
    }

    
    public ModelEventos buscarEventos(ModelEventos meventos) {
        
        conectaEvento.conexao();
        
        String sql = ("SELECT * FROM "
                + "EVENTOS "
                + "WHERE "
                + "NOME_EVENTO"
                + " LIKE '%" + meventos.getPesquisa() + "%'");
        
        conectaEvento.executaSQL(sql);

        try {
            
            conectaEvento.rs.first();
            
            meventos.setCod_evento(conectaEvento.rs.getInt("cod_evento"));
            meventos.setNome_evento(conectaEvento.rs.getString("nome_evento"));
            meventos.setNome_rua_evento(conectaEvento.rs.getString("av_rua_evento"));
            meventos.setNumero_evento(conectaEvento.rs.getString("num_evento"));
            meventos.setCep_evento(conectaEvento.rs.getString("cep_evento"));
            meventos.setComplemento_evento(conectaEvento.rs.getString("complemento_evento"));
            meventos.setBairro_evento(conectaEvento.rs.getString("bairro_evento"));
            meventos.setCidade_evento(conectaEvento.rs.getString("cidade_evento"));
            meventos.setEstado_evento(conectaEvento.rs.getString("estado_evento"));
            dataInicio.setTime(conectaEvento.rs.getDate("data_inicio_evento"));
            meventos.setData_inicio_evento(dataInicio);
            meventos.setHora_inicio_evento(conectaEvento.rs.getString("hora_inicio_evento"));
            dataFim.setTime(conectaEvento.rs.getDate("data_fim_evento"));
            meventos.setData_termino_evento(dataFim);
            meventos.setHora_termino_evento(conectaEvento.rs.getString("hora_fim_evento"));
            meventos.setCod_categoria_evento(conectaEvento.rs.getInt("cod_cateven"));
           

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Evento não cadastrado!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar evento! \n ERROR: " + ex);

        }

        conectaEvento.desconecta();
        
        return meventos;
    }
    
        
     
    
}
