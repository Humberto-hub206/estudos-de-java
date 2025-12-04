package Model;

public class Frase {
    private String q; //texto da frase
    private String a; //autor da frase
    
    public String getQ(){
        return q;
    }
    public String getA(){
        return a;
    }
    
    @Override
    public String toString(){
        return "\"" + q + "\" - " + a;
    }
}
