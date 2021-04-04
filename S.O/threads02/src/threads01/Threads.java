// declarando as threads
package threads01;

public class Threads {

    public static void main(String[] args) {
        // start excuta o metodo run
        new SimpleThread("Corredor 01").start();
        new SimpleThread("Corredor 02").start();
        new SimpleThread("Corredor 03").start();
        new SimpleThread("Corredor 04").start();
    }
    
}
