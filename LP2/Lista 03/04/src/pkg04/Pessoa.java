package pkg04;


public class Pessoa {
    private int id;
    protected String nome;

    public Pessoa(int id) {
        this.id = id;
    }

    protected int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
