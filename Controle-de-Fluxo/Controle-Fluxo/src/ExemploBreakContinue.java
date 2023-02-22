public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int contador=0;contador <=100;contador++){
            if((contador/3)==10){break;}
            System.out.println(contador);
        }
        for (int contador=0;contador <=100;contador++){
            if((contador/3)==11){continue;}
            System.out.println(contador);
        }    
    }
}
