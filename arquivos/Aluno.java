import java.util.Date;

public class Aluno {

    private int matricula;
    private String nome;
    private String email;
    private Date dataIngresso;
    private float nota1B;
    private float nota2B;
    private float notaRecuperacao;
    private float mediaFinal;
    private String status;

    public Aluno(int matricula, String nome, String email, Date dataIngresso) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dataIngresso = dataIngresso;
        this.status = "Cursando";
    }

    // ---- Getters ----
    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public Date getDataIngresso() { return dataIngresso; }
    public float getNota1B() { return nota1B; }
    public float getNota2B() { return nota2B; }
    public float getNotaRecuperacao() { return notaRecuperacao; }
    public float getMediaFinal() { return mediaFinal; }
    public String getStatus() { return status; }

    // ---- Setters para lancamento de notas ----
    public void setNota1B(float nota1B) { this.nota1B = nota1B; }
    public void setNota2B(float nota2B) { this.nota2B = nota2B; }
    public void setNotaRecuperacao(float notaRecuperacao) { this.notaRecuperacao = notaRecuperacao; }

    public void calcularNotaSemestral() {
        float media = (nota1B + nota2B) / 2f;
        if (media < 6.0f) {
            media = (media + notaRecuperacao) / 2f;
        }
        this.mediaFinal = media;
    }

    public void calcularStatus() {
        this.status = (mediaFinal >= 6.0f) ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return String.format("Aluno[%d] %s - Media: %.2f, Status: %s",
                matricula, nome, mediaFinal, status);
    }
}