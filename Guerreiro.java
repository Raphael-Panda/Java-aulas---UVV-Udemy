public class Guerreiro {
    
    String nome;
    Bolsa minhaBolsa;
    int qtdVidas;
    String classe;
    
    public Guerreiro(String nome) {
        this.nome = nome;
        this.minhaBolsa = new Bolsa();
    }
    
    String vidaExtra(){
        String pedido = InOut.leString("Peça misericordia ao Oraculo por 1 vida extra: ");
        return pedido;
    }
    
    int sortearVidas(){
        qtdVidas = (int) (Math.random() * (12 - 9 + 1)) + 9;
        this.qtdVidas = qtdVidas;
        return qtdVidas;
    }
    
    String definirClasse(String classeEscolhida){
        InOut.MsgDeInformacao(
        "Escolha uma Classe de Guerreiro",
        "1 - Paladino\n 2 - Berserker\n 3 - Samurai"    
        );   
        String classeEscolhida = InOut.leString("Digite o nome da classe escolhida: ");
        
        if(classe.equalsIgnoreCase(classeEscolhida))
        
        return classe;
    }
    
}
