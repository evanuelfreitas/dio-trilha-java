public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("O novo saldo é R$ " + saldo);
        } else{
            System.out.println("Não há saldo suficiente para a operação");
        }

    }
}
