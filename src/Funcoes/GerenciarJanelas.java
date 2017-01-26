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
public class GerenciarJanelas {

    private GerenciarListas gerenteListas = new GerenciarListas();
    private NoPessoas lista_Pessoas;
    private NoPessoas lista_Alfa;
    private NoPessoas lista_Delta;
    private int contador = 0;

    public int getContador() {
        return contador;
    }

    public NoPessoas getLista_Pessoas() {
        return lista_Pessoas;
    }

    public NoPessoas getLista_Alfa() {
        return lista_Alfa;
    }

    public NoPessoas getLista_Delta() {
        return lista_Delta;
    }
    

    public boolean adicionarPessoa(String nome) {
        if (nome.equals(null) || nome.equals("")) {
            return false;

        } else {
            this.contador++;
            Random gerador = new Random();
            int cod;
            cod = gerador.nextInt(100);
            this.lista_Pessoas = gerenteListas.inserir_na_lista(lista_Pessoas, nome, cod);
            return true;
        }
    }

    public String pegarNomes() {
        String nome = "";
        NoPessoas lista = lista_Pessoas;
        int primeiro = 0;
        if (contador == 0) {
            return null;
        } else if (contador == 1) {
            return lista_Pessoas.getPessoa().getNome();
        } else {
            while (lista != null) {
                if(primeiro == 0)
                {
                    nome = lista.getPessoa().getNome();
                    
                }else
                {
                    nome = nome + "##$@%%$BHdas" + lista.getPessoa().getNome();
                }
                
                lista = lista.getNoProxPessoa();
            }

        }

        return nome;
    }
    
        public void mostraNomes() {
        NoPessoas lista = lista_Pessoas;

        if (lista == null) {
            System.out.println("Não há valores");
        } else {
            while (lista != null) {
                System.out.println("nome: " + lista.getPessoa().getNome());
                lista = lista.getNoProxPessoa();
            }
        }
    }

}
