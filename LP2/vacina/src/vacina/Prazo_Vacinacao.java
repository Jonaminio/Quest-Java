
package vacina;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prazo_Vacinacao{

    static void Calcular() {
        Date a = new Date();        
        a.setDate(a.getDate() + 10);        

        String formato = "dd/MM/yyyy";
        SimpleDateFormat dataFormatada = new SimpleDateFormat(formato); 
        System.out.println("Daqui há dez dias: " + dataFormatada.format(a));

    
    } 
    
    static void Saber_Fase() {
        
        //pegar tudo da pessoa e calcular a fase e chamar os metodos de fase
        System.out.println("Ja recebeu a primeira dose?");
        

    
    } 
    
}
