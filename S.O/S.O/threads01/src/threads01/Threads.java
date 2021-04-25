// declarando as threads
package threads01;

public class Threads {

    public static void main(String[] args) {
        // start excuta o metodo run
        new SimpleThread("Contador 01").start();
        new SimpleThread("Contador 02").start();
        new Thread (new SimpleThread2("Contador 03")).start();
        new Thread (new SimpleThread2("Contador 04")).start();
    }
    
}
