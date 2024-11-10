import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoDeTaxaDeCambio {

    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/";
    private static final String API_KEY = "3f7f75d39274914213685089";

    private final Gson gson;

    public ServicoDeTaxaDeCambio() {
        this.gson = new Gson();
    }

    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) throws Exception {
        String urlStr = API_URL + moedaOrigem;
        URL url = new URL(urlStr);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int codigoResposta = conn.getResponseCode();
        if (codigoResposta != 200) {
            throw new RuntimeException("Erro na conexão com a API: Código " + codigoResposta);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder resposta = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            resposta.append(inputLine);
        }
        in.close();

        JsonObject jsonResponse = gson.fromJson(resposta.toString(), JsonObject.class);
        JsonObject taxas = jsonResponse.getAsJsonObject("rates");

        return taxas.get(moedaDestino).getAsDouble();
    }
}
