/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.movimentos;

import br.com.aromatel.erp.modelo.cadastros.EntityBase;
import java.util.Date;

/**
 *
 * @author henriquevalcanaia
 */
public abstract class Nota implements EntityBase{
    
    private int codigo;
    private float valorContabil;
    private float valorDesconto;
    private float valorAcrescimo;
    private Date dataNota;
    
    
}
