package threads01;
// implementando thread
public class SimpleThread extends Thread {

    private final String SimpleThread;
    private final float valor;
    //contructor
    public SimpleThread(String conta,float valor) {
        this.SimpleThread = conta;
        this.valor = valor;
    }
    // iniciando a thread
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Faltam: "+ i + " metros Para o corredor: " + " " + getName());
        }
        System.out.println("DONE! " + getName());
    }
}
