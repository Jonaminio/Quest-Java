package threads01;
// implementando thread
public class SimpleThread2 implements Runnable {

    private final String SimpleThread2;
    //contructor
    public SimpleThread2(String str) {
        this.SimpleThread2 = str;
    }
    // iniciando a thread
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        System.out.println("DONE! " + Thread.currentThread().getName());
    }
}