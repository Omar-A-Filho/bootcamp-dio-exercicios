package projetoDesafioDio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();
        System.out.println("Digite seu Cargo: ");
        String cargo = scanner.nextLine();

        DadosFuncionario dadosFuncionario = new DadosFuncionario (nome, email, cpf, cargo);

        OnboardingFacade onboardingFacade = new OnboardingFacade();
        onboardingFacade.realizarOnboarding(dadosFuncionario);



    }
}
