/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.movimento;

import br.com.aromatel.erp.modelo.cadastros.Produto;
import java.util.Objects;

/**
 *
 * @author henriquevalcanaia
 */
public class SaidaProduto implements java.io.Serializable{
    
    private int codigo;
    private Produto produto;
    private Saida nota;

    public SaidaProduto() {
    }

    public SaidaProduto(Produto produto, Saida nota, int codigo) {
        this.produto = produto;
        this.nota = nota;
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Saida getSaida() {
        return nota;
    }

    public void setSaida(Saida nota) {
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.produto);
        hash = 79 * hash + Objects.hashCode(this.nota);
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
        final SaidaProduto other = (SaidaProduto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.nota, other.nota)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaidaProduto{" + "codigo=" + codigo + ", produto=" + produto + ", nota=" + nota + '}';
    }

    
}
