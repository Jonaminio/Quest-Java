
package prova04;

import java.util.List;
import java.util.ArrayList;

public class Disciplinas {
    public String nome;
    public String codigo;
    public int cargaHoraria;
    List<Turmas> turmas = new ArrayList<Turmas>();
    
    
    public Disciplinas(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNomeDisciplina() {
        return nome;
    }
    public void addTurmas(Turmas turmas) {
        this.turmas.add(turmas);
    }
    
    
}
