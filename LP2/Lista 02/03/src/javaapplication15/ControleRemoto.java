package javaapplication15;

import java.util.Scanner;

public class ControleRemoto {
    int volume;
    int canal;

    public ControleRemoto(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    
    void AumentarVolume(){
       this.volume ++;
           
    }
    void DiminuirVolume(){
       this.volume --;
           
    }
    void AumentarCanal(){
       this.canal ++;
           
    }
    void DiminuirCanal(){
       this.canal --;
           
    }
    void IndicadoCanal(){
       // int can;
        System.out.println("Digite o Canal que quer indicar: ");
        Scanner teclado = new Scanner(System.in);
        int can = teclado.nextInt();
        this.canal = can;
    }
    void Mostra(){
        System.out.println("Volume Atual: "+this.volume);
        System.out.println("Canal Atual: "+this.canal);
    
    }
        
        
}
