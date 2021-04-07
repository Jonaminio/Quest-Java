// declarando as threads
//2) Elabore uma aplicação baseada em thread que simule uma corrida. A classe deve possuir três
//parâmetros: (1) nome do corredor; (2) tamanho do trajeto (ex. inteiro em metros) e o (3) tempo em
//segundo de descanso médio do corredor (um inteiro entre 1 e 5). Execute quatro threads dessa
//aplicação
package threads01;

public class Threads {

    public static void main(String[] args) {
        // start excuta o metodo run
        new SimpleThread("Corredor 01",300,1).start();
        new SimpleThread("Corredor 02",200,5).start();
        new SimpleThread("Corredor 03",50,2).start();
        new SimpleThread("Corredor 04",100,4).start();
    }
    
}
