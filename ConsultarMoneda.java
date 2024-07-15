import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {
    public Monedas buscarMoneda(String monedaBase, String monedaAConvertir){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/470badd76e1d4853212a29bc/pair/"+monedaBase +"/"+monedaAConvertir);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        }
        catch (Exception e){
            throw new RuntimeException("no encontrè la moneda");
        }
    }
}
