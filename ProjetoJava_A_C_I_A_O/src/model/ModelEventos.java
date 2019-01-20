package model;

import java.util.Calendar;

/**
 *
 * @author Luis Carlos O.
 */
public class ModelEventos {

    private Integer cod_evento;
    private String nome_evento;
    private String nome_rua_evento;
    private String numero_evento;
    private String cep_evento;
    private String complemento_evento;
    private String bairro_evento;
    private String cidade_evento;
    private String estado_evento;
    private Calendar data_inicio_evento;
    private String hora_inicio_evento;
    private Calendar data_termino_evento;
    private String hora_termino_evento;
    private Integer cod_categoria_evento;
    private String pesquisa;
    

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Integer getCod_evento() {
        return cod_evento;
    }

    public void setCod_evento(Integer cod_evento) {
        this.cod_evento = cod_evento;
    }

    public String getNome_evento() {
        return nome_evento;
    }

    public void setNome_evento(String nome_evento) {
        this.nome_evento = nome_evento;
    }

    public String getNome_rua_evento() {
        return nome_rua_evento;
    }

    public void setNome_rua_evento(String nome_rua_evento) {
        this.nome_rua_evento = nome_rua_evento;
    }

    public String getNumero_evento() {
        return numero_evento;
    }

    public void setNumero_evento(String numero_evento) {
        this.numero_evento = numero_evento;
    }

    public String getCep_evento() {
        return cep_evento;
    }

    public void setCep_evento(String cep_evento) {
        this.cep_evento = cep_evento;
    }

    public String getComplemento_evento() {
        return complemento_evento;
    }

    public void setComplemento_evento(String complemento_evento) {
        this.complemento_evento = complemento_evento;
    }

    public String getBairro_evento() {
        return bairro_evento;
    }

    public void setBairro_evento(String bairro_evento) {
        this.bairro_evento = bairro_evento;
    }

    public String getCidade_evento() {
        return cidade_evento;
    }

    public void setCidade_evento(String cidade_evento) {
        this.cidade_evento = cidade_evento;
    }

    public String getEstado_evento() {
        return estado_evento;
    }

    public void setEstado_evento(String estado_evento) {
        this.estado_evento = estado_evento;
    }

    public Calendar getData_inicio_evento() {
        return data_inicio_evento;
    }

    public void setData_inicio_evento(Calendar data_inicio_evento) {
        this.data_inicio_evento = data_inicio_evento;
    }

    public String getHora_inicio_evento() {
        return hora_inicio_evento;
    }

    public void setHora_inicio_evento(String hora_inicio_evento) {
        this.hora_inicio_evento = hora_inicio_evento;
    }

    public Calendar getData_termino_evento() {
        return data_termino_evento;
    }

    public void setData_termino_evento(Calendar data_termino_evento) {
        this.data_termino_evento = data_termino_evento;
    }

    public String getHora_termino_evento() {
        return hora_termino_evento;
    }

    public void setHora_termino_evento(String hora_termino_evento) {
        this.hora_termino_evento = hora_termino_evento;
    }

    public Integer getCod_categoria_evento() {
        return cod_categoria_evento;
    }

    public void setCod_categoria_evento(Integer cod_categoria_evento) {
        this.cod_categoria_evento = cod_categoria_evento;
    }



}
