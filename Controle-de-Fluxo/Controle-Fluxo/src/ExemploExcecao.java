public class ExemploExcecao {
        public static void main(String[] args) {
            //exemplo retirado de w3schools
          /*try {
            int[] myNumbers = {1,2,3,4,5,6,7,8,9,10,11};
            System.out.println(myNumbers[0]);
          } catch (Exception e) {
            System.out.println("Something went wrong.");
          } finally {
            System.out.println("The 'try catch' is finished.");
          }
           */
           //lançamento de exceção com throw
           
           int nota1,nota2,resultado;

           nota1 = 100;
           nota2 = 80;
           
           if(nota1>90){
            throw new IllegalArgumentException("Nota recebida maior que o esperado, verificar");
           }
           resultado = (nota1+nota2)/2;
           System.out.println(resultado);

        }
      }
