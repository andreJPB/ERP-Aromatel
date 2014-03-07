package br.com.aromatel.erp.conexao;

import br.com.aromatel.erp.exceptions.AromatelException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author henriquevalcanaia
 */
public class ConexaoOracle implements Conexao {

    private final String driver = "oracle.jdbc.OracleDriver";

    private String usuario;
    private String senha;
    private String host;
    private Integer porta;
    private String sufixo;
    private Connection conexao;

    public ConexaoOracle() {
    }

    public ConexaoOracle(String usuario, String senha, String host, Integer porta, String sufixo) {
        this.usuario = usuario;
        this.senha = senha;
        this.host = host;
        this.porta = porta;
        this.sufixo = sufixo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPorta() {
        return porta;
    }

    public void setPorta(Integer porta) {
        this.porta = porta;
    }

    public String getSufixo() {
        return sufixo;
    }

    public void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    @Override
    public boolean conectar() throws AromatelException {
        boolean conectou = false;
        try {
            String url = "jdbc:oracle:thin:@" + host.toString() + ":" + porta.toString() + sufixo;
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, usuario, senha);
            if (conexao != null) {
                conectou = true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
            throw new AromatelException("Erro ao conectar ao banco de dados");
        }
        return conectou;
    }

    @Override
    public boolean desconectar() throws AromatelException {
        boolean desconectou = false;
        if (conexao != null) {
            try {
                conexao.close();
                if (conexao == null) {
                    desconectou = true;
                }
            } catch (SQLException ex) {
                throw new AromatelException("Erro ao desconectar ao banco de dados");
            }
        }
        return desconectou;
    }

    @Override
    public boolean executaSQL(String comandoSQL) throws AromatelException {
        try {
            PreparedStatement stmt = conexao.prepareStatement(comandoSQL);
            stmt.executeQuery();
        } catch (SQLException e) {
            throw new AromatelException("Erro ao executar comando SQL");
        } finally {
            try {
                conexao.close();
            } catch (SQLException e) {
                throw new AromatelException("Erro ao fechar conexão");
            }
        }
        return false;
    }

}
