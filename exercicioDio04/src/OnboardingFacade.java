public class OnboardingFacade {

    private ValidacaoDocumentos documentoValidator;
    private CriacaoAcessoSistemas acessoSistemaService;
    private Notificacao notificacaoService;

    public OnboardingFacade(ValidacaoDocumentos documentoValidator, CriacaoAcessoSistemas acessoSistemaService, Notificacao notificacaoService) {
        this.documentoValidator = documentoValidator;
        this.acessoSistemaService = acessoSistemaService;
        this.notificacaoService = notificacaoService;
    }

    public void realizarOnboarding(DadosFuncionario dadosFuncionario) {

        System.out.println(" * * * * * * Realizando Onboarding * * * * * *");



    }
}