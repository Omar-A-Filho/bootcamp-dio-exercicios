package geradorDeFormatos;

import java.util.List;

public class YamlFormato implements FormatoSaida {

    @Override
    public String traduzir(List<Campo> campos) {
        String yaml = "";
        for (Campo c : campos) {
            yaml = yaml + c.getNome() + ": " + c.getValores().get(0) + "\n";
        }
        return yaml;
    }

}
