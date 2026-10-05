public class Professor {

    private int matricula;
    private String nome;
    private String email;
    private double salario;
    private String nivelProgressao;
    private int fatorChorinho;
    private double pagamentoCalculado;

    public Professor(int matricula, String nome, String email, double salario,
                      String nivelProgressao, int fatorChorinho) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.nivelProgressao = nivelProgressao;
        this.fatorChorinho = fatorChorinho;
        this.pagamentoCalculado = 0.0;
    }

    // ---- Getters ----
    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public double getSalario() { return salario; }
    public String getNivelProgressao() { return nivelProgressao; }
    public int getFatorChorinho() { return fatorChorinho; }
    public double getPagamentoCalculado() { return pagamentoCalculado; }

    public void calcularPagamento() {
        double bonus = salario * (fatorChorinho * 0.01);
        this.pagamentoCalculado = salario + bonus;
    }

    @Override
    public String toString() {
        return String.format("Professor[%d] %s (%s) - Salario: R$%.2f, Pagamento calculado: R$%.2f",
                matricula, nome, nivelProgressao, salario, pagamentoCalculado);
    }
}