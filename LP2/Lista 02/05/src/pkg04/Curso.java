
package pkg04;

import java.util.ArrayList;
import java.util.List;


public class Curso {
    public String nomeCurso;
    public int codigo;
    Universidade universidade;
    List<Estudante> estudantes = new ArrayList<Estudante>();
    // construtor
    Curso(String nomeCurso, int codigo, Universidade universidade){
        this.nomeCurso = nomeCurso;
        this.codigo = codigo;
        this.universidade = universidade;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void addAluno(Estudante estudante) {
        this.estudantes.add(estudante);
    }
    public List<Estudante> getEstudantes(){
       return this.estudantes;
    }     
}
