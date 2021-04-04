package pkg03;

import java.util.Scanner;

/**
 *
 * @author jonas
 * 5. Faça um programa que pergunte quanto você ganha por hora e o número de horas
trabalhadas por mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se
que são descontados 11% para o Imposto de Renda (IR), 8% para o INSS e 5% para o
sindicato. Seu programa deve seguir o modelo de saída abaixo:
+ Salário Bruto: R$
- IR (11%): R$
- INSS (8%): R$
- Sindicato (5%): R$
= Salário Líquido: R$
Obs.: Salário Bruto - Descontos = Salário Líquido
 */
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    float ganho,horas;
    System.out.print("Entre com o valor do ganho: ");
    ganho = scan.nextFloat();
    System.out.print("Entre com o valor de horas: ");
    horas= scan.nextFloat();
    
    
    float salariobruto = ganho * horas;
    float ir = (float) (salariobruto * 0.11);
    float inss = (float) (salariobruto * 0.08);
    float sindicato = (float) (salariobruto * 0.05);
    float salario = salariobruto -ir - inss - sindicato;
    
        System.out.println("Slario bruto:"+salariobruto+"R$");
        System.out.println("IR:"+ir+"R$");
        System.out.println("Inss:"+inss+"R$");
        System.out.println("Sindicato:"+sindicato+"R$");
        System.out.println("Slario:"+salario+"R$");
    
    }
    
}
