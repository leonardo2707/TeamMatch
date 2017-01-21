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
    private NoPessoas noPessoas = new NoPessoas();
    private Pessoa pessoa = new Pessoa();
    private int codigo;
    
    public void MostrarNomes()
    {
        System.out.println("Entrou no Mostrar nomes");
        while(lista_Pessoas != null)
        {
            System.out.println("nome = " + lista_Pessoas.getPessoa().getNome());
            lista_Pessoas = lista_Pessoas.getNoProxPessoa();
        }
    }
    
}
