
package vacina;

import java.util.Scanner;

public class Fases extends Pessoa {

    public Fases(int id, String nome, int ano, String profi) {
        super(id, nome, ano, profi);
    }

    
    public void Saber_Fase() {   
        //pegar tudo da pessoa e calcular a fase e chamar os metodos de fase
        Comorbidades.mostrar();
       //pegando idade
        int idade = this.ano - 2021;
        System.out.println(idade);
        
        if (idade >= 75){       
            Fase1();
        }
        if (idade >= 60 && idade <= 74){       
            Fase2();
        }
        if (idade <= 59){       
            System.out.println("Possui Alguma das seguintes Comorbidade? ");
            Comorbidades.mostrar();
            
            System.out.println("Digite (1) = Para Sim ");
            System.out.println("Digite (2) = Para Não ");
            Scanner teclado = new Scanner(System.in);
            int a = teclado.nextInt();
            
            if (a == 1){
            Fase3();
            }
            if (a == 2){
                
            System.out.println("Se encaixa em algum desses casos? ");
            System.out.println("professores, profissionais das forças de segurança e salvamento, funcionários do sistema prisional e a população privada de liberdade. ");
            System.out.println("Digite (1) = Para Sim ");
            System.out.println("Digite (2) = Para Não ");
                if (a == 1){
                    Fase4();
            }
                else{
                    System.out.println("Voce esta inapto a receber a vacina"); 
                    System.exit(0);
            }
            }  
        }       
    } 
    
    static void Fase1() {
        
        System.out.println("Fase 1: devem receber a vacina trabalhadores da área de saúde e idosos com mais de 75 anos.");

    }
     static void Fase2() {
        
        System.out.println("Fase 2: idosos de 60 a 74 anos em qualquer situação");

    }
     static void Fase3() {
        
        System.out.println("Fase 3: indivíduos com condições de saúde que estão relacionadas a casos mais graves de Covid-19. ");

    }
      static void Fase4() {
        
        System.out.println("Fase 4: professores, profissionais das forças de segurança e salvamento, funcionários do sistema prisional e a população privada de liberdade. ");

    }
}
