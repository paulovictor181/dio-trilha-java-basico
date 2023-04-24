import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da Agência: ");
        String agencia = sc.nextLine(); 
        System.out.println("Digite o número da Conta");
        int numeroConta = sc.nextInt();
        System.out.println("Digite o nome do proprietado da conta");
        sc.nextLine();
        String nomeCliete = sc.nextLine();
        System.out.println("Digite o saldo da sua conta");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", nomeCliete, agencia, numeroConta, saldo);

        sc.close();
    }
}
