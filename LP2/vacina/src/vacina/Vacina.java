
package vacina;

public class Vacina {

    public static void main(String[] args) {
        System.out.println("Ola, Bem vindo a sua central de Vaninação fora bolsonaro");
        System.out.println("Primeiro vamos saber seu dados");
       // não obrigatorio receber
       Pessoa p2 = new Pessoa(1,"maria",1970,"professora");
       //Saber qual fase se aplica
       Fases.Saber_Fase();
       //Eescolher vacina
       Prazo_Vacinacao.Saber_Vacina();
       //Agradecimentos + Possiveis efeitos
        System.out.println("Obrigado");
       
         
    }
    
}
