public class Operadores_Unarios {
    public static void main(String[] args) {
        //Testes com operadores unarios, reduzindo um comando if

        int a = 5;
        int b = 5;
        boolean resultado;

        resultado = (a==b);
        System.out.println(resultado);

        //Outra forma de uso:
        String mostrar = a==b ? "verdadeiro" : "falso";
        System.out.println(mostrar);

    }
}
