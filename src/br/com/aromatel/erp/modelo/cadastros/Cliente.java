/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.cadastros;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author henriquevalcanaia
 */
@Entity
@Table(name = "CLIENTE")
public class Cliente extends Pessoa implements EntityBase{

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente" + super.toString();
    }
    
    @Override
    public boolean existeNoBanco() {
        return true;
    }
}
