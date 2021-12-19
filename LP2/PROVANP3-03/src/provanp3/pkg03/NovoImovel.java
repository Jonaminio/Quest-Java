
package provanp3.pkg03;

public class NovoImovel extends Imovel{
    private double adicional;
    
    public NovoImovel(double preco,double adicional) {
        super(preco);
        this.adicional = adicional;
        
    }

    public double getAdicional() {
        return adicional;
    }
    
    public double calculoImovelNovo(){
    
    return getPreco() + this.adicional;
    
    }
    
}
