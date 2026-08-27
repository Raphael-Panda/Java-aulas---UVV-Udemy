public class Funcionario{
    public static void main(String[] args){
        
        class Funcionário{
            //propriedades
            int  matricula;
            String nome;
            String cargoAtual;
            float salarioAtual;

            public Funcionário(int matricula, String nome, String cargoAtual, float salarioAtual) {
                this.matricula = matricula;
                this.nome = nome;
                this.cargoAtual = cargoAtual;
                this.salarioAtual = salarioAtual;
            }
            
            
            
            // comportamentos/metodos
            void cadastrar(){
                System.out.println("Realizar cadastro" + matricula);
            }
            
            void consultar(){
                System.out.println("Consultar Nome" + nome);
            }
            
            void atualizarSalario(float novoSalario){
                System.out.println("Atualizar Salario" + novoSalario);
            }
            
            void listarDependentes(){
                System.out.println("Cargo atual" + cargoAtual);
            }
            
        }
        
    }
}