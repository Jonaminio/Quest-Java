
package pkg03;

public class Pessoa {
    private int id;
    protected String nome;
    public String email;

    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    

    protected String setNome() {
        return nome;
    }
    
    public void Retorne(){
    
        System.out.println(this.nome);
    
    }
    
    
    
   
    
}
