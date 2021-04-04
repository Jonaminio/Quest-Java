package pkg05;

import java.util.Scanner;

/**
 *7. Faça um programa que leia o salário de um trabalhador e o valor da prestação de um
empréstimo. Se a prestação for maior que 20% do salário imprima: Empréstimo não
concedido, caso contrário imprima: Empréstimo concedido.

 * @author jonas
 */
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float valor,emprestimo;
    
    System.out.print("Entre com o valor do salario: ");
    valor = scan.nextFloat();
    System.out.print("Entre com o valor da prestação do emprestimo: ");
    emprestimo = scan.nextFloat();
    
    if(valor * 0.2 > emprestimo){
        System.out.println("Emprestimo Não Concedido");
    }else{
        System.out.println("Emprestimo Concedido");
         }
  
    }
    
}
