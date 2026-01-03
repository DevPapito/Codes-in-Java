package app.learn.methodFactory.factory;

import app.learn.methodFactory.Sms;
import app.learn.methodFactory.Message;

public class SmsMessageFactory extends MessageFactory {

    @Override
    public Message createMessage() {

        return new Sms();

    }

}
