void main(){
    
    AgendaTelefonica ag = new AgendaTelefonica();
    
    Contato c01 = new Contato("Vinicius", "123", "v@uvv", 28);
    Contato c02 = new Contato("Rosalen", "456", "v@uvv", 30);
    Contato c03 = new Contato("José", "789", "v@uvv", 18);
    
    // como o indexador é o nome por isso tem o .nome
    ag.inserir(c01.nome, c01);
    ag.inserir(c02.nome, c02);
    ag.inserir(c03.nome, c03);

    System.out.println("Qual o telefone do vinicius?");
    System.out.println(ag.Buscar("Vinicius").numero);
    
    System.out.println("Quantos contatos estão armazenados?");
    System.out.println(ag.tamanho());
    
    System.out.println("Qual o email do Vinicius");
    System.out.println(ag.Buscar("Vinicius").email);
            
            
    
    
    
}
