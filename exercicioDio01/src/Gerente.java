public class Gerente extends UsuarioBase implements ConsultorDeVendas {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }


    public void gerarRelatoriosFinanceiros() {
        System.out.println("Relatorios financeiros realizado com sucesso!");

    }

    @Override
    public void consultarVendas() {
        System.out.println("Consultando Vendas");

    }
}
