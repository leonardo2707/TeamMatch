/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.Random;

/**
 *
 * @author emerson
 */
public class Grupos {

    private NoPessoas lista_Pessoas;
    private NoPessoas grupoAlfa;
    private NoPessoas grupoDelta;
    private Pessoa pessoa = new Pessoa();
    private int codigo;

    public NoPessoas inserir_na_lista_pessoas(NoPessoas lista, Pessoa pessoa) {
        NoPessoas novo;
        novo = Cria_NoPessoas(pessoa);

        if (lista == null) {
            lista = novo;
        } else {
            NoPessoas ultimo = buscaUltima(lista);
            novo.setNoAntPessoa(ultimo);
            ultimo.setNoProxPessoa(novo);
        }
        return lista;
    }

    public void MostrarNomes(NoPessoas lista) {
        if (lista == null) {
            System.out.println("A lista está vazia");
        } else {
            while (lista.getNoProxPessoa() != null) {
                System.out.println("nome = " + lista.getPessoa().getNome());
                lista = lista.getNoProxPessoa();
            }
        }
    }

    public NoPessoas buscaUltima(NoPessoas lista) {
        if (lista == null) {
            return null;
        }

        NoPessoas ultimo = lista;
        while (ultimo.getNoProxPessoa() != null) {
            ultimo = ultimo.getNoProxPessoa();
        }
        return ultimo;
    }

    public NoPessoas Cria_NoPessoas(Pessoa pessoa) {
        NoPessoas novo = new NoPessoas();
        novo.setPessoa(pessoa);
        novo.setNoProxPessoa(null);
        novo.setNoAntPessoa(null);
        return novo;
    }

}
