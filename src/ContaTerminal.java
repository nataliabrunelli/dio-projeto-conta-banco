import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o seu Número de Usuário:");
    int numeroUsuario = scanner.nextInt();

    System.out.println("Agora digite o número da sua Agência:");
    String numeroAgencia = scanner.next();

    System.out.println("Escreva, por favor, seu Nome:");
    String nomeCliente = scanner.next();

    System.out.println("Agora digite o seu Saldo atual:");
    double saldo = scanner.nextDouble();

    System.out.println("Olá, " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é: " + numeroAgencia + ", conta: " + numeroUsuario + " e seu saldo de R$ " + saldo + " já está disponível para saque. Obrigada!2245");
  }
}
