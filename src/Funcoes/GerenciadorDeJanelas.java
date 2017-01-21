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
public class GerenciadorDeJanelas {

    private Grupos grupo = new Grupos();
    private NoPessoas noPessoas = new NoPessoas();
    private Pessoa pessoa = new Pessoa();
    int contador = 0;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void inserir_Lista_Pessoas(String nome) {
        Random gerador = new Random();
        int cod;
        contador++;

        cod = gerador.nextInt(100);
        pessoa.Pessoa(nome, cod);
        noPessoas.setPessoa(pessoa);
        grupo.inserirPessoaNaLista(noPessoas);
    }

    public String pegar_nomes() {
        String nomes = "";
        //juntar os nomes em uma unica String e dividir eles com os caracteres ##$@%%$BHdas
        String teste = grupo.retornarNomes();

        return nomes;
    }
}
