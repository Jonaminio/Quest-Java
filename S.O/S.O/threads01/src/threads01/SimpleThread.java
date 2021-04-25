package threads01;
// implementando thread
public class SimpleThread extends Thread {
    //contructor
    public SimpleThread(String str) {
        super(str);
    }
    // iniciando a thread
    public void run() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i + " " + getName());
        }
        System.out.println("DONE! " + getName());
    }
}

