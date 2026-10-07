import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("------------- BEM-VINDO AO SISTEMA OAF --------------");
        System.out.println();

        System.out.println("1. Gerente | 2. Vendedor | 3. Atendente");
        System.out.print("Escolha uma número acima: ");
        int area = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Digite a Senha: ");
        String senha = scanner.nextLine();

        switch (area) {
            case 1 -> {
                Gerente gerente = new Gerente(nome, email, senha);
                System.out.println("\nOlá " + gerente.getNome() + ", selecione uma operação:");
                System.out.println("1. Gerar Relatório Financeiro | 2. Consultar Vendas | 3. Sair");
                System.out.print("Opção: ");
                int seletor = scanner.nextInt();

                if (seletor == 1) gerente.gerarRelatoriosFinanceiros();
                else if (seletor == 2) gerente.consultarVendas();
            }
            case 2 -> {
                Vendedor vendedor = new Vendedor(nome, email, senha);
                System.out.println("\nOlá " + vendedor.getNome() + ", selecione uma operação:");
                System.out.println("1. Realizar Venda | 2. Consultar Vendas | 3. Sair");
                System.out.print("Opção: ");
                int seletor = scanner.nextInt();

                if (seletor == 1) vendedor.realizarVenda();
                else if (seletor == 2) vendedor.consultarVendas();
            }
            case 3 -> {
                Atendente atendente = new Atendente(nome, email, senha);
                System.out.println("\nOlá " + atendente.getNome() + ", selecione uma operação:");
                System.out.println("1. Receber Pagamento | 2. Fechar Caixa | 3. Sair");
                System.out.print("Opção: ");
                int seletor = scanner.nextInt();

                if (seletor == 1) {
                    System.out.print("Digite o valor: R$ ");
                    atendente.receberPagamentos(scanner.nextDouble());
                } else if (seletor == 2) {
                    atendente.fecharCaixa();
                }
            }
            default -> System.out.println("Área inválida tente novamente!");
        }

        System.out.println("\n Agradecemos seu acesso e até logo!");
        scanner.close();
    }
}