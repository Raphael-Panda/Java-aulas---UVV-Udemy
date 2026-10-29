public static void imprimePar(int num) throws MinhaExcecaoImpar{
    if(num % 2 == 0){
        System.out.println("O numero é par");
    }
    else{
        throw new MinhaExcecaoImpar(num);
    }
}

void main(String[] args){
   
   try{
       imprimePar(2);
       imprimePar(3);
    
   } catch(MinhaExcecaoImpar e){
       System.out.println(e);
   }
   finally{
       System.out.println("Fim de codificacao realizado...");
   }
   
}
