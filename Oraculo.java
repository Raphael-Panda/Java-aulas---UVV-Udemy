public class Oraculo {
    
    String nome;
    Guerreiro warrior;

    public Oraculo(String nomeOraculo, String nomeGuerreiro) {
        definirNome(nomeOraculo);
        this.warrior = new Guerreiro(nomeGuerreiro);
        this.warrior.sortearVidas();
        this.warrior.definirClasse();
    }
    
    
    //metodos oraculo
    void definirNome(String nome){
        this.nome = nome;
    }
    
    String prologoIntroducao(){
        String texto;
        InOut.MsgDeInformacao(
            "INTRODUCAO",
            texto = String.format(
            "Eu sou %s e você é %s um %s, voce tem %d vidas nesta aventura",
            this.nome, warrior.getNome(), warrior.getClasse(), warrior.getQtdVidas()
            )
        );
        return texto;
    };
    
    String prologoPerdedor(){
        
    }
    
    String prologoVencedor(){
        
    }
    
    boolean loadlevel1(){
        int secreto;
        secreto = (int) (Math.random() * (100 - 1 + 1) + 1);
    } 
    
    boolean loadlevel2(){
        
    }
    
    boolean decidirVidaExtra(String frase){
        
    }
      
    
}
