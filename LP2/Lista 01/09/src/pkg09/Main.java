package pkg09;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author jonas
 * Faça um programa que mostre os N termos da sequência de Fibonacci: 0-1-1-2-3-5-
8-13-21-34-... Note: N é a quantidade de termos dados pelo usuário.

 */
public class Main {
    public static void main(String[] args) {
    //int num = Integer.parseInt(JOptionPane.showInputDialog)
    Scanner scan = new Scanner(System.in);
    int num;
    int r = 0;
        System.out.println("Digite o valor a ver calculado fibo: ");
        num = scan.nextInt();
    
    for (int i = 0; i <num; i++){
        r = i-1 + i-2;
        
        r = r +1;
        
        System.out.print(","+r);
    }
    
    }   
}
