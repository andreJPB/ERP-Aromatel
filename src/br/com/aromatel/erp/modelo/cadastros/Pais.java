package br.com.aromatel.erp.modelo.cadastros;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
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
    
    @Column(name = "CODIGO_BANCO_CENTRAL")
    private Integer codigoBancoCentral;

    public Pais() {
    }

    public Pais(Integer codigo, String nome, Integer codigoBancoCentral) {
        this.codigo = codigo;
        this.nome = nome;
        this.codigoBancoCentral = codigoBancoCentral;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoBancoCentral() {
        return codigoBancoCentral;
    }

    public void setCodigoBancoCentral(Integer codigoBancoCentral) {
        this.codigoBancoCentral = codigoBancoCentral;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.codigo);
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.codigoBancoCentral);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.codigoBancoCentral, other.codigoBancoCentral)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pais{" + "codigo=" + codigo + ", nome=" + nome + ", codigoBancoCentral=" + codigoBancoCentral + '}';
    }
}
