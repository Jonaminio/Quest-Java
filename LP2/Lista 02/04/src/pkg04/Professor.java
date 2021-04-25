package pkg04;

import java.util.ArrayList ;
import java.util.List;

public class Professor {
    // atributos da classe
    public String nome;
    public int id;
    List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    // construtor
    Professor(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    public String getNomeProfessor() {
        return this.nome;
    }
    public int getId() {
        return this.id;
    }
    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void mostrarDisciplinasMinistradas() {
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNomeDisciplina());
        }
    }
}
