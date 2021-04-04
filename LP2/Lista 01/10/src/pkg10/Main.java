package pkg10;
/**
 *
 * @author jonas
 * Faça um programa que leia um valor digitado e calcule o fatorial deste número
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int x,f=0;
        System.out.println("Digite o numer a ser calculado o fatorial:");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        
        while(x > 1){
            f = f *(x-1); 
            x--;
        }
        System.out.println(f); // Aqui exibira o valor final do Fatorial
    }
    
}
