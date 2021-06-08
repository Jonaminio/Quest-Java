
package provanp203;

public class Funcionario {
   protected String nome;
   private int id;

   public Funcionario(String nome) {
        this.nome = nome;
    }
    public Funcionario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    
}
