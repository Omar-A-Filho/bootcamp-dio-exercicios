package projetoDesafioDio;

public class OnboardingFacade {

    private ValidacaoDocumentos documentoValidator;
    private CriacaoAcessoSistemas acessoSistemaService;
    private Notificacao notificacaoService;

    public OnboardingFacade() {
        this.documentoValidator = new ValidacaoDocumentos();
        this.acessoSistemaService = new CriacaoAcessoSistemas();
        this.notificacaoService = new Notificacao();
    }

    public void realizarOnboarding(DadosFuncionario dadosFuncionario) {

        System.out.println(" * * * * * * Realizando Onboarding * * * * * *");

        if (!documentoValidator.validar(dadosFuncionario)) {
            System.out.println(documentoValidator.obterErros());
            return;
        }
        acessoSistemaService.criarAcesso(dadosFuncionario);
        notificacaoService.enviar(dadosFuncionario);

    }
}