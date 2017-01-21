/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import Funcoes.GerenciadorDeJanelas;

/**
 *
 * @author emerson
 */
public class ClasseDeTestes {

    public static void main(String[] args) {

        int op = -1;
        Scanner scan = new Scanner(System.in);
        while (op != 0) {
            System.out.println("----MENU PRINCIPAL-----");
            System.out.println("1-Inserir Dados da pessoa");
            System.out.println("0-Finalizar o programa");

            op = scan.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Saindo do Menu Principal");
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;

            }
            System.out.println("Programa Encerrado");
        }
    }

}
