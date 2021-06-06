
package np2rev.Questao2;

public class Questao2 {
    public static void main(String args[]) {
        ContaCorrenteSimples conta_mauricio = new ContaCorrenteSimples(1000);
        conta_mauricio.depositar(50);
        System.out.println("Valor do saldo: " + conta_mauricio.saldo());
        conta_mauricio.sacar(50);
        System.out.println("Valor do saldo: " + conta_mauricio.saldo());
        
        ContaCorrenteEspecial conta_especial = new ContaCorrenteEspecial();
        conta_especial.depositar(1000);
        System.out.println("Valor do saldo: " + conta_especial.saldo());
        conta_especial.sacar(50);
        System.out.println("Valor do saldo: " + conta_especial.saldo());      
    }
}
