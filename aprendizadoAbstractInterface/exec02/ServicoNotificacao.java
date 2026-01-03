public abstract class ServicoNotificacao {

    protected Notificacao notificacao;

    public ServicoNotificacao(Notificacao notificacao) {

        this.notificacao = notificacao;

    }

    public void notificarUsuario(String message) {

        this.notificacao.enviar(message);

    }

}
