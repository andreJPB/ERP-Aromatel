
 

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author henriquevalcanaia
 */
public class Estado implements EntityBase, Serializable{
    
    @Id
    @SequenceGenerator(name = "SEQ_CODIGO_ESTADO", sequenceName = "SEQ_CODIGO_ESTADO", initialValue = 1)
    private Integer codigo;
    private String nome;
    private String sigla;
    private Integer ativo;

    public Estado() {
    }

    public Estado(Integer codigo, String nome, String sigla, Integer ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.sigla = sigla;
        this.ativo = ativo;
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.codigo);
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.sigla);
        hash = 23 * hash + Objects.hashCode(this.ativo);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sigla, other.sigla)) {
            return false;
        }
        if (!Objects.equals(this.ativo, other.ativo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + ", ativo=" + ativo + '}';
    }
    
    @Override
    public boolean existeNoBanco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
