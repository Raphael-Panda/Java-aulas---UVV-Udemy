import java.util.ArrayList;

public class Bolsa {
        
    ArrayList<Item> BolsaItem = new ArrayList<>();

    
    
    // REGRA DE NEGOCIO: um item só pode ser equipado se ele estiver na bolsa
    // conferir se o item está na bolsa
    void equipar(String nomeItem){
        ArrayList<Item> resultado = buscaItem(nomeItem);
        
        if(resultado.size() == 0){
            InOut.MsgDeInformacao(
            "Resultado da Busca",
             String.format(
             "Item não Encontrado na Bolsa")
            );
        }
        else(resultado.size() == 1){
            resultado.get(0);
        }
        else{
                
        }
    }
    
    //REGRA DE NEGOCIO: um item só pode ser desequipado se ele estiver equipado
    // conferir se o item está equipado
    void desequipar(){    
    }
    
    // metodo para poder adicionar um item na bolsa
    void addItem(Item item){
        BolsaItem.add(item);
    }
    
    // metodo para buscar itens e se houver itens repetidos, perguntar ao jogador
    // qual deseja equipar
    ArrayList<Item> buscaItem(String nomeItem){
        // cria uma lista local vazia para adicionar os itens repetidos
        // nasce e morre a cada chamada
        ArrayList<Item> itemRep = new ArrayList<>();
        // Percorre a lista principal de itens da bolsa, para cada elemento
        // repetido a variavel 'itens' recebe uma referencia e armazena essa
        // referencia na lista local
        BolsaItem.forEach((itens)->{
           // pega o tipo/nome do item atual e compara com o parametro recebido
           // ignorando maiuscula e minuscula
           if(itens.getTipoItem().equalsIgnoreCase(nomeItem)){
               // se bater, guarda o item lista local
               itemRep.add(itens);
           }
        });
        // após percorrer toda a bolsa retorna a lista sem itens, com 1 items 
        // ou com varios
        return itemRep;
    }
    
}
