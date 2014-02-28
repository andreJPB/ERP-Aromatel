 

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author henriquevalcanaia
 */
@Entity
@Table(name = "CIDADES")
public class Cidade implements EntityBase, Serializable{
    
    private static final long serialVersionUID = 1L;
    

    @Id
    @SequenceGenerator(name = "SEQ_CODIGO_CIDADE", sequenceName = "SEQ_CODIGO_CIDADE", initialValue = 1)
    private Integer codigo;
    
    private String nome;
    private Estado estado;
    private Integer codigoIBGE;
    private Integer ativo;

    public Cidade() {
    }
    
    
    @Override
    public boolean existeNoBanco() {
        return true;
    }
    
    

}
