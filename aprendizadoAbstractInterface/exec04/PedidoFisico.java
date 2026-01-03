public class PedidoFisico extends ProcessarPedido {

    @Override
    public void validar() {

        System.out.println("Validando pedido fisico!");

    }

    @Override
    public void calcular() {

        System.out.println("Calculando pedido fisico!");

    }

    @Override
    public void finalizar() {

        System.out.println("Finalizando pedido fisico!");

    }

}
