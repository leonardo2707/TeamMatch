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
    
    public void inserir_Lista_Pessoas(String nome)
    {   Random gerador = new Random();  
        int cod;
        
        cod = gerador.nextInt(100);
        pessoa.Pessoa(nome, cod);
        System.out.println("nome: " + pessoa.getNome() + "\nCod = " + pessoa.getCodigo());
        noPessoas.setPessoa(pessoa);
        grupo.inserirPessoaNaLista(noPessoas);
    }
    
}
