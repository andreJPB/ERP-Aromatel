package br.com.aromatel.erp.modelo.cadastros;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author henriquevalcanaia
 */
@Entity
@Table(name = "CIDADES")
public class Cidade implements EntityBase, Serializable{

    @Id
    private Integer codigo;
    private String descricao;
    private String uf;
    private Integer codigoIBGE;
    private Integer inativo;

    public Cidade(Integer codigo, String descricao, String uf, Integer codigoIBGE, Integer inativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.codigoIBGE = codigoIBGE;
        this.inativo = inativo;
    }

    public Cidade() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(Integer codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public Integer getInativo() {
        return inativo;
    }

    public void setInativo(Integer inativo) {
        this.inativo = inativo;
    }

    @Override
    public boolean existeNoBanco() {
        return true;
    }
    
    

}
