import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner captura = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero1 = captura.nextInt();
        System.out.println(numero1);
        String numero2 = "2";
        System.out.println(numero1+numero2);
    }
}
