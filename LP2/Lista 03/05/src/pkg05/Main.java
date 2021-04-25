
package pkg05;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        // objetos funcionarios
        Funcionario func1 = new Funcionario(1, "Mauricio");
        Funcionario func2 = new Funcionario(2, "Joao");
        // objetos clientes
        Cliente c1 = new Cliente(100, "Fulano");
        Cliente c2 = new Cliente(101, "Cicrano");
        // objetos venda
        Venda caneta = new Venda(111, c1, func1);
        Venda lapis = new Venda(112, c1, func1);
        func1.addVenda(caneta);
        func1.addVenda(lapis);
        Venda borracha = new Venda(113, c2, func2);
        Venda lapiseira = new Venda(114, c2, func2);
        func2.addVenda(borracha);
        func2.addVenda(lapiseira);
        
        System.out.println("Funcionario: " + func1.getNome());
        System.out.println("Codigo: " + func1.getCodigo());
        List<Venda>vendasFunc1 = func1.getVendas();
        int total = 0;
        for(Venda v: vendasFunc1) {
            total++;
        }
        System.out.println("Total de Vendas: " + total);
    }
}
    
    

