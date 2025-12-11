package cadastro.controller;

import cadastro.service.LoginService;

import cadastro.service.UserService;

import cadastro.view.CLI;

public class LoginController {

    private LoginService loginService;
    private UserService userService;

    public LoginController(UserService userService) {

        this.loginService = new LoginService();

        this.userService = userService;

    }

    public String login(String password) {

        boolean verify = userService.existsInDB(password);

        if (!verify) {

            return "Nome ou senha incorretos";

        }


        // MENU SISTEMA
        return "Login realizado";

    }

}
