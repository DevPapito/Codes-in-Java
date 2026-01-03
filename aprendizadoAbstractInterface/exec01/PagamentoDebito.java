public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(double valor) {

        super(valor);

    }

    @Override
    public void processar(double valor) {

        System.out.println("Pagamento processado no debito de valor: "+valor);

    }

}
