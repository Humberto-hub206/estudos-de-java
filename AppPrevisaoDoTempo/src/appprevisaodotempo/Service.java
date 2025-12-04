package appprevisaodotempo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class Service {
    // coloque aqui sua chave da API do OpenWeatherMap
    private static final String API_KEY = "0998255d6cfe5fe98c6d243a2195c03c"; 

    public ClimaDados getClima(String cidade) {
        try {
            String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" 
                    + cidade + "&appid=" + API_KEY + "&units=metric&lang=pt_br";
            
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // transforma o texto em JSON
            JSONObject json = new JSONObject(response.toString());

            // usa as chaves corretas do JSON
            String nomeCidade = json.getString("name"); // ✅ "name"
            JSONObject main = json.getJSONObject("main");
            double temperatura = main.getDouble("temp"); // ✅ "temp"
            double sensacaoTermica = main.getDouble("feels_like"); // ✅ "feels_like"
            int humidade = main.getInt("humidity"); // ✅ "humidity"
            String descricao = json.getJSONArray("weather").getJSONObject(0).getString("description"); // ✅ "description"

            return new ClimaDados(nomeCidade, temperatura, sensacaoTermica, humidade, descricao);

        } catch (Exception e) {
            System.out.println("❌ ERRO ao obter dados: " + e.getMessage());
            return null;
        }
    }
}
