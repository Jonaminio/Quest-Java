package vacina;

public class Pessoa {

    private int id;
    protected String nome;
    static int ano;
    public String profi;

    public Pessoa(int id, String nome, int ano, String profi) {
        this.id = id;
        this.nome = nome;
        Pessoa.ano = ano;
        this.profi = profi;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static int getAno() {
        return ano;
    }

    public String getProfi() {
        return profi;
    }
   
    
}
