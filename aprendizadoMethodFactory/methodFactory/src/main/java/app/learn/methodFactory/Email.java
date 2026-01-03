package app.learn.methodFactory;

public class Email extends Message {

    @Override
    public void sendMessage() {

        System.out.println("Mensagem enviada via email: "+message);

    }

}
