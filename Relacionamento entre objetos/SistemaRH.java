void main(){
     
    //objetos da classe endereço
    Endereço e1 = new Endereço();
    e1.rua = "mora na UVV";
    
    Endereço e2 = new Endereço();
    e2.rua = "mora em casa";
    
    Endereço e3 = new Endereço();
    e3.rua = "mora na rua";
    
    
    //objeto da classe empregado
    Empregado emp = new Empregado(123, "Raphael");
    
    //atribuir o "e" ao valor do endereço 1
    //criando a ponte entre o objeto empregado raphael e o objeto endereço 1
    emp.e = e1;
    
    System.out.println("Qual o nome do empregado? " + emp.nome);
    System.out.println("Onde o "+ emp.nome + " mora? " + emp.e.rua);
}
