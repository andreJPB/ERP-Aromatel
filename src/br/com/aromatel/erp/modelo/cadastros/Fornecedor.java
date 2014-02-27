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
public class Fornecedor extends Pessoa implements EntityBase{

    public Fornecedor() {
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
