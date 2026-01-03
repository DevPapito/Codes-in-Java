package app.learn.methodFactory;

public class Sms extends Message {

    @Override
    public void sendMessage() {

        System.out.println("Mensagem enviada apartir de um SMS: "+message);

    }

}
