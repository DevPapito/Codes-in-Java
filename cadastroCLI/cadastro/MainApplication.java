package cadastro;

import cadastro.view.CLI;

import cadastro.service.UserService;

import cadastro.controller.RootController;
import cadastro.controller.RegisterController;
import cadastro.controller.LoginController;

public final class MainApplication {

    public static void main(String[] args) {

        CLI cli = new CLI();
        UserService userDB = new UserService();
        cli.setRootController(new RootController(new RegisterController(userDB),
                    new LoginController(userDB)));

        cli.run(true);


    }

}
