package model;

/**
 *
 * @author Luis Carlos O.
 */
public class ModelProdutos {
    
    private Integer cod_produto;
    private String desc_produto;
    private Integer qtd_produto;
    private String unid_produto;
    private float preco_produto;
    private String nome_tipo;
    private Integer cod_cadprod;
    private Integer cod_evento_prod;
    private String pesquisa;
    

    public Integer getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(Integer cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDesc_produto() {
        return desc_produto;
    }

    public void setDesc_produto(String desc_produto) {
        this.desc_produto = desc_produto;
    }

    public Integer getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(Integer qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public String getUnid_produto() {
        return unid_produto;
    }

    public void setUnid_produto(String unid_produto) {
        this.unid_produto = unid_produto;
    }

    public float getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(float preco_produto) {
        this.preco_produto = preco_produto;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }

    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Integer getCod_cadprod() {
        return cod_cadprod;
    }

    public void setCod_cadprod(Integer cod_cadprod) {
        this.cod_cadprod = cod_cadprod;
    }

    public Integer getCod_evento_prod() {
        return cod_evento_prod;
    }

    public void setCod_evento_prod(Integer cod_evento_prod) {
        this.cod_evento_prod = cod_evento_prod;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }


    
}
