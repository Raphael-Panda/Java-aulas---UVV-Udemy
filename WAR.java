public static void main(String[] args) {
        String nomeGuerreiro = InOut.leString("Digite o nome do seu Guerreiro: ");
        Oraculo oraculo = new Oraculo("Mestre Oraculo", nomeGuerreiro);

        
        //Bolsa e Itens da bolsa
        Bolsa bolsa = new Bolsa();
        Item Espada = new Item(1, "Espada Longa", true);
        Item Armadura = new Item(2, "Armadura", true);
        Item ArcoFlecha = new Item(3, "Arco e Flecha", false);
        bolsa.adicionarItem(Espada);
        bolsa.adicionarItem(Armadura);
        bolsa.adicionarItem(ArcoFlecha);
        ArrayList<Item> Resultado = bolsa.buscaItem("Espada Longa");
        System.out.println("Resultado da bolsa: " + Resultado.size());
        Resultado.forEach((item) -> item.imprimirDados());
        
        
        oraculo.prologoIntroducao();

        boolean vivo = oraculo.loadLevel1();
        if(!vivo) vivo = oraculo.tentarReviver();

        if(vivo){
            vivo = oraculo.loadLevel2();
            if(!vivo) vivo = oraculo.tentarReviver();
        }

        if(vivo){
            vivo = oraculo.loadLevel3();
            if(!vivo) vivo = oraculo.tentarReviver();
        }

        if(vivo){
            oraculo.prologoVencedor();
        } else {
            oraculo.prologoPerdedor();
        }

        oraculo.RelatorioFimGame();
}