package pkg11;

import java.util.Scanner;

/**
 *
 * @author jonas
 * Faça um programa que apresente um menu de opções para cálculo das seguintes
operações entre dois números:
a. Adição (opção 1)
b. Subtração (opção 2)
c. Multiplicação (opção 3)
d. Divisão (opção 4)
e. Saída (opção 5)
O programa deve possibilitar ao usuário a escolha da operação desejada e a
exibição do resultado.

 */
public class Main {
    public static void main(String[] args) {
    int num1,num2,sw,r;
    Scanner scan = new Scanner(System.in);
        System.out.println("Digite o num1: ");
        num1 = scan.nextInt();
        System.out.println("Digite o num2: ");
        num2 = scan.nextInt();
    do{
        System.out.println("Digite a opreção que dseja: \n"+
        "a. Adição (opção 1)\n" +
        "b. Subtração (opção 2)\n" +
        "c. Multiplicação (opção 3)\n" +
        "d. Divisão (opção 4)\n" +
        "e. Saída (opção 5)\n\n");
        
        sw = scan.nextInt();
    switch(sw){
            case 1:
                r = num1+num2;
                System.out.println(r);
                break;
            case 2: // caso o número passado for 2
                r = num1-num2;
                System.out.println(r);
                break;
            case 3: // caso o número passado for 2
                r = num1*num2;
                System.out.println(r);
                break;
            case 4: // caso o número passado for 2
                r = num1/num2;
                System.out.println(r);
                break;

        }
    }while(sw <= 5);
    }
    
}
