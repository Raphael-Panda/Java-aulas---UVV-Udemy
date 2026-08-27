// FIT

public class Exer02{
    public static void main(String[] args) {
        
        char sexo;
        float altura, Pideal;
        
        sexo = InOut.leChar("Digite seu sexo: ");
        altura = InOut.leFloat("Digite sua altura: ");
        
        if(sexo == 'M'){
          Pideal = (62.1f * altura) - 44.7f;  
        }
        else{
            Pideal = (72.7f * altura) - 58f;
        }
        
        InOut.MsgDeInformacao(
            "Resultado Peso",
            String.format(
                "Seu peso ideal é de: " +
                Pideal     
            )
        );
       
        
    }
}