package threads01;
// implementando thread

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThread extends Thread {

    public int trajeto;
    public int descanso;
    public String nome;
    //contructor
    public SimpleThread(String str, int traj, int desc) {
        nome = str;
        trajeto = traj;
        descanso = desc;
    }
    // iniciando a thread
    public void run() {
        for (int i = trajeto; i >= 0; i--) {
            System.out.println("Faltam: "+ i + " metros Para o corredor: " + " " + nome );
          
            System.out.println("O Corredor: "+" " + nome+" Esta descansando");
            
            try {
                Thread.sleep(descanso * 1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SimpleThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("DONE! " + nome);
    }
}
