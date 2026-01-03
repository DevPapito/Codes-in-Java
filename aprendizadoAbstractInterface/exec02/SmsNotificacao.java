public class SmsNotificacao implements Notificacao {

    public void enviar(String message) {

        System.out.println("Mensagem enviada via SMS!");
        System.out.println("Mensagem: "+message);

    }

}
