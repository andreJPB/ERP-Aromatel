/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.cadastros;

/**
 *
 * @author henriquevalcanaia
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Produto implements java.io.Serializable{
    
    private int codigo;
    private String descricao;
    private String codigoBarras;
    private String NCM;
    private float valorUnitario;
    private float quantidadeInicial;

    public Produto() {
    }

    public Produto(int codigo, String descricao, String codigoBarras, String NCM, float valorUnitario, float quantidadeInicial) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.codigoBarras = codigoBarras;
        this.NCM = NCM;
        this.valorUnitario = valorUnitario;
        this.quantidadeInicial = quantidadeInicial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNCM() {
        return NCM;
    }

    public void setNCM(String NCM) {
        this.NCM = NCM;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getQuantidadeInicial() {
        return quantidadeInicial;
    }

    public void setQuantidadeInicial(float quantidadeInicial) {
        this.quantidadeInicial = quantidadeInicial;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", codigoBarras=" + codigoBarras + ", NCM=" + NCM + ", valorUnitario=" + valorUnitario + ", quantidadeInicial=" + quantidadeInicial + '}';
    }
    
}
