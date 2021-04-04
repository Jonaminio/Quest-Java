package pkg08;

/**
 *
 * Faça um programa que calcule a diferença entre a soma dos quadrados dos
primeiros 10 números naturais e o quadrado da soma. Exemplo: a soma dos quadrados dos
dez primeiros números naturais é: 1
2 + 2
2 + ... + 102 = 385 O quadrado da soma dos dez
primeiros números naturais é: (1 + 2 + ... + 10)2 = 3025 A diferença entre a soma dos
quadrados dos dez primeiros números naturais e o quadrado da soma é: 3025 – 385 =
2640.
 * @author jonas
 */
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        b = 0;
        c = 0;
        System.out.println("");
        for (int i = 0; i < 11; i++){
            a = i*i;
            b = a+b;
            c = i+c;
        }
        System.out.println("O quadrado da soma é: "+b);
        System.out.println("A soma dos quadrados é: "+c*c);
        int r = c*c - b;
        System.out.println("A diferença é: "+r);
    }
    
}
