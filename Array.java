void main(){
    
    int idade;
    Endereco end;
    int[] listaNotasRaiz; //array raiz
    
    
//    for(int i; i < 10, i++){
//        listaNotaRaiz[0] = 10;
//    }


    List<String> pautaAutoNivel;  //array alto nivel
    
    pautaAutoNivel = new ArrayList<>();  
    pautaAutoNivel.add("Raphael");
    pautaAutoNivel.add("Vinicius");
    pautaAutoNivel.add("Rosalen");
    
    
    System.out.println("------ Primeira forma ------");
    // forma raiz de fazer
    for(int i = 0; i < pautaAutoNivel.size(); i++){
        System.out.println(pautaAutoNivel.get(i));
    }
    
    
    
    System.out.println("------ Segunda forma ------");
    
    // item é o nome da variavel que ta sendo criada dentro do for, escopo local
    // para retornar os dados do array
    for(String item: pautaAutoNivel){
        System.out.println(item);
    }
    
    
    System.out.println("------ Terceira forma ------");
    // O forEach faz o trabalho do loop
    // E o "e" faz o mesmo trabalho de item na segunda forma
    pautaAutoNivel.forEach((e)-> {
        System.out.println(e);
    });
    
    
    
    //     começo do exer de agenda telefonica
    //     Map<String, String> Agenda = HashMap <>();

}
