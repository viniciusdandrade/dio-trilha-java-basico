import java.util.Scanner;

public class ContaTerminal {
    private static final Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Por favor, digite o número da conta !");
        int numero = entrada.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = entrada.next();
        System.out.println("Por favor, digite o seu nome !");
        String nomeCliente = entrada.next();
        System.out.println("Por favor, digite o seu saldo !");
        double saldo = entrada.nextDouble();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+ saldo + " já está disponível para saque");
    }
}
