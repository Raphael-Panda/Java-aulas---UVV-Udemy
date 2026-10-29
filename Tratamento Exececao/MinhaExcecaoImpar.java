public class MinhaExcecaoImpar extends Exception{
    int x;

    public MinhaExcecaoImpar(String message) {
        super(message);
    }
    
    
    public MinhaExcecaoImpar(){
    }

    public MinhaExcecaoImpar(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MinhaExcecaoImpar{" + "x=" + x + '}';
    }
    
    
}
