void main(){
    
    Exercito e = new Exercito();
    Marinha ma = new Marinha();
    Aeronáutica ae = new Aeronáutica();
    Treinamento tr = new Treinamento();
    
    tr.treinar(ma);
    
    e.operacao();
    ma.operacao();
    ae.operacao();
}
