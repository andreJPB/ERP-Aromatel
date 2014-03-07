/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.movimentos;

import br.com.aromatel.erp.modelo.cadastros.Fornecedor;
import java.util.Date;

/**
 *
 * @author henriquevalcanaia
 */
public class Entrada extends Nota{
    
    private Fornecedor fornecedor;
    private Date dataEntrada;

    @Override
    public boolean existeNoBanco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
