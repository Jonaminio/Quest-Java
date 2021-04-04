package pkg01;

import java.util.Scanner;

/**
 *
 * @author jonas
 * Faça um programa que calcule e mostre a área de um círculo. Nota: sabe-se que a
área é A = π*r2
 .

 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final float PI = 3.1415f; // constante 
        float rad,res;
        // entrada de dados
        System.out.print("Entre com o valor de r: ");
        rad = scan.nextFloat();
        // calculo
        res = PI*rad*rad;
        //saída de dados
        System.out.println("A area é:" + res+ " ");
        scan.close();
    }
    
}
