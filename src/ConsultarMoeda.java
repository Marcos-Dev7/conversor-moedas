import com.google.gson.Gson;
import io.github.cdimascio.dotenv.Dotenv;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoeda {
    public RespostaApi consultarTaxa(String base, String target, double valor){
        Dotenv dotenv = Dotenv.load();
        String apiKey = dotenv.get("EXCHANGE_API_KEY");

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/"+ apiKey+ "/pair/"+ base +"/"+ target + "/" + valor);

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(endereco)
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), RespostaApi.class);
        }catch (Exception e){
            throw new RuntimeException("Erro ao buscar cotação");
        }
    }
}
