import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private String descricao;
    private int cargaHoraria;
    private String periodo;
    private String ementa;
    private int quantidadeAulas;
    private Professor professor;
    private ArrayList<Aluno> alunos;

    public Disciplina(String nome, String descricao, int cargaHoraria, String periodo, String ementa) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.periodo = periodo;
        this.ementa = ementa;
        this.alunos = new ArrayList<>();
    }

    // ---- Getters ----
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public int getCargaHoraria() { return cargaHoraria; }
    public String getPeriodo() { return periodo; }
    public String getEmenta() { return ementa; }
    public int getQuantidadeAulas() { return quantidadeAulas; }
    public Professor getProfessor() { return professor; }
    public ArrayList<Aluno> getAlunos() { return alunos; }

    public void calcularQuantidadeAulas() {
        this.quantidadeAulas = cargaHoraria / 2;
    }

    public Aluno buscarAluno(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getMatricula() == aluno.getMatricula()) {
                return a;
            }
        }
        return null;
    }

    public boolean inserirAluno(Aluno aluno) {
        if (buscarAluno(aluno) != null) {
            return false; // aluno ja matriculado
        }
        return alunos.add(aluno);
    }

    public boolean alterarAluno(Aluno aluno) {
        Aluno existente = buscarAluno(aluno);
        if (existente == null) {
            return false;
        }
        int indice = alunos.indexOf(existente);
        alunos.set(indice, aluno);
        return true;
    }

    public boolean inserirProfessor(Professor professor) {
        if (this.professor != null) {
            return false; // ja existe um professor responsavel
        }
        this.professor = professor;
        return true;
    }

    public boolean alterarProfessor(Professor professor) {
        this.professor = professor;
        return true;
    }

    public void listarAlunos() {
        System.out.println("Alunos matriculados em " + nome + ":");
        for (Aluno a : alunos) {
            System.out.println(" - " + a.getNome());
        }
    }

    @Override
    public String toString() {
        String nomeProfessor = (professor != null) ? professor.getNome() : "sem professor definido";
        return String.format("Disciplina: %s (%dh, periodo %s) - Professor: %s - %d aluno(s)",
                nome, cargaHoraria, periodo, nomeProfessor, alunos.size());
    }
}
