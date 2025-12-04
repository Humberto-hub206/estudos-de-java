package Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import Model.Frase;

public class FraseService {
    private static final String API_URL = "https://zenquotes.io/api/random";
    public Frase obterFraseAleatoria(){
        try {
            // cria uma conexão HTTP
            URL url = new URL(API_URL);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("GET");
            
            //lê a resposta da API
            BufferedReader reader = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuilder resposta = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null){
                resposta.append(linha);
            }
            reader.close();
            
            // a API retorna um array JSON com 1 elemento
            Gson gson = new Gson();
            Frase[] frases = gson.fromJson(resposta.toString(), Frase[].class);
            
            return frases [0]; // retorna a primeira (unica) frase do array
            
        } catch (Exception e) {
            System.out.println("Erro ao obter frase: " + e.getMessage());
            return null;
        }
    }
}
