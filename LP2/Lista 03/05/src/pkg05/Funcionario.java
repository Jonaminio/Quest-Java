
package pkg05;
import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa{
    protected double salario;
    public List<Venda> vendas = new ArrayList<Venda>();

    public Funcionario(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }
    
    public void addVenda(Venda venda) {
        vendas.add(venda);
    }
    public List<Venda> getVendas() {
        return vendas;
    }
   
    
}
