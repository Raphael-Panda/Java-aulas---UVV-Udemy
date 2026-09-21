void main(){
    
    //teste para item
    Item marteloCelestial = new Item(1, "Martelo", false); 
    Bolsa bolsa = new Bolsa();
    
    marteloCelestial.imprimirDados();
    
    bolsa.addItem(marteloCelestial);
    
    ArrayList<Item> resultado = bolsa.buscaItem("Martelo");
    System.out.println(resultado.size());
}
