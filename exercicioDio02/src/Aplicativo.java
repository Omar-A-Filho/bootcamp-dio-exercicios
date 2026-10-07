import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva aqui o texto que deseja enviar:");
        String mensagemGeral = sc.nextLine();

        System.out.println("\nSelecione o canal que deseja enviar a mensagem:");
        System.out.println("1 - SMS");
        System.out.println("2 - E-mail");
        System.out.println("3 - WhatsApp");
        System.out.println("4 - Redes Sociais");
        System.out.print("Número: ");

        int numeroCanal = sc.nextInt();
        ServicoMensagem canal;

        switch (numeroCanal) {
            case 1:
                canal = msg -> System.out.println("Enviando via SMS: " + msg);
                canal.enviarMensagem(mensagemGeral);
                break;
            case 2:
                canal = msg -> System.out.println("Enviando via E-mail: " + msg);
                canal.enviarMensagem(mensagemGeral);
                break;
            case 3:
                canal = msg -> System.out.println("Enviando via WhatsApp: " + msg);
                canal.enviarMensagem(mensagemGeral);
                break;
            case 4:
                canal = msg -> System.out.println("Enviando via Redes Sociais: " + msg);
                canal.enviarMensagem(mensagemGeral);
                break;
            default:
                System.out.println("Canal inexistente!");
        }
    }


}

