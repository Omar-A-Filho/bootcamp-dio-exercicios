public class Notificacao {

    private String canal = "E-mail";
    private String mensagemPadrao = "Bem-vindo(a) à equipe! Seus acessos foram liberados com sucesso.";

    public void enviar (DadosFuncionario dadosFuncionario) {
        System.out.println("Enviando via " + canal + " para " + dadosFuncionario.getEmail());
        System.out.println("Olá " + dadosFuncionario.getNome() + "! " + mensagemPadrao );

    }

}
