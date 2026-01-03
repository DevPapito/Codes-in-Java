package app.learn.methodFactory.factory;

import app.learn.methodFactory.Email;
import app.learn.methodFactory.Message;

public class EmailMessageFactory extends MessageFactory {

    @Override
    public Message createMessage() {

        return new Email();

    }

}
