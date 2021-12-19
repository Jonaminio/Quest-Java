
package provanp3.pkg01;

public class Imovel {
    private double preco;
    protected String endereco;

    public Imovel(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double calculoimovelnovo(){
        
     return this.preco + 0.1*this.preco;
    
    }
    
    public double calculoimovelvelho(){
    
    return this.preco - 0.05*this.preco;
    
    }
    
    
    
}
