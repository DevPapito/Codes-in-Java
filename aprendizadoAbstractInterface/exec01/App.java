public class App {

    public static void main(String[] args) {

        Pagamento caixa = new Caixa(50);
        caixa.processar(caixa.getValor());

    }

}
