
package provanp3.pkg02;

abstract class Individuo {
    public String nome;
    public String curso;
    private int id;
  

    public Individuo(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
        id = 0;
        incrementar();
    }
   
    private void incrementar(){
        id++;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public abstract void atualizar(String nome, String curso);
       
    public abstract void mostrarDados();
    
    
}
