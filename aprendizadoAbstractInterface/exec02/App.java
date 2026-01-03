public class App {

    public static void main(String[] args) {

        ServicoNotificacao servico = new Servico(new SmsNotificacao());
        servico.notificarUsuario("Ola Mundo");

    }

}
