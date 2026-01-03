package app.learn.methodFactory.client;

import app.learn.methodFactory.factory.UserFactory;
import app.learn.methodFactory.User;

public class CreateUser {

    private final UserFactory user;

    public CreateUser(UserFactory user) {

        this.user = user;

    }

    public void use() {

        User local = user.createUser();
        System.out.println(local.toString());

    }

}
