import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite o número de sua Agência:");
        int numeroAgencia = scanner.nextInt();
        
        System.out.println("Por favor digite o nome de sua Agência:");
        String nomeAgencia = scanner.next();

        System.out.println("Por favor digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor digite seu sobrenome:");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Por favor digite seu saldo:");
        Double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println(" ");
        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + 
        saldo + " ja está disponivel para saque." );
        
    }
}
