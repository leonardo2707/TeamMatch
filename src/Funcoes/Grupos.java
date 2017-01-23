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
public class Grupos {

    private NoPessoas lista_Pessoas;
    private NoPessoas grupoAlfa;
    private NoPessoas grupoDelta;

    public NoPessoas inserir_na_lista_pessoas(NoPessoas lista, String nome, int codigo) {
        NoPessoas novo = new NoPessoas();
        Pessoa pessoa = new Pessoa();

        pessoa.Pessoa(nome, codigo);
        novo.Cria_NoPessoas(pessoa);

        if (lista == null) {
            lista = novo;
        } else {
            NoPessoas ultimo = buscaUltima(lista);
            novo.setNoAntPessoa(ultimo);
            ultimo.setNoProxPessoa(novo);

        }
        this.lista_Pessoas = lista;
        return lista;
    }

    public void mostraNomes(NoPessoas lista) {
        NoPessoas mostra = lista;

        if (lista == null) {
            System.out.println("Não há valores");
        } else {
            while (mostra != null) {
                System.out.println("nome: " + mostra.getPessoa().getNome());
                mostra = mostra.getNoProxPessoa();
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

    public NoPessoas limparlistaPessoas(NoPessoas lista)//Remove todos os nós da Lista
    {
        NoPessoas no = lista; 
        NoPessoas aux;
        while (no != null) {
            aux = no;
            no = no.getNoProxPessoa();
            aux = null;
        }
        lista = null;
        return lista;
    }

}
