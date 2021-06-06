
package Questao3;

public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double preco, double adicional) {
        super(preco);
        this.adicional = adicional;
    }
    public double getAdicional () {
        return adicional;
    }
    public double calculoImovelNovo() {
        return getPreco() + adicional;
    }
}
