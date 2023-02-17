import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldoConta;
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá! Por favor digite sua conta");
        numeroConta = scan.nextInt();
        System.out.println("Agora digite o número da agência com dígito");
        numeroAgencia = scan.next();
        System.out.println("Seu nome por favor");
        nomeCliente = scan.next();
        System.out.println("O saldo agora");
        saldoConta = scan.nextDouble();

        System.out.println("Obrigado, sr.(a) " + nomeCliente +  ". O numero de sua conta é " + numeroConta);
        System.out.println("O Numero da Agencia é " + numeroAgencia);
        System.out.println("Seu saldo disponivel é de R$"+saldoConta);
        System.out.println("Nos vemos em breve!");
    
        


    }
}
