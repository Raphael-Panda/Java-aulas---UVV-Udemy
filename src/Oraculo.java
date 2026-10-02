import java.util.ArrayList;

public class Oraculo {

    String nome;
    Guerreiro warrior;

    // dados para o relatório final
    ArrayList<Integer> palpitesLevel1 = new ArrayList<>();
    int vidasPerdidasLevel1 = 0;
    String respostaCorretaLevel2;
    int vidasPerdidasLevel2 = 0;
    int vidasPerdidasLevel3 = 0;

    public Oraculo(String nomeOraculo, String nomeGuerreiro) {
        definirNome(nomeOraculo);
        this.warrior = new Guerreiro(nomeGuerreiro);
        this.warrior.sortearVidas();
        this.warrior.definirClasse();
    }

    void definirNome(String nome){
        this.nome = nome;
    }

    String prologoIntroducao(){
        String texto = String.format(
            "Eu sou %s e você é %s, um %s. Você tem %d vidas nesta aventura!",
            this.nome, warrior.getNome(), warrior.getClasse(), warrior.getQtdVidas()
        );
        InOut.MsgDeInformacao("INTRODUCAO", texto);
        return texto;
    }

    String prologoVencedor(){
        String texto = String.format(
            "%s, você venceu! O %s %s provou seu valor, sobrevivendo com %d vida(s)!",
            warrior.getNome(), warrior.getClasse(), warrior.getNome(), warrior.getQtdVidas()
        );
        InOut.MsgDeInformacao("VITORIA", texto);
        return texto;
    }

    String prologoPerdedor(){
        String texto = String.format(
            "%s diz: sua jornada termina aqui, %s. O %s caiu em batalha...",
            this.nome, warrior.getNome(), warrior.getClasse()
        );
        InOut.MsgDeInformacao("DERROTA", texto);
        return texto;
    }

    boolean loadLevel1(){
        int secreto = (int) (Math.random() * (100 - 1 + 1) + 1);
        int palpite = 0;
        boolean acertou = false;

        InOut.MsgDeInformacao(
            "LEVEL 1 - ADIVINHE UM NUMERO",
            "Chute um numero de 1 a 100. Cada erro custa 1 vida!"
        );

        while(!acertou && warrior.estaVivo()){
            palpite = InOut.leInt("Dê um palpite (1 a 100): ");
            palpitesLevel1.add(palpite);

            if(palpite == secreto){
                acertou = true;
                InOut.MsgDeInformacao(
                    "PARABENS",
                    String.format("Você acertou! Restaram %d vida(s).", warrior.getQtdVidas())
                );
            } else {
                if(palpite < secreto){
                    InOut.MsgDeInformacao("Dica", "O segredo é MAIOR que seu palpite.");
                } else {
                    InOut.MsgDeInformacao("Dica", "O segredo é MENOR que seu palpite.");
                }
                warrior.perderVida();
                vidasPerdidasLevel1++;
            }
        }

        return warrior.estaVivo();
    }

    boolean loadLevel2(){
        String[] charadas = {
            "Tem cabeça, tem dente, mas não é bicho nem gente. O que é, o que é?",
            "Quanto mais se tira, maior ela fica. O que é, o que é?",
            "Não tem vida, mas pode morrer. O que é, o que é?"
        };
        String[] respostas = { "alho", "buraco", "pilha" };

        int indice = (int) (Math.random() * charadas.length);
        respostaCorretaLevel2 = respostas[indice];
        boolean acertou = false;

        InOut.MsgDeInformacao("LEVEL 2 - ADIVINHACAO", charadas[indice]);

        while(!acertou && warrior.estaVivo()){
            String resposta = InOut.leString("Sua resposta: ");

            if(resposta.trim().equalsIgnoreCase(respostaCorretaLevel2)){
                acertou = true;
                InOut.MsgDeInformacao(
                    "PARABENS",
                    String.format("Resposta correta! Restaram %d vida(s).", warrior.getQtdVidas())
                );
            } else {
                InOut.MsgDeInformacao("Errado", "Resposta incorreta, tente novamente!");
                warrior.perderVida();
                vidasPerdidasLevel2++;
            }
        }

        return warrior.estaVivo();
    }

    boolean loadLevel3(){
        boolean acertou = false;

        InOut.MsgDeInformacao(
            "LEVEL 3 - DADO DA SORTE",
            "Um dado de 6 lados vai ser lançado. Adivinhe o número que vai cair (1 a 6)!"
        );

        while(!acertou && warrior.estaVivo()){
            int palpite = InOut.leInt("Em qual número o dado vai cair (1 a 6)? ");
            int resultadoDado = (int) (Math.random() * (6 - 1 + 1) + 1);

            InOut.MsgDeInformacao("Resultado", String.format("O dado caiu no número %d!", resultadoDado));

            if(palpite == resultadoDado){
                acertou = true;
                InOut.MsgDeInformacao(
                    "PARABENS",
                    String.format("Você acertou! Restaram %d vida(s).", warrior.getQtdVidas())
                );
            } else {
                InOut.MsgDeInformacao("Que pena", "Você errou. O dado vai rolar de novo!");
                warrior.perderVida();
                vidasPerdidasLevel3++;
            }
        }

        return warrior.estaVivo();
    }

    boolean decidirVidaExtra(String frase){
        String[] palavras = frase.trim().split("\\s+");

        if(palavras.length > 5){
            warrior.addVidaExtra();
            InOut.MsgDeInformacao("Misericórdia concedida", "O Oráculo teve piedade e concedeu mais uma vida!");
            return true;
        } else {
            InOut.MsgDeInformacao("Misericórdia negada", "O Oráculo não se comoveu com seu pedido...");
            return false;
        }
    }

    boolean tentarReviver(){
        String pedido = warrior.vidaExtra();
        return decidirVidaExtra(pedido);
    }

    String RelatorioFimGame(){
        String texto = String.format(
            "Guerreiro: %s (%s)\nVidas restantes: %d\n" +
            "Vidas perdidas no Level 1: %d | Palpites: %s\n" +
            "Vidas perdidas no Level 2: %d | Resposta correta: %s\n" +
            "Vidas perdidas no Level 3: %d",
            warrior.getNome(), warrior.getClasse(), warrior.getQtdVidas(),
            vidasPerdidasLevel1, palpitesLevel1.toString(),
            vidasPerdidasLevel2, respostaCorretaLevel2,
            vidasPerdidasLevel3
        );
        InOut.MsgDeInformacao("RELATORIO FINAL", texto);
        return texto;
    }
}