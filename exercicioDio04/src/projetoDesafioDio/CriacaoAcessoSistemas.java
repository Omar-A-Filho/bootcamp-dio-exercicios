package projetoDesafioDio;

public class CriacaoAcessoSistemas {

    private String sistema;

    public CriacaoAcessoSistemas() {

        sistema = ("SCI - Sistema Corporativo Integrado");
    }

    public void criarAcesso(DadosFuncionario dados) {
        System.out.println("Criando acesso do " + sistema + " para " + dados.getNome()
                + " do Cargo de " + dados.getCargo());
    }

    public String gerarCredenciais() {
        return "Usuario: admin - Senha: 1234 ";
    }
}