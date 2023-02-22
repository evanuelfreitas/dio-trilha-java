public class ExemploDoWhile {
    public static void main(String[] args) {
        int chamando = 0;
        do {
            System.out.println(chamando);
            chamando = chamando + 1;
        } while (chamando <= 20);
        System.out.println(chamando);
    }
}
