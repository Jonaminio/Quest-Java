
package vacina;

import java.util.Scanner;

public class Prazo_Vacinacao{

    static void Saber_Vacina(){       
        //pegar tudo da pessoa e calcular a fase e chamar os metodos de fase
        Scanner teclado = new Scanner(System.in);

            System.out.println("Qual Vacina voce deseja tomar?");
            System.out.println("Digite (1) = Coronavac/Butantan");
            System.out.println("Digite (2) = AstraZeneca");
            System.out.println("Digite (3) = Oxford/Fiocruz ");
            int num = teclado.nextInt();
            switch (num) {
            case 1:
              System.out.println("Receberás a primeira dose hoje!");
              Vacinas_Disponiveis.Coronavac();
              break;
            case 2:
              System.out.println("Receberás a primeira dose hoje!");
              Vacinas_Disponiveis.AstraZeneca();
              break;
            case 3:
              System.out.println("Receberás a primeira dose hoje!");
              Vacinas_Disponiveis.Oxford();
              break;
            default:
              System.out.println("Número inválido");
              System.exit(0);
            }
        }
        } 

