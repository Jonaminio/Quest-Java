
package pkg05;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    private String email;
    public List<Venda> vendas = new ArrayList<Venda>();

    public Cliente(int codigo, String nome) {
        super(codigo);
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
