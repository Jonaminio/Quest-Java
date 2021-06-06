
package np2rev.Questao1;

import java.util.Random;

public class Adestrador {
    Animal adestrarAnimal() {
        Gato cat = new Gato();
        Cachorro dog = new Cachorro();
        Random random = new Random();
        Animal animals[] = {cat, dog};
        return animals[random.nextInt(animals.length)];
    }
    void brincar(Animal animal) {
        System.out.println(animal.emitirSom());
    }
}
