import java.util.HashMap;
import java.util.Map;


public class AgendaTelefonica {
    // a primeira string é a chave e a segunda é o valor
    // a chave é onde o valor vai ficar salvo na memoria
    Map<String, Contato> colecao;
    
    public AgendaTelefonica(){
        colecao = new HashMap<>();
    }
    
    
    void inserir(String nome, Contato c){
        // Map
        colecao.put(nome, c);
        
        // com List seria
        //colecao.add(numero); 
    }
    
    Contato Buscar(String nome){
        return colecao.get(nome);
    }
    
    void remover(String nome){
        colecao.remove(nome);
    }
    
    int tamanho(){
        return colecao.size();
    }
    
    
    
}
