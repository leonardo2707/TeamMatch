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

    public void NoPessoas() {
    }

    public NoPessoas Cria_NoPessoas(Pessoa pessoa) {
        NoPessoas novo = new NoPessoas();
        novo.pessoa = pessoa;
        novo.noProxPessoa = null;
        novo.noAntPessoa = null;
        return novo;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setNoProxPessoa(NoPessoas noProxPessoa) {
        this.noProxPessoa = noProxPessoa;
    }

    public void setNoAntPessoa(NoPessoas noAntPessoa) {
        this.noAntPessoa = noAntPessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public NoPessoas getNoProxPessoa() {
        return noProxPessoa;
    }

    public NoPessoas getNoAntPessoa() {
        return noAntPessoa;
    }

    public NoPessoas buscaUltimo(NoPessoas lista) {
        if (lista == null) {
            return null;
        }

        NoPessoas ultimo = lista;
        while (ultimo != null) {
            ultimo = ultimo.getNoProxPessoa();
        }
        return ultimo;
    }

    //Fazer função de consulta, busca e deletar e adicionar
}
