
package Questao3;

public class NovoImovelCorretor extends ImovelNovo {
    private double porcentagem;

    public NovoImovelCorretor(double preco, double adicional, double porcentagem) {
        super(preco, adicional);
        this.porcentagem = porcentagem;
    }
    @Override
    public double calculoImovelNovo() {
        double valor = getPreco() + getAdicional();
        valor = valor + valor*porcentagem;
        return valor;
    }
}
