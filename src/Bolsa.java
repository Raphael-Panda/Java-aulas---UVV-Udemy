import java.util.ArrayList;

public class Bolsa {
    ArrayList<Item> BolsaItem = new ArrayList<>();

    void adicionarItem(Item item){
        BolsaItem.add(item);
    }

    ArrayList<Item> buscaItem(String nomeItem){
        ArrayList<Item> itemRep = new ArrayList<>();
        BolsaItem.forEach((item) -> {
            // comparar duas strings, ignora maiuscula e minuscula
            if(item.getTipoItem().equalsIgnoreCase(nomeItem)){
                itemRep.add(item);
            }
        });
        return itemRep;
    }

    void equipar(String nomeItem){
        ArrayList<Item> resultado = buscaItem(nomeItem);

        if(resultado.size() == 0){
            InOut.MsgDeInformacao(
                "Resultado da Busca",
                "Item não Encontrado na Bolsa"
            );
        }
        else if(resultado.size() == 1){
            resultado.get(0).setEquipado(true);
        }
        else{
            resultado.forEach((item) -> {
                item.imprimirDados();
            });

            int idEscolhido = InOut.leInt("Digite o ID do item que deseja equipar: ");

            resultado.forEach((item) -> {
                if(idEscolhido == item.getIdItem()){
                    item.setEquipado(true);
                }
            });
        }
    }

    void desequipar(String nomeItem){
        ArrayList<Item> resultado = buscaItem(nomeItem);

        if(resultado.size() == 0){
            InOut.MsgDeInformacao(
                "Resultado da Busca",
                "Item não Encontrado na Bolsa"
            );
        }
        else if(resultado.size() == 1){
            resultado.get(0).setEquipado(false);
        }
        else{
            resultado.forEach((item) -> {
                item.imprimirDados();
            });

            int idEscolhido = InOut.leInt("Digite o ID do item que deseja desequipar: ");

            resultado.forEach((item) -> {
                if(idEscolhido == item.getIdItem()){
                    item.setEquipado(false);
                }
            });
        }
    }
}