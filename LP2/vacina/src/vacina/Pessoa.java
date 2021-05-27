package vacina;


public class Pessoa {
    private int id;
    protected String nome;
    public int ano;
    public String profi;

    public Pessoa(int id, String nome, int ano, String profi) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.profi = profi;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    public String getProfi() {
        return profi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setProfi(String profi) {
        this.profi = profi;
    }
    
    
}
