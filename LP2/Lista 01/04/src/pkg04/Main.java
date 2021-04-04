package pkg04;

import java.util.Scanner;

/**
 *
 * @author jonas
 * Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado para
o cliente que realizou o saque. Um possível critério seria o da “distribuição ótima” no sentido
de que as notas de menor valor sejam distribuídas em número mínimo possível. Escreva um
programa que leia o valor da quantia solicitada e imprima na tela a distribuição das notas de
acordo com o critério acima. Considere apenas a existência das notas de R$50, R$10, R$5
e R$1 no caixa eletrônico.
Exemplo: Ao digitar R$87, a impressão deve mostrar:
Nota50 = 1
Nota10 = 3
Nota5 = 1
Nota1 = 2
 */
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int valor,nota50,nota10,nota5,nota1;
    
    System.out.print("Entre com o valor da nota: ");
    valor = scan.nextInt();
    
    nota50 = valor / 50;
    valor = valor%50;
    
    nota10 = valor / 10;
    valor = valor%10;
    
    nota5 = valor / 5;
    valor = valor%5;
    
    nota1 = valor / 1;
    valor = valor%1;
    
        System.out.println("São: "+nota50+" notas de 50 RS");
        System.out.println("São: "+nota10+" notas de 10 RS");
        System.out.println("São: "+nota5+" notas de 5 RS");
        System.out.println("São: "+nota1+" notas de 1 RS");
    
    }
    
}
