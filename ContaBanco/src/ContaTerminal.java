import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agencyNumber = scanner.next();

        System.out.printf("Por favor, digite o número da sua conta na agência %s: ", agencyNumber);
        var accountNumber = scanner.nextInt();

        System.out.print("Por favor, digite seu nome: ");
        String clientName = scanner.next();

        var bankBalance = 237.48;

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", clientName,agencyNumber,accountNumber,bankBalance);
    }
}
