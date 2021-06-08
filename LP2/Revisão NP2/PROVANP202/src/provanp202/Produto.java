
package provanp202;


abstract class Produto {
   public String nome;
   public double preco;
   private int id;

    public Produto(String nome, double preco, int id) {
        this.nome = nome;
        this.preco = preco;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
   abstract void atualizar(String nome, double preco);
   abstract void mostrarDados();
   
    
}
