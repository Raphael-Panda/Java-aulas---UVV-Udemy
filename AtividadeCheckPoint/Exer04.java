// ROCK NA SEXTA

public class Exer04{
    public static void main(String[] args){
        
        float n1, n2, conta;
        int op;
        
        
        conta = 0;
        do{
            op = InOut.leInt(
                String.format(
                "Escolha uma opção\n" +
                "[1] – Adição\n" +
                "[2] – Subtração\n" +
                "[3] – Multiplicação\n" +
                "[4] – Divisão\n" +
                "[5] – Finalizar\n" +
                "Escolha uma opção:"
                )
            );
            
            if(op == 5){
                break;
            }
            
            n1 = InOut.leFloat("Digite o primeiro número");
            n2 = InOut.leFloat("Digite o segundo número");
            
            switch (op){
                case 1:
                    conta = n1 + n2;
                    break;
                case 2:
                    conta = n1 - n2;
                    break;
                case 3:
                    conta = n1 * n2;
                    break;
                case 4: 
                    conta = n1 / n2;
                    break;
            }
            System.out.println("Resultado da Operação = " + conta);
            
            n1 = 0;
            n2 = 0;
            conta = 0;
       
        }while(op != 5);
        
        
    }
}
