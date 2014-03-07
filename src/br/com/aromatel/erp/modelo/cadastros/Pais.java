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
@Entity(name = "paises")
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @SequenceGenerator(name = "SEQ_CODIGO_PAIS", allocationSize = 1, initialValue = 1, sequenceName = "SEQ_CODIGO_PAIS")
    @GeneratedValue(generator = "SEQ_CODIGO_PAIS", strategy = GenerationType.SEQUENCE)
    private Integer codigo;

    private String nome;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

}
