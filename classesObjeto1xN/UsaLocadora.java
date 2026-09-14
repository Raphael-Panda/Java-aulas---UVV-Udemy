void main(){
    Sócio s01 = new Sócio("Vinicius");
    
    Dependente d01 = new Dependente();
    d01.nome = "Maria";
    d01.idade = 18;
    
    Dependente d02 = new Dependente("Rosalen");
    d02.idade = 15;
    
    Dependente d03 = new Dependente("Joao");
    d03.idade = 20;

    
    //s01.listaDep.add(d01);  nessa linha de código esta sem regra e sem proteção
    // associar os dependentes ao sócios e o sócio aos dependentes
    s01.addDependente(d01);
    d01.s = s01;
    s01.addDependente(d03);
    d03.s = s01;
    
    
    System.out.println("Quais são os dependentes de vinicius?");
    for(Dependente d: s01.getListaDep()){
        System.out.println(d.nome);
    }
    
    System.out.println("Quem eh o sócio de Maria?");
    System.out.println(d01.s.nome);
    
}
