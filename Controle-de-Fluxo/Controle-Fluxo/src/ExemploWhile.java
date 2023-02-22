public class ExemploWhile {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 300){
            System.out.println(contador);
            if (contador == 20){
                System.out.println("CHEGAMOS NO VINTE");
            }
            if (contador == 40){
                System.out.println("CHEGAMOS NO QUARENTA");
            }
            if (contador == 80){
                System.out.println("CHEGAMOS NO OITENTA");
            }
            contador = contador + 1;
        }
    }
}
