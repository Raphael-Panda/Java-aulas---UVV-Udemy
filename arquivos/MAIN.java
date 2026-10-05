import java.util.Date;

public class MAIN {
    public static void main(String[] args) {

        Universidade universidade = new Universidade();

        // --- Criacao de cursos ---
        Curso cc = new Curso(1, "Ciencia da Computacao", "Curso de CC", 8);
        Curso adm = new Curso(2, "Administracao", "Curso de ADM", 8);
        universidade.inserirCurso(cc);
        universidade.inserirCurso(adm);

        // --- Criacao de professor ---
        Professor professor = new Professor(100, "Prof. Ricardo", "ricardo@uvv.br", 5000.0, "Doutor", 10);
        professor.calcularPagamento();

        // --- Criacao de disciplina, usando InOut para obter a carga horaria ---
        int cargaHoraria = InOut.leInt("Digite a carga horaria da disciplina de POO (em horas): ");
        Disciplina poo = new Disciplina("Programacao Orientada a Objetos", "Introducao a POO em Java",
                cargaHoraria, "3o periodo", "Classes, objetos, heranca, polimorfismo");
        poo.calcularQuantidadeAulas();
        poo.inserirProfessor(professor);

        cc.inserirDisciplina(poo);

        // --- Criacao de alunos ---
        Aluno aluno1 = new Aluno(2001, "Joao Silva", "joao@aluno.uvv.br", new Date());
        Aluno aluno2 = new Aluno(2002, "Maria Souza", "maria@aluno.uvv.br", new Date());

        poo.inserirAluno(aluno1);
        poo.inserirAluno(aluno2);

        // --- Lancamento de notas (usando InOut, conforme exigido no enunciado) ---
        aluno1.setNota1B((float) InOut.leDouble("Nota da 1a Bimestral de " + aluno1.getNome() + ": "));
        aluno1.setNota2B((float) InOut.leDouble("Nota da 2a Bimestral de " + aluno1.getNome() + ": "));
        aluno1.setNotaRecuperacao((float) InOut.leDouble("Nota de recuperacao de " + aluno1.getNome() + " (0 se nao precisou): "));

        aluno1.calcularNotaSemestral();
        aluno1.calcularStatus();

        // --- Exibindo o resultado final numa janela de dialogo ---
        String relatorio = String.format(
            "RELATORIO FINAL%n%n%s%n%s%n%s%n%n%s%n%s",
            universidade.buscarCurso(1),
            poo,
            professor,
            aluno1,
            aluno2
        );
        InOut.MsgDeInformacao("Relatorio da Universidade", relatorio);

        // --- Demonstrando busca de disciplina ---
        Disciplina encontrada = cc.buscarDisciplina(
            new Disciplina("Programacao Orientada a Objetos", "", 0, "", "")
        );
        System.out.println("Disciplina encontrada: " + (encontrada != null ? encontrada.getNome() : "nao encontrada"));

        universidade.listarCursos();
    }
}
