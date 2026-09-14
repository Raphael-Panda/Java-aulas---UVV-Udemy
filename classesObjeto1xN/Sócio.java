import java.util.ArrayList;
import java.util.List;

public class Sócio {
    
    String nome;
    
    //sócio pode ter varios dependentes, por isso temos uma lista
    private List<Dependente> listaDep = new ArrayList<>();
    
    public Sócio() {
    }

    public Sócio(String nome) {
        this.nome = nome;
    }
    
    public void addDependente(Dependente d){
        if(d.idade >= 18)
            listaDep.add(d);
    }

    public List<Dependente> getListaDep() {
        return listaDep;
    }
    
}
