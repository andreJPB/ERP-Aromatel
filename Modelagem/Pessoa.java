/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.util.Date;
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
    private String nomeFantasia;
    
    @Column(nullable = false)
    private String razaoSocial;
    
    @Column(nullable = false)
    private String apelido;
    
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
    
    @Column(nullable = false)
    private String cep;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nomeFantasia, String razaoSocial, String inscricao, int tipoInscricao, String uf, String inscricaoEstadual, int ddd, String fone, String email, Date datacadastro, Integer tipoEndereco, String endereco, String bairro, String cidade, Integer numero, String cep) {
        this.codigo = codigo;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.inscricao = inscricao;
        this.tipoInscricao = tipoInscricao;
        this.uf = uf;
        this.inscricaoEstadual = inscricaoEstadual;
        this.ddd = ddd;
        this.fone = fone;
        this.email = email;
        this.datacadastro = datacadastro;
        this.tipoEndereco = tipoEndereco;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    
    
}
