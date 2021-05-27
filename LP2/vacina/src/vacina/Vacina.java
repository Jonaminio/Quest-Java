/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacina;

/**
 *
 * @author jonas
 */
public class Vacina {

    public static void main(String[] args) {
        
        //id, nome, ano, profi
        Fases p1 = new Fases(1,"maria",1970,"professora");
        
        Comorbidades.mostrar();
        Prazo_Vacinacao.Calcular();
        Prazo_Vacinacao.Saber_Fase();
        Fases.Saber_Fase();
        
    }
    
}
