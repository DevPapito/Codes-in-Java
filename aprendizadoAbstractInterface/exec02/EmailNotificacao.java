public class EmailNotificacao implements Notificacao {

    @Override
    public void enviar(String message) {

        System.out.println("Mensagem foi enviada via Email");
        System.out.println("Mensagem: "+message);

    }

}
