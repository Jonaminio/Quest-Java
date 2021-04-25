/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova03;

import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class Prova03 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int n, contador, fatorial;

        System.out.println("Digite um inteiro nao-negativo: ");
        n = ent.nextInt();

        fatorial = 1;
        contador = 2;

        while (contador <= n) {
            fatorial = fatorial * contador;
            contador = contador + 1;
        }
        System.out.println(fatorial);

    }

}
