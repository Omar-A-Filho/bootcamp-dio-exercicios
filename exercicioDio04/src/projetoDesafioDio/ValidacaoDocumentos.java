package projetoDesafioDio;

public class ValidacaoDocumentos {

    private String regra = "";

    public boolean validar(DadosFuncionario dadosFuncionario) {
        if (dadosFuncionario.getNome() == null || dadosFuncionario.getNome().trim().isEmpty() ||
                dadosFuncionario.getEmail() == null || dadosFuncionario.getEmail().trim().isEmpty() ||
                dadosFuncionario.getCpf() == null || dadosFuncionario.getCpf().trim().isEmpty() ||
                dadosFuncionario.getCargo() == null || dadosFuncionario.getCargo().trim().isEmpty()) {

            regra = "ATENÇÃO: Existe algum campo nulo ou vazio. É obrigatório preencher todos os campos!";
            return false;
        }

        regra = "";
        return true;
    }

    public String obterErros() {
        return regra;
    }
}




