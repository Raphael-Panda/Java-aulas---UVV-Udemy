void main(){
    
    int idade = 18;
    
    // alice vai receber tudo que a classe alice tem, da mesma forma que idade
    // recebe o tipo inteiro
    Alice anabelle = new Alice(); // anabelle virou uma boleba na memoria
    anabelle.CorCabelo = "Roxo";
    anabelle.posY = 10;
    anabelle.mover();
    anabelle.turn();
    anabelle.say("BUUUUUUUUUUUUU");
    anabelle.say("eitchaaaaaa");
    
    System.out.println("Qual a cor do cabelo da anabelle: " + anabelle.CorCabelo);
    
    
    // criando outro objeto(anabelle2) para a classe Alice
    // segunda boleba na memória
    
//    PRIMEIRA FORMA DE FAZER:
//    Alice anabelle2 = new Alice();
//    anabelle2.CorCabelo = "Amarelo";
//    anabelle2.posY = 20;

//    SEGUNDA FORMA DE FAZER
//    ja cria a anabelle2 e ja passa os valores
      Alice anabelle2 = new Alice("Amarelo", 20);
      System.out.println(anabelle2.CorCabelo);
    
    
}
