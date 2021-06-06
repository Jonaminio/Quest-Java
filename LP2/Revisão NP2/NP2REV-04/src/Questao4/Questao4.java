
package Questao4;

class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void imprimir() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("mauricio");
        p.setIdade(5);
        p.setAltura(1.61f);
        p.imprimir();
    }
}
