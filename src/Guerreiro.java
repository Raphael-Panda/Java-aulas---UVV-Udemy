public class Guerreiro {
    
    String nome;
    Bolsa minhaBolsa;

    public Guerreiro(String nome) {
        this.nome = nome;
    }
    
    
    String vidaExtra(){
        //return vidaExtra;
    }
    
    int sortearVidas(){
        int QtdVidas;
        QtdVidas = (int) (Math.random() * (12 - 9 + 1)) + 9;
        return QtdVidas;
    }
    
}
