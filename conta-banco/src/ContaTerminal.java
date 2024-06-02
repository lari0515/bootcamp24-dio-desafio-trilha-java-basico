import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------- DADOS PESSOAIS -----------\n");
        
        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        System.out.println();
        System.out.println("----------- INFORMAÇÃOES BANCÁRIAS -----------\n");
        System.out.println(informaçõesBancarias(nomeCliente, agencia, numero, saldo));

        System.out.println();

        scanner.close();
    }

    public static String informaçõesBancarias(String nome, String agencia, int numero, double saldo){
        return "Olá ".concat(nome).concat(", obrigado por criar uma conta em nosso banco, \nsua agência é ").concat(agencia).concat(", conta ") + numero +" e seu saldo R$" + saldo +" \njá está disponível para saque.";
    }
}
