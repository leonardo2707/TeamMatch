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

    GerenciarListas gerenteListas = new GerenciarListas();
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
            System.out.println("8-MOSTRAR TIME ALFA");
            System.out.println("9-MOSTAR TIME DELTA");
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
                case 5:
                    classe.opcao5();
                    break;
                case 8:
                    classe.opcao8();
                    break;
                case 9:
                    classe.opcao9();
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
        lista_Pessoas = gerenteListas.inserir_na_lista(lista_Pessoas, nome, cod);

        nome = "nome 2";
        cod = gerador.nextInt(100);
        lista_Pessoas = gerenteListas.inserir_na_lista(lista_Pessoas, nome, cod);

        nome = "nome 3";
        cod = gerador.nextInt(100);
        lista_Pessoas = gerenteListas.inserir_na_lista(lista_Pessoas, nome, cod);
            
        nome = "nome 4";
         cod = gerador.nextInt(100);
        lista_Pessoas = gerenteListas.inserir_na_lista(lista_Pessoas, nome, cod);
      /*   
        pessoa.Pessoa(nome, cod);
        this.lista_Pessoas = grupo.inserir_na_lista_pessoas(this.lista_Pessoas,pessoa);
         */
    }

    public void opcao2() {
        gerenteListas.mostraNomes(lista_Pessoas);

    }

    public void opcao3() {
        lista_Pessoas = gerenteListas.limparlista(lista_Pessoas);
    }

    public void opcao4() {
        String nome;
        nome = "nome 2";

        lista_Pessoas = gerenteListas.removerPosicaoNome(nome, lista_Pessoas);
    }

    public void opcao5() {
        lista_Alfa = gerenteListas.dividirTimes(lista_Pessoas, lista_Alfa);
        // lista_Delta = gerenteListas.Sobras(lista_Pessoas, lista_Alfa);
    }

    public void opcao8() {
        gerenteListas.mostraNomes(lista_Alfa);

    }

    public void opcao9() {
        gerenteListas.mostraNomes(lista_Delta);

    }
}
