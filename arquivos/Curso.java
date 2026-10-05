import java.util.ArrayList;

public class Curso {

    private int codCurso;
    private String nomeCurso;
    private String descricao;
    private int duracao;
    private int notaEnade;
    private ArrayList<Disciplina> disciplinas;

    public Curso(int codCurso, String nomeCurso, String descricao, int duracao) {
        this.codCurso = codCurso;
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.duracao = duracao;
        this.notaEnade = 0; // nota ainda nao avaliada ao criar o curso
        this.disciplinas = new ArrayList<>();
    }

    // ---- Getters ----
    public int getCodCurso() { return codCurso; }
    public String getNomeCurso() { return nomeCurso; }
    public String getDescricao() { return descricao; }
    public int getDuracao() { return duracao; }
    public int getNotaEnade() { return notaEnade; }
    public ArrayList<Disciplina> getDisciplinas() { return disciplinas; }

    public void setNotaEnade(int notaEnade) { this.notaEnade = notaEnade; }

    public boolean inserirDisciplina(Disciplina disciplina) {
        if (buscarDisciplina(disciplina) != null) {
            return false;
        }
        return disciplinas.add(disciplina);
    }

    public Disciplina buscarDisciplina(Disciplina disciplina) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(disciplina.getNome())) {
                return d;
            }
        }
        return null;
    }

    public boolean alterarDisciplina(Disciplina disciplina) {
        Disciplina existente = buscarDisciplina(disciplina);
        if (existente == null) {
            return false;
        }
        int indice = disciplinas.indexOf(existente);
        disciplinas.set(indice, disciplina);
        return true;
    }

    public void listarDisciplinas() {
        System.out.println("Disciplinas do curso " + nomeCurso + ":");
        for (Disciplina d : disciplinas) {
            System.out.println(" - " + d.getNome());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Curso)) return false;
        Curso outro = (Curso) obj;
        return this.codCurso == outro.codCurso;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codCurso);
    }

    @Override
    public String toString() {
        return String.format("Curso[%d] %s - %d semestres, Nota ENADE: %d",
                codCurso, nomeCurso, duracao, notaEnade);
    }
}