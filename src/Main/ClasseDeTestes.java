/*
 *Classe de testes, feita para testar o sistema, quando for integrar no sistema as variaveis dela vão para 
 *uma classe de gerenciamento de janelas, para manter os dados entre as janelas assim como os dados são
 *mantidos aqui
 */
package Main;

import Funcoes.GerenciarListas;
import java.util.Scanner;
import Funcoes.NoPessoas;
import java.util.Random;

/**
 *
 * @author emerson
 */
public class ClasseDeTestes {

    GerenciarListas gerenteLitas = new GerenciarListas();
    Scanner scan = new Scanner(System.in);
    private NoPessoas lista_Pessoas;
    private NoPessoas lista_Alfa;
    private NoPessoas lista_Delta;

    public static void main(String[] args) {

        int op = -1;
        ClasseDeTestes classe = new ClasseDeTestes();
        Scanner scan = new Scanner(System.in);

        while (op != 0) {
            System.out.println("----MENU PRINCIPAL-----");
            System.out.println("1-Inserir Dados da pessoa");
            System.out.println("2-Mostrar Nomes das pessoas");
            System.out.println("3-Deletar Lista de pessoas");
            System.out.println("4-Remover pessoa especifica");
            System.out.println("5-Dividir Times");
            System.out.println("6-Colocar pessoa especifica em time alfa");
            System.out.println("7-Limpar Times");
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
                case 3:
                    classe.opcao3();
                    break;
                case 4:
                    classe.opcao4();
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
 
        nome = "nome 1";
        cod = gerador.nextInt(100);
        lista_Pessoas = gerenteLitas.inserir_na_lista(lista_Pessoas, nome, cod);
        
        nome = "nome 2";
        cod = gerador.nextInt(100);
        lista_Pessoas = gerenteLitas.inserir_na_lista(lista_Pessoas, nome, cod);
                
        nome = "nome 3";
        cod = gerador.nextInt(100);
        lista_Pessoas = gerenteLitas.inserir_na_lista(lista_Pessoas, nome, cod);
    /*    
        nome = "nome 4";
        cod = gerador.nextInt(100);
         
        pessoa.Pessoa(nome, cod);
        this.lista_Pessoas = grupo.inserir_na_lista_pessoas(this.lista_Pessoas,pessoa);
       */ 
    }

    public void opcao2() {
        gerenteLitas.mostraNomes(lista_Pessoas);

    }
    
    public void opcao3()
    {
        lista_Pessoas = gerenteLitas.limparlista(lista_Pessoas);
    }
    
    public void opcao4()
    {
        String nome;
        nome = "nome 2";
        
        lista_Pessoas = gerenteLitas.removerPosicaoNome(nome, lista_Pessoas);
    }
}
