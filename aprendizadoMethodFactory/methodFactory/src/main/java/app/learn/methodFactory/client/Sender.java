package app.learn.methodFactory.client;

import app.learn.methodFactory.factory.MessageFactory;

import app.learn.methodFactory.Message;

// Cliente/Class
// A classe de interação com o factory
public class Sender {

    private MessageFactory messageFactory;

    public Sender(MessageFactory messageFactory) {

        this.messageFactory = messageFactory;

    }

    public void execute() {

        Message message = this.messageFactory.createMessage();
        message.setTitle("Generic Title");
        message.setMessage("Hi baby!");
        message.sendMessage();

    }

}
