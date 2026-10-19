void main(){
    
    System.out.println("== Animal ==");
    Animal an = new Animal();
    an.comer();
    an.barulho();
    an.dormir();
    
    System.out.println("== Hipopótamo ==");
    Hipo hip = new Hipo();
    hip.comer();
    hip.barulho();
    hip.dormir();
    
    System.out.println("== Cachorro ==");
    Cachorro chorro = new Cachorro();
    chorro.comer();
    chorro.barulho();
    chorro.dormir();
    
    System.out.println("== Lobo ==");
    Lobo lo = new Lobo();
    lo.comer();
    lo.barulho();
    lo.dormir();
    
}
