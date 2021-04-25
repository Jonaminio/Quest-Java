package pkg04;

import java.util.List;
import java.util.ArrayList;

public class Disciplina {

    public String nome;
    public int codigo;
    List<Professor> professores = new ArrayList<Professor>();

    Disciplina(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNomeDisciplina() {
        return this.nome;
    }
    public int getCodigo() {
        return this.codigo;
    }
    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }
    public void mostrarProfessoresDasDisciplina() {
        for (Professor p : professores) {
            System.out.println(p.getNomeProfessor());
        }
    }
}
