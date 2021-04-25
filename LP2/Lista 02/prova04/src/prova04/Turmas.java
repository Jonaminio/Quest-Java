
package prova04;

import java.util.List;
import java.util.ArrayList;

public class Turmas {
    public String id;
    public int semestre;
    List<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
    
    public Turmas(String id, int semestre) {
        this.id = id;
        this.semestre = semestre;
    }

    public String getId() {
        return id;
    }

    public int getSemestre() {
        return semestre;
    }

    
}
