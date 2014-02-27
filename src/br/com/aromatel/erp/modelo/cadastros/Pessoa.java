/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aromatel.erp.modelo.cadastros;

import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Usuario
 */
@MappedSuperclass
public abstract class Pessoa {
    @Id
    @SequenceGenerator(name="SEQ_COD_PESSOA", sequenceName = "SEQ_COD_PESSOA", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_COD_PESSOA")
    private int codigo;
    	
    @Column(nullable = false)
    private String nome;
    
    @Column(nullable = false)
    private String inscricao;
    
    private int tipoInscricao;
    
    @Column(nullable = false)
    private String uf;
    
    private String inscricaoEstadual;
    
    @Column(nullable = false)
    private int ddd;
   
    @Column(nullable = false)
    private String fone;
    
    private String email;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)	
    private Date datacadastro;
    
    @Column(nullable = false)
    private Integer tipoEndereco;
    
    @Column(nullable = false)
    private String endereco;
    
    @Column(nullable = false)
    private String bairro;
    
    @Column(nullable = false)
    private String cidade;
    
    @Column(nullable = false)
    private Integer numero;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public int getTipoInscricao() {
        return tipoInscricao;
    }

    public void setTipoInscricao(int tipoInscricao) {
        this.tipoInscricao = tipoInscricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Integer getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(Integer tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.inscricao);
        hash = 29 * hash + this.tipoInscricao;
        hash = 29 * hash + Objects.hashCode(this.uf);
        hash = 29 * hash + Objects.hashCode(this.inscricaoEstadual);
        hash = 29 * hash + this.ddd;
        hash = 29 * hash + Objects.hashCode(this.fone);
        hash = 29 * hash + Objects.hashCode(this.email);
        hash = 29 * hash + Objects.hashCode(this.datacadastro);
        hash = 29 * hash + Objects.hashCode(this.tipoEndereco);
        hash = 29 * hash + Objects.hashCode(this.endereco);
        hash = 29 * hash + Objects.hashCode(this.bairro);
        hash = 29 * hash + Objects.hashCode(this.cidade);
        hash = 29 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.inscricao, other.inscricao)) {
            return false;
        }
        if (this.tipoInscricao != other.tipoInscricao) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.inscricaoEstadual, other.inscricaoEstadual)) {
            return false;
        }
        if (this.ddd != other.ddd) {
            return false;
        }
        if (!Objects.equals(this.fone, other.fone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.datacadastro, other.datacadastro)) {
            return false;
        }
        if (!Objects.equals(this.tipoEndereco, other.tipoEndereco)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + "codigo=" + codigo + ", nome=" + nome + ", inscricao=" + inscricao + ", tipoInscricao=" + tipoInscricao + ", uf=" + uf + ", inscricaoEstadual=" + inscricaoEstadual + ", ddd=" + ddd + ", fone=" + fone + ", email=" + email + ", datacadastro=" + datacadastro + ", tipoEndereco=" + tipoEndereco + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", numero=" + numero + '}';
    }
    
    
}
