package app.learn.methodFactory;

import app.learn.methodFactory.client.Sender;

import app.learn.methodFactory.factory.SmsMessageFactory;
import app.learn.methodFactory.factory.EmailMessageFactory;

public class App {

    public static void main(String[] args) {

        Sender send = new Sender(new EmailMessageFactory());
        send.execute();

    }
}
