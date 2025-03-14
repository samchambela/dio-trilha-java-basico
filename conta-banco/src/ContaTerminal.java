import javax.crypto.spec.PSource;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela classe Scanner os valores digitados no terminal
        //TODO: Exibir a mensagem final (da conta criada)

        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Para criar sua conta, por favor digite seu nome completo e pressione ENTER:");
        nomeCliente = scanner.next();

        System.out.println("Por favor, informe o nº da agência com o dígito (no formato 000-0) e pressione ENTER:");
        agencia = scanner.next();

        System.out.println("Por favor, insira o número da conta (no formato 0000) e pressione ENTER:");
        numero = scanner.nextInt();

        System.out.println("Parabéns, sua conta foi criada com sucesso!");
        System.out.println("Para finalizar, informe o seu depósito inicial (no formato 0000.00) e pressione ENTER:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
        System.out.println("Olá, seu saldo de R$" + saldo + " já está disponível para saque!");

    }
}