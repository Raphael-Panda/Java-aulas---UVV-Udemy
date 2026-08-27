// ENGINE UNITY

public class Exer03{
    public static void main(String[] args) {
        
        float tempoG, Vmedia, distancia, consumo;
        
        tempoG = InOut.leFloat("Digite o tempo gasto na viagem: ");
        Vmedia = InOut.leFloat("qual foi a Velocidade Média? ");
        
        if((tempoG >= 1 && tempoG <= 24) && (Vmedia >= 10 && Vmedia <= 200)){
            distancia = tempoG*Vmedia;
            consumo = distancia/10; //assumindo que o carro faz 10km por litro
            InOut.MsgDeInformacao(
                "Resumo da Viagem",
                String.format(
                "A distancia percorrida foi de %.2f%n" +
                "O consumo em litros foi de %.2f",
                distancia, consumo
                )
            );
        }
        else{
            InOut.MsgDeInformacao(
                "ERRO de Digitação",
                 String.format(
                 "O tempo gasto ou a distancia estão incorretos"
                 ) 
            );
        }
        
        
        
        
    }
}
