
package np3rev.pkg03;

import java.util.ArrayList;
import java.util.List;


class Pessoa {
    public Departamento departamento;
    private int id;
    protected String nome;

    public Pessoa(int id) {
        this.id = id;
        departamento = new Departamento(0);
    }
    protected int getId() {
        return id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(int id, String nome) {
        super(id);
        //setNome(nome);
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}

class Departamento {
    public List<Pessoa> pessoas;
    private int id_dep;
    public String descricao;

    public Departamento(int id_dep) {
        this.id_dep = id_dep;
        pessoas = new ArrayList<>();
    }
    protected int getIdDep() {
        return id_dep;
    }
}

public class Questao3 {
    
}
