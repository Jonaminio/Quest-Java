
package vacina;

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
            Fase1();
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
