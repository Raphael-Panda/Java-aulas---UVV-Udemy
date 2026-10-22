void main(){
    System.out.println("== SerVivo ==");
    SerVivo sv = new SerVivo();
    sv.tamanho = 10;
    sv.nascer();
    sv.crescer();
    sv.morrer();
    
    // ANIMAL É UMA CLASSE ABSTRATA E NÃO PODE SER INSTANICIADA
//    System.out.println("== Animal ==");
//    Animal an = new Animal();
//    an.nascer();
//    an.crescer();    
//    an.mover();
//    an.respirar();
    
    System.out.println("== Mamifero ==");    
    Mamifero ma = new Mamifero();
    ma.nascer();
    ma.mover();    
    ma.respirar();
    
    System.out.println("== Peixe ==");        
    Peixe px = new Peixe();
    px.nascer();
    px.mover();
    px.respirar();
    px.falar();
    px.tratar;
    
    System.out.println("== Ave ==");        
    Ave av = new Ave();
    av.nascer();
    av.mover();
    av.respirar();
    av.falar();
    av.tratar();
    
}
