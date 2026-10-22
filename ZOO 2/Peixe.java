public class Peixe extends Animal implements IPet{
    void respirar(){
        System.out.println("Peixe: respirar() - AGUA");
    }
    
     void falar(){
        System.out.println("Ave: falar() - GLUP GLUP");
    }
     
     public void tratar(){
         System.out.println("Peixe: trata() - DAR BANHO");
     }
}
