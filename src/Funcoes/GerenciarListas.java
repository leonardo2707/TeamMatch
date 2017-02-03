/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author emerson
 */
public class GerenciarListas {

    List listaArray = new ArrayList();

    public NoPessoas inserir_na_lista(NoPessoas lista, String nome, int codigo) {
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

        return lista;
    }

    public NoPessoas dividirTimes(NoPessoas lista, NoPessoas lista_Alfa) {
        int quantidade_pessoas = busca_quantidade_de_pessoas(lista);
        int par;
        NoPessoas sorteado = new NoPessoas();

        if (quantidade_pessoas == 0) {
            System.out.println("não á pessoas na lista");
            return null;
        } else if (quantidade_pessoas == 1) {
            par = lista.getPessoa().getCodigo() % 2;
            if (par == 0) {
                System.out.println("Só tem uma pessoa na lista");
                lista_Alfa = inserir_na_lista(lista_Alfa, lista.getPessoa().getNome(), lista.getPessoa().getCodigo());
                return lista_Alfa;
            } else {
                return null;
            }
        }
        quantidade_pessoas = quantidade_pessoas / 2;

        NoPessoas aux = lista;

        while (aux != null) {
            listaArray.add(aux);
            aux = aux.getNoProxPessoa();
        }
        System.out.println("O nomes sorteados foram");
        for (int i = 0; i < quantidade_pessoas; i++) {
            Collections.shuffle(listaArray);
            sorteado = (NoPessoas) listaArray.remove(0);
            listaArray.remove(0);
            System.out.println("nome " + sorteado.getPessoa().getNome());
            lista_Alfa = inserir_na_lista(lista_Alfa, sorteado.getPessoa().getNome(), sorteado.getPessoa().getCodigo());         
        }

        return lista_Alfa;
    }

    public NoPessoas sobras(NoPessoas lista_Pessoas, NoPessoas lista_Alfa, NoPessoas lista_Delta) {
        NoPessoas aux = new NoPessoas();

        while (lista_Pessoas != null) {

            aux = busca_Nome(lista_Pessoas.getPessoa().getNome(), lista_Alfa);
            if (aux == null) {
                lista_Delta = inserir_na_lista(lista_Delta, lista_Pessoas.getPessoa().getNome(), lista_Pessoas.getPessoa().getCodigo());
            }
            lista_Pessoas = lista_Pessoas.getNoProxPessoa();
        }

        return lista_Delta;
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

    public int busca_quantidade_de_pessoas(NoPessoas lista) {
        if (lista == null) {
            return 0;
        }
        int contador = 0;
        NoPessoas verifica = lista;
        while (verifica != null) {
            contador++;
            verifica = verifica.getNoProxPessoa();
        }
        return contador;
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

    //Da para usar esta função para verificar se o nome ja existe ou não, só chamar ela e comparar
    //com o nome enviado, se eles forem iguais significa que ja existe
    public NoPessoas busca_Nome(String nome, NoPessoas lista) {
        if (lista == null) {
            return null;
        }

        NoPessoas verifica = lista;
        while (verifica != null) {
            if (verifica.getPessoa().getNome().equals(nome)) {
                break;
            }
            verifica = verifica.getNoProxPessoa();
        }
        return verifica;
    }

    public NoPessoas limparlista(NoPessoas lista) {
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

    public NoPessoas removerPosicaoNome(String nome, NoPessoas lista) {

        if ((lista != null)) {
            NoPessoas no;
            NoPessoas aux = lista;
            NoPessoas anterior;
            NoPessoas ultimo;
            int contador = 0;

            while (aux != null) {
                contador++;
                aux = aux.getNoProxPessoa();
            }
            if (contador == 1) {
                lista = null;
              
                return null;
            }

            no = busca_Nome(nome, lista);
            ultimo = buscaUltima(lista);

            if (no == null) {
                System.out.println("nome não existe na lista");
                return lista;
            }

            if (no.getPessoa().getNome().equals(lista.getPessoa().getNome())) //verifica se é o primeiro da lista
            {
               
                aux = lista.getNoProxPessoa();
                lista = null;
                return aux;
            } else if (no.getPessoa().getNome().equals(ultimo.getPessoa().getNome())) //verifica se é o ultimo valor
            {
                
                aux = no.getNoAntPessoa();
                ultimo = null;
                aux.setNoProxPessoa(null);
                return lista;
            } else {
                aux = no.getNoProxPessoa();
                anterior = no.getNoAntPessoa();
                no = null;
                anterior.setNoProxPessoa(aux);
                return lista;
            }

        } else {
            System.out.println("lista Vazia");
            return null;
        }
    }

}
