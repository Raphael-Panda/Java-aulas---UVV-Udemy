import java.util.HashSet;
import java.util.Set;

public class Universidade {

    private Set<Curso> listaCursos;

    public Universidade() {
        this.listaCursos = new HashSet<>();
    }

    public Set<Curso> getListaCursos() {
        return listaCursos;
    }

    public boolean inserirCurso(Curso curso) {
        return listaCursos.add(curso);
    }

    public boolean removerCurso(Curso curso) {
        return listaCursos.remove(curso);
    }

    public Curso buscarCurso(int codCurso) {
        for (Curso c : listaCursos) {
            if (c.getCodCurso() == codCurso) {
                return c;
            }
        }
        return null;
    }

    public void listarCursos() {
        System.out.println("Cursos cadastrados na universidade:");
        for (Curso c : listaCursos) {
            System.out.println(" - " + c);
        }
    }
}