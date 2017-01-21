/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.Grupos;
import Funcoes.Pessoa;

/**
 *
 * @author emerson
 */
public class ClasseDeTestes {


    Grupos grupo = new Grupos();
    Scanner scan = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

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
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;

            }
        }
        
        
    }
          public void opcao1() {

        
    }
          
          public void opcao2()
          {
              grupo.MostrarNomes();
              
          }
}

