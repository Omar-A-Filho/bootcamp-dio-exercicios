package geradorDeFormatos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Campo campoDados = new Campo("Omar", List.of("10"), TipoCampo.INTEIRO, false);
        List<Campo> campos = List.of(campoDados);
        FormatoSaida saida = new JsonFormato();
        saida.traduzir(campos);

        System.out.println(saida.traduzir(campos));

    }

}
