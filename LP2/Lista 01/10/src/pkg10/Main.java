package pkg10;
/**
 *
 * @author jonas
 * Faça um programa que leia um valor digitado e calcule o fatorial deste número
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int n, fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um numero do fatorial: ");
            n = ent.nextInt();
            
            for(int i = 1;i <= n; i++){
                fat = fat * i;
            }
            
            System.out.println("!" + n + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }
}

