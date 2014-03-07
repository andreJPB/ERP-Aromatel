
package br.com.aromatel.erp.conexao;

import br.com.aromatel.erp.exceptions.AromatelException;

/**
 *
 * @author henriquevalcanaia
 */
public interface Conexao {
    
    public boolean conectar() throws AromatelException;
    public boolean desconectar() throws AromatelException;
    public boolean executaSQL(String comandoSQL) throws AromatelException;
    
}
