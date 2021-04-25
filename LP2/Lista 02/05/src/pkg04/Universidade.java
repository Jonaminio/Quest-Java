
package pkg04;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    public String nomeUniversidade;
    public String descricao;
    List<Curso> cursos = new ArrayList<Curso>();
    // construtor
    public Universidade(String nomeUniversidade, String descricao) {
        this.nomeUniversidade = nomeUniversidade;
        this.descricao = descricao;
    }
    public String nomeUniversidade(){
        return this.nomeUniversidade;
    }
    public void getNomeDosCursos(){
        for(Curso c: cursos){
            System.out.println(c.getNomeCurso());
        }
    }
    public void setCursos(List<Curso> cursos){
        this.cursos = cursos;
    }
    //vai contar da lista
    public int getTotalCursos(){
        int totalCursos = 0;
        for(Curso c: cursos){
            totalCursos++;
        }
     return totalCursos;
    }
    
    public int getTotalAlunosUniversidade(){
        int totalAlunos = 0;
        List<Estudante> estudantes;
        for(Curso c: cursos) {
            estudantes = c.getEstudantes();
            for (Estudante e: estudantes){
                totalAlunos++;
            }
        }
        return totalAlunos;
    }
    
}
