public static void main(String[] args) {
        String nomeGuerreiro = InOut.leString("Digite o nome do seu Guerreiro: ");
        Oraculo oraculo = new Oraculo("Mestre Oraculo", nomeGuerreiro);

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