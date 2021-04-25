
package pkg05;

import java.util.Date;

public class Venda {
    private int codigo;
    public Date data;
    public Cliente cliente; 
    public Funcionario funcionario;

    public Venda(int codigo, Cliente cliente, Funcionario funcionario) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getCodigo() {
        return codigo;
    }
    
    
    
}
