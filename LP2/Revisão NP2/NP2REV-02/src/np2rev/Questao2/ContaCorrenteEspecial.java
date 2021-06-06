
package np2rev.Questao2;

public class ContaCorrenteEspecial extends ContaCorrenteSimples {
    public ContaCorrenteEspecial() {
        super();
    }
    public ContaCorrenteEspecial(double montante) {
        super(montante);
    }
    @Override
    public void sacar(double quantia) {
        double taxa = 0.01*quantia;
        if (quantia + taxa > montante) {
            System.out.println("Não possui dinheiro o suficiente.");
        } else{
            montante = montante - quantia - taxa;
        }
    }
}
