package br.com.aromatel.erp.testes;

import br.com.aromatel.erp.dao.CidadeDAO;
import br.com.aromatel.erp.dao.ClienteDAO;
import br.com.aromatel.erp.dao.DAO;
import br.com.aromatel.erp.modelo.cadastros.Cidade;
import br.com.aromatel.erp.modelo.cadastros.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author henriquevalcanaia
 */
public class Teste {

    private static Connection con;

    public static Connection getConexao() {
        String driver = "oracle.jdbc.OracleDriver";
        String url = "jdbc:oracle:thin:@192.168.0.16:1521/XE";
        String login = "aromatel";
        String senha = "renan";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, login, senha);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro abrindo conexão: " + e.getMessage());
        }
        return con;
    }

    public static void main(String args[]) {
        Cliente c = new Cliente();
        c.setCodigo(1);
        c.setBairro("Menino Deus");
        c.setCidade("Porto Alegre");
        c.setDatacadastro(new Date(2014, 2, 26));
        c.setDdd(48);
        c.setEmail("henrique_indalencio@hotmail.com");
        c.setFone("96292260");
        c.setEndereco("Avenida Getúlio Vargas");
        c.setInscricao("05970524921");
        c.setNome("Henrique Valcanaia");
        c.setNumero(374);
        c.setTipoEndereco(1);
        c.setTipoInscricao(1);
        c.setUf("RS");
        //ClienteDAO dao = new ClienteDAO();
        //dao.gravar(c);
        
        //DAO<Cliente> d = new DAO<Cliente>(Cliente.class);
        //d.atualiza(c);
        
        Cidade a = new Cidade();
        a.setCodigo(1);
        a.setCodigoIBGE(1);
        a.setDescricao("Criciuma");
        a.setInativo(0);
        a.setUf("SC");
        
        CidadeDAO d = new CidadeDAO();
        d.gravar(a);
        
                
    }

}
