/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.Grupos;
import Funcoes.NoPessoas;
import Funcoes.Pessoa;
import java.util.Random;

/**
 *
 * @author emerson
 */
public class ClasseDeTestes {

    Grupos grupo = new Grupos();
    Scanner scan = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();
    private NoPessoas lista_Pessoas;

    public static void main(String[] args) {

        int op = -1;
        ClasseDeTestes classe = new ClasseDeTestes();
        Scanner scan = new Scanner(System.in);

        while (op != 0) {
            System.out.println("----MENU PRINCIPAL-----");
            System.out.println("1-Inserir Dados da pessoa");
            System.out.println("2-Mostrar Nomes das pessoas");
            System.out.println("0-Finalizar o programa");

            op = scan.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Encerrando Programa");
                    break;
                case 1:
                    classe.opcao1();
                    break;
                case 2:
                    classe.opcao2();
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }
    }

    public void opcao1() {
         Random gerador = new Random();
         int cod;
         String nome;
         cod = gerador.nextInt(100);
         
         nome = "Emerson Leonardo Zock Alves";
         
        pessoa.Pessoa(nome, cod);
        this.lista_Pessoas = grupo.inserir_na_lista_pessoas(this.lista_Pessoas,pessoa);
        
        nome = "Teste da Silva";
        cod = gerador.nextInt(100);
         
        pessoa.Pessoa(nome, cod);
        this.lista_Pessoas = grupo.inserir_na_lista_pessoas(this.lista_Pessoas,pessoa);
        
        nome = "Treta da vida";
        cod = gerador.nextInt(100);
         
        pessoa.Pessoa(nome, cod);
        this.lista_Pessoas = grupo.inserir_na_lista_pessoas(this.lista_Pessoas,pessoa);
        
        
    }

    public void opcao2() {
        grupo.MostrarNomes(this.lista_Pessoas);

    }
}
