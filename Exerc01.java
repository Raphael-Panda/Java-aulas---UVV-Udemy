// FAZENDA PAI

public class Exerc01 {
    public static void main(String[] args) {
    
    float total, peso, gordo, magro, media;
    int bois;
    
    peso = InOut.leFloat("Digite o peso dos bois: ");
    
    total = 0;
    bois = 0;
    gordo = 0;
    magro = 99999;
    
    while(peso != 0){
        total += peso;
        
        if(bois == 0){
            gordo = peso;
            magro = peso;
        } else{     
            if(peso >= gordo){
                gordo = peso;
            }
            if(peso <= magro){
                magro = peso;
            }
        }
        
        bois++;
        peso = InOut.leFloat("Digite o peso dos bois: ");
    }
    
    media = total / bois;
    
    InOut.MsgDeInformacao(
        "Resultado",
        String.format(
            "O peso médio dos bois é: %.2f Kg%n" +
            "O boi mais gordo tem %.2f Kg%n" +
            "O boi mais magro tem %.2f Kg",
            media, gordo, magro
        )
    );
    }
}