import java.util.Locale;
import  java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        System.out.println("Digite o número da conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Digite a agência:");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);
    }
}
