public class Item {
    
    int idItem;
    String tipoItem;
    boolean equipado;

    public Item(int idItem, String tipoItem, boolean equipado) {
        this.idItem = idItem;
        this.tipoItem = tipoItem;
        this.equipado = equipado;
    }
    
    // método público para permitir que outras classes consultem o ID do item 
    // sem precisar acessar o atributo diretamente
    public int getIdItem(){
        return this.idItem;
    }
    
    // método público para permitir que outras classes consultem o nome do item 
    // sem precisar acessar o atributo diretamente
    public String getTipoItem(){
        return this.tipoItem;
    }
    
    void imprimirDados(){
        InOut.MsgDeInformacao(
                "Dados dos Itens",
                String.format(
                "ID: %d, tipo: %s, está equipado? %b",
                idItem, tipoItem, equipado
                )
        );
    }
}
