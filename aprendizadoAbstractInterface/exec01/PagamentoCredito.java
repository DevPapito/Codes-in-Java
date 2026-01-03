public class PagamentoCredito extends Pagamento {

    public PagamentoCredito(double valor) {

        super(valor);

    }


    @Override
    public void processar(double valor) {

        System.out.println("Pagamento processado no credito de valor: "+valor);

    }

}
