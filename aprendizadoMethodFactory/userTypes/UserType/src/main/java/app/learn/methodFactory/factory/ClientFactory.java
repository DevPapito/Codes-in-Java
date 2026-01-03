package app.learn.methodFactory.factory;

import app.learn.methodFactory.User;
import app.learn.methodFactory.Client;

public class ClientFactory implements UserFactory {

    @Override
    public User createUser() {return new Client();}

}
