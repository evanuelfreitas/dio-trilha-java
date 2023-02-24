import java.util.Scanner;
public class ResultadoEscolar {
        public static void main(String[] args) {
        
        Scanner scanNota = new Scanner (System.in);
        System.out.println("Por favor digite a nota do aluno");
        double nota = scanNota.nextDouble();
        
        /* if (nota>=7){
        
           System.out.println("Aprovado");
        } 
            else if (nota>=5 && nota<7){
            System.out.println("Prova de recuperação");
            }
            else {
            System.out.println("Reprovado");
        }

        */ 
        //Mesmo propósito do if, mas utilizando operador ternário

        String resultado = nota >= 7 ? "Aprovado": nota >=5 && nota< 7 ? "Recuperação":"Reprovado";
        System.out.println(resultado);
        scanNota.close();
    }
}
