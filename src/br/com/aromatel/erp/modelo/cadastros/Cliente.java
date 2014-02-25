/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.aromatel.erp.modelo.cadastros;

/**
 *
 * @author henriquevalcanaia
 */

public class Cliente implements EntityBase{
    
    private int codigo;
    private String nome;
    private String inscricao;
    private int tipoInscricao;
    private String uf;
    private String inscricaoEstadual;
    private int ddd;
    private String fone;

    @Override
    public boolean existeNoBanco() {
        return true;
    }
    
    
}
