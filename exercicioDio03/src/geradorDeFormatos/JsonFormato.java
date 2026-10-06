package geradorDeFormatos;

import java.util.List;

public class JsonFormato implements FormatoSaida {


    @Override
    public String traduzir(List<Campo> campos) {
        String json = "{";
        for (Campo c : campos) {
            json = json + "\"" + c.getNome() + "\":\"" + c.getValores().get(0) + "\",";
        }
        json = json + "}";
        return json;
    }

}