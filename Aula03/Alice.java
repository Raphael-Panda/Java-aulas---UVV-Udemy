/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolab11
 */
public class Alice {
    // propriedades
    float tamanho;
    String CorCabelo;
    int posX, posY, posZ;
    
  
    public Alice(String CorCabelo, int posY) {
        this.CorCabelo = CorCabelo;
        this.posY = posY;
    }
    
    
    // comportamentos
    boolean mover(){
        System.out.println("Alice se moveu");
        return true;
    }
    
    void turn(){
        System.out.println("Alice virou");
    }
    
    void say(String texto){
        System.out.println("Alice disse " + texto);
    }
    
}

