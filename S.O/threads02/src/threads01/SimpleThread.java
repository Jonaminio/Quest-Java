package threads01;
// implementando thread
public class SimpleThread extends Thread {
    //contructor
    public SimpleThread(String str) {
        super(str);
    }
    // iniciando a thread
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Faltam: "+ i + " metros Para o corredor: " + " " + getName());
            for (int j = 0; j < 5; j++) {
                System.out.println("O Corredor: "+" " + getName()+" Esta descansando");
            }
        }
        System.out.println("DONE! " + getName());
    }
}
