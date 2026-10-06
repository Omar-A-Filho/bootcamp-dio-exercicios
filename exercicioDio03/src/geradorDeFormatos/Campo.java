package geradorDeFormatos;

import java.util.List;

public class Campo {
    private String nome;
    private List <String> valores;
    private TipoCampo tipo;
    private boolean array;

    public Campo(String nome, List<String> valores, TipoCampo tipo, boolean array) {
        this.nome = nome;
        this.valores = valores;
        this.tipo = tipo;
        this.array = array;
    }
    public String getNome() {
        return nome;
    }

    public List<String> getValores() {
        return valores;
    }

    public TipoCampo getTipo() {
        return tipo;
    }

    public boolean isArray() {
        return array;
    }
}
