import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número da conta: ");
        int numero = input.nextInt();
        input.nextLine();

        System.out.println("Insira o número da agência: ");
        String agencia = input.nextLine();

        System.out.println("Insira o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Insira o saldo: ");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
        nomeCliente, agencia, numero, saldo);
    }
}