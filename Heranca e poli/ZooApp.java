void main(){
    System.out.println("== SerVivo ==");
    SerVivo sv = new SerVivo();
    sv.tamanho = 10;
    sv.nascer();
    sv.crescer();
    sv.morrer();
    
 
    System.out.println("== Animal ==");
    Animal an = new Animal();
    an.nascer();
    an.crescer();
    an.morrer();
    an.mover();
    an.respirar();
    
    
    System.out.println("== Mamifero ==");
    Mamifero ma = new Mamifero();
    ma.nascer();
    ma.crescer();
    ma.mover();
    ma.respirar();
    ma.morrer();
    
    
    System.out.println("== Peixe ==");
    Peixe px = new Peixe();
    px.nascer();
    px.mover();
    px.respirar();
    
}
