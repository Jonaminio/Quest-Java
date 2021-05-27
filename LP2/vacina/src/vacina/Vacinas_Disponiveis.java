
package vacina;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vacinas_Disponiveis {
    
    //botar aqui as vacinas disponiveis e calcular as mesmas em prazo
    static void Coronavac() { 
        Date a = new Date();        
        a.setDate(a.getDate() + 14);        

        String formato = "dd/MM/yyyy";
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
        System.out.println("Segunda dose para o dia: " + dataFormatada.format(a));
    }
    static void AstraZeneca() {
       Date a = new Date();        
        a.setDate(a.getDate() + 84);        

        String formato = "dd/MM/yyyy";
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
        System.out.println("Segunda dose para o dia: " + dataFormatada.format(a));
    }
    static void Oxford() {
        Date a = new Date();        
        a.setDate(a.getDate() + 90);        

        String formato = "dd/MM/yyyy";
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
        System.out.println("Segunda dose para o dia: " + dataFormatada.format(a));
    }
    
}
