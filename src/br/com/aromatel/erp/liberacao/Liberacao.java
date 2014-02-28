
package br.com.aromatel.erp.liberacao;

import br.com.aromatel.erp.modelo.cadastros.EntityBase;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;

/**
 *
 * @author henriquevalcanaia
 */
@Entity(name = "LIBERACAO")
public class Liberacao implements EntityBase, Serializable {
    
    @Id
    @SequenceGenerator(name = "SEQ_CODIGO_LIBERACAO", initialValue = 1, sequenceName = "SEQ_CODIGO_LIBERACAO")
    private Integer codigo;
    private String chave;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataExpiracao;

    @Override
    public boolean existeNoBanco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
}
