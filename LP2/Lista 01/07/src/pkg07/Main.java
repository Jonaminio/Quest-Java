package pkg07;

import java.util.Scanner;

/**
 *
 * Faça um programa para calcular a média aritmética M entre duas notas de um aluno
e mostrar sua situação, que pode ser Aprovado (M ≥ 7), Reprovado (M < 4) e Final (4 ≤ M <
7). Se o aluno ficar de Final, entre com a nota da prova Final e mostre a média e o resultado
final.
 * @author jonas
 */
public class Main {

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media;
        // entrada de dados
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        // calculo da média
        media = (nota1 + nota2)/2;
        System.out.println("Sua média foi: " + media);

        // logica da situação
        if (media >= 7.0) {
            System.out.println("Aprovado! Pode ir!!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado! Fica ai mesmo!");
            } else {
                System.out.println("Final! Vamos para a prova final!");
                float notaFinal, mediaFinal;
                System.out.print("Digite a nota da final: ");
                notaFinal = scan.nextFloat();
                mediaFinal = (notaFinal + media)/2;
                System.out.println("Sua média final é " + mediaFinal);
                if (mediaFinal >= 5.0) {
                    System.out.println("Aprovado! Passou raspando!");
                } else {
                    System.out.println("Reprovado!");
                }
            }
        }
        scan.close();
    }
    }
    
