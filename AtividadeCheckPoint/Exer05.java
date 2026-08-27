// GESTÃO DE PESSOAS IBGE

public class Exer05{
    public static void main(String[] args){
        
        float idade, A, B, C, D, E;
        float pA, pB, pC, pD, pE;
        int total;
        
        total = 0;
        A = 0;
        B = 0;
        C = 0;        
        D = 0;      
        E = 0;       
        do{
            idade = InOut.leFloat("Digite sua idade");
            if(idade > 0){
                if(idade >= 1 && idade <= 15){
                    A++;
                }
                else if(idade <= 30){
                    B++;
                }
                else if(idade <= 45){
                    C++;
                }
                else if(idade <= 60){
                    D++;
                }
                else{
                    E++;
                }
                total++;
            }
        }while(idade > 0);
        
        pA = (A / total) * 100;
        pB = (B / total) * 100;
        pC = (C / total) * 100;
        pD = (D / total) * 100;
        pE = (E / total) * 100;
        
        InOut.MsgDeAviso(
            "Resultado da Pesquisa",
            String.format(
            "Total de pessoas %d\n" +
            "Porcentagem do Grupo A %.2f%%\n" +
            "Porcentagem do Grupo B %.2f%%\n" +
            "Porcentagem do Grupo C %.2f%%\n" +
            "Porcentagem do Grupo D %.2f%%\n" +
            "Porcentagem do Grupo E %.2f%%\n",
            total,pA,pB,pC,pD,pE
            )
        );
        
    }
}
