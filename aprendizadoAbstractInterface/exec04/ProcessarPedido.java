public abstract class ProcessarPedido {

    public final void processar() {

        validar();
        calculara();
        finalizar();

    }

    public abstract void validar();
    public abstract void calcular();
    public abstract void finalizar();

}
