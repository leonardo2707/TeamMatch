/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

/**
 *
 * @author emerson
 */
public class NoPessoas {
    private Pessoa pessoa;
    private NoPessoas noProxPessoa;
    private NoPessoas noAntPessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public NoPessoas getNoProxPessoa() {
        return noProxPessoa;
    }

    public void setNoProxPessoa(NoPessoas noProxPessoa) {
        this.noProxPessoa = noProxPessoa;
    }

    public NoPessoas getNoAntPessoa() {
        return noAntPessoa;
    }

    public void setNoAntPessoa(NoPessoas noAntPessoa) {
        this.noAntPessoa = noAntPessoa;
    }
    
    //Fazer função de consulta, busca e deletar
}