package pkg02;

import java.util.Scanner;

/**
 *
 * @author jonas
 * Faça um programa que leia um número e, caso seja positivo, calcule e mostre:
    a. O quadrado do número digitado
    b. A raiz quadrada do número

 */
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num;
    //lendo
    System.out.print("Entre com o valor: ");
    num = scan.nextInt();
    
     if (num%2 == 0){
        System.out.println("O quadrado do numero é: " +(num*num));
        System.out.println("A raiz do numero é: "+(Math.sqrt(num)));
        }

    }
    
}
