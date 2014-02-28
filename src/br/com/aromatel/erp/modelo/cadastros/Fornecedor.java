/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.cadastros;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author henriquevalcanaia
 */
@Entity(name = "FORNECEDORES")
public class Fornecedor extends Pessoa implements EntityBase, Serializable{

    @Id
    @SequenceGenerator(name="SEQ_CODIGO_FORNECEDOR", sequenceName = "SEQ_CODIGO_FORNECEDOR", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CODIGO_FORNECEDOR")
    private Integer codigo;
    
    public Fornecedor() {
    }
    
    public Integer getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo){
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return "Fornecedor" + super.toString();
    }
    
    @Override
    public boolean existeNoBanco() {
        return true;
    }
}
