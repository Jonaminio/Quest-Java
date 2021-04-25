package prova02;
import java.util.Scanner;
public class Prova02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1, nota2, media;
        System.out.print("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.print("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();
        media = (nota1 + nota2)/2;
        System.out.println("Sua média foi: " + media);

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            if (media < 4.0) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Apto para a Final!");
            }
        }
        scan.close();
    }
    
}
