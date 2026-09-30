public class Guerreiro {
    
    String nome;
    Bolsa minhaBolsa;
    int qtdVidas;
    String classe;
    
    
    
    public Guerreiro(String nome) {
        this.nome = nome;
        this.minhaBolsa = new Bolsa();
    }
    
    //getters para os atriutos serem acessados de fora da classe
    public String getNome(){
        return this.nome;
    }
    public int getQtdVidas(){
        return this.qtdVidas;
    }
    public String getClasse(){
        return this.classe;
    }
    public Bolsa getMinhaBolsa(){
        return this.minhaBolsa;
    }
    
    
    boolean estaVivo(){
        return qtdVidas >= 1;
    }
    
    
    void perderVida(){
        this.qtdVidas--;
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
    
    
    String definirClasse(){
        InOut.MsgDeInformacao(
        "Escolha uma Classe de Guerreiro",
        "1 - Paladino\n 2 - Berserker\n 3 - Samurai"    
        );   
        
        boolean valido = false;
        String classeEscolhida = "";
        
        //loop para o jogador escolher a classe corretamente
        while(valido != true){
            classeEscolhida = InOut.leString("Digite o nome da classe escolhida: ");
                    
            if(classeEscolhida.equalsIgnoreCase("Paladino") || classeEscolhida.equalsIgnoreCase("Berserker") || classeEscolhida.equalsIgnoreCase("Samurai")){
                valido = true;
            }
            else{
                InOut.MsgDeInformacao(
                "Classe Digitada Incorreta, escolha novamente",
                "1 - Paladino\n 2 - Berserker\n 3 - Samurai"    
                );
            }
        }
        //atribui o valor para o atributo classe apenas fora do loop para garantir
        //que apenas uma String valida seja guardada
        this.classe = classeEscolhida;       
        return classeEscolhida;
    }
    
}