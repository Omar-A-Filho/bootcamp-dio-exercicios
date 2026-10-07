public class Vendedor extends UsuarioBase implements ConsultorDeVendas {

    private int quantidadeDeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeDeVendas = 0;
    }

    public void realizarVenda() {
        this.quantidadeDeVendas++;
        System.out.println("Venda realizada com sucesso!");
    }

    @Override
    public void consultarVendas() {
        System.out.println("Número de Vendas: " + this.quantidadeDeVendas);
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
