
package np2rev.Questao1;

public class Questao1 {
    public static void main(String[] args){
        Adestrador adestrador = new Adestrador();
        for (int i = 0; i < 20; i++) {
            Animal animal = adestrador.adestrarAnimal();
            adestrador.brincar(animal);
        }
    }
}
