package app.learn.methodFactory.factory;

import app.learn.methodFactory.Admin;
import app.learn.methodFactory.User;

public class AdminFactory implements UserFactory {

    @Override
    public User createUser() {

        return new Admin();

    }

}
