/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author henriquevalcanaia
 */
@Entity
@Table(name = "CLIENTES")
public class Cliente extends Pessoa implements EntityBase, Serializable {
    
    private static final long serialVersionUID = 1L;

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
