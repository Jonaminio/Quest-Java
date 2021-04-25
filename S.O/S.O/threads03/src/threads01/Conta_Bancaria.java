// declarando as threads
package threads01;

public class Conta_Bancaria {

    public static void main(String[] args) {
        // start excuta o metodo run
        new SimpleThread("Conta Bancaria A",1000).start();
        new SimpleThread("Corredor Bancaria B",1000).start();
    }
    
}
