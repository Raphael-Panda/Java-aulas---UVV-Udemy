// UTILIDADE PUBLICA

public class Exer06{
    public static void main(String[] args){
        
        int nascimento, idade = 0;
        
        nascimento = InOut.leInt("Digite seu ano de nascimento");
        idade = 2026 - nascimento;

        
        if(idade < 16){
            InOut.MsgDeInformacao(
                "Utilidade Publica",
                String.format(
                "Sua idade é de %d anos\n",
                idade
                )    
            );           
        }
        
        if(idade >= 16){
            InOut.MsgDeInformacao(
                "Utilidade Publica",
                String.format(
                "Sua idade é de %d anos\n" +
                "Você tem idade para votar",
                idade
                )    
            );
        }
        if(idade >= 18){
            InOut.MsgDeInformacao(
                "Utilidade Publica",
                String.format(
                "E ja tem idade para tirar carteira de habilitação"
                )    
            );
        }
    }
}
