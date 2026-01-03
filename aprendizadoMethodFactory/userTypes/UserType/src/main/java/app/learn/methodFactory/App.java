package app.learn.methodFactory;

import app.learn.methodFactory.client.CreateUser;

import app.learn.methodFactory.factory.AdminFactory;
import app.learn.methodFactory.factory.ClientFactory;

public class App {

    public static void main(String[] args) {

        CreateUser user = new CreateUser(new ClientFactory());
        user.use();

    }
}
