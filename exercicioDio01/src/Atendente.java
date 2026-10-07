public class Atendente extends UsuarioBase {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorEmCaixa = 0;
    }

    public void receberPagamentos(double valorPagamento) {
        this.valorEmCaixa += valorPagamento;
        System.out.println("Pagamento recebido com sucesso!");
    }

    public void fecharCaixa() {
        System.out.println("Fechando Caixa com o valor atualizado de: " + this.valorEmCaixa);

    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
