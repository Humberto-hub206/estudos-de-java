package appprevisaodotempo;

public class ClimaDados {
    private String nomeCidade;
    private double temperatura;
    private double sensacaoTermica;
    private int humidade;
    private String descricao;
    
    public ClimaDados(String nomeCidade, double temperatura, double sensacaoTermica, int humidade, String descricao){
        this.nomeCidade = nomeCidade;
        this.temperatura = temperatura;
        this.sensacaoTermica = sensacaoTermica;
        this.humidade = humidade;
        this.descricao = descricao;   
    }

    public String getNomeCidade(){ return nomeCidade; }
    public double getTemperatura(){ return temperatura; }
    public double getSensacaoTermica(){ return sensacaoTermica; }
    public int getHumidade(){ return humidade; }
    public String getDescricao(){ return descricao; }

    @Override
    public String toString() {
        return "\n - Cidade: " + nomeCidade +
               "\n - Temperatura: " + temperatura + "°C" +
               "\n - Sensacao termica: " + sensacaoTermica + "°C" +
               "\n - Umidade: " + humidade + "%" +
               "\n -️ Clima: " + descricao;
    }
}