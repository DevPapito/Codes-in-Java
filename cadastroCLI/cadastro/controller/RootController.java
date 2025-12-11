package cadastro.controller;

import cadastro.service.RootService;

import cadastro.controller.RegisterController;
import cadastro.controller.LoginController;

import cadastro.common.RootConstants;

import cadastro.view.CLI;

// @Controller
/**
 *@author DevPapito
 *
 *Classe RootController que gerencia diretamente a camada view e permite
 *o fluxo organizado dos dados para outras camadas iniciais do projeto
 *
 *@@param RegisterController, LoginController; São controllers separados que
 *realizam o registro(cadastro) e login do cliente ao sistema,
 *
 * */
public class RootController {

    private CLI cli;

    private RootService rootService;

    private RegisterController register;
    private LoginController login;

    public RootController(RegisterController register,
            LoginController login) {

        this.rootService = new RootService();

        this.register = register;
        this.login = login;

        this.cli = new CLI();

    }

    /**
     *
     *
     *@param String operation; Parametro que deseja receber uma operação
     *dos tipos root, register e login
     *
     * */
    public String choocerOperation(String operation) {

        String operationLocal = rootService.transformOperation(operation);

        return rootService.chooce(operationLocal);

    }

    public String directonal(String operation) {

        if (operation.equals(RootConstants.RETURN_REGISTER)) {

            String message = register.register(cli.input("Digite seu nome aqui: "),
                    cli.input("Digite seu email aqui: "),
                    cli.input("Digite sua senha aqui: "),
                    cli.input("Digite sua senha de confirmação aqui: "));

            return message;

        }else if (operation.equals(RootConstants.RETURN_LOGIN)) {

            String message = login.login(cli.input("Digite sua senha: "));

            return message;

        }else if (operation.equals(RootConstants.RETURN_ROOT)) {

            return "return to root";

        }

        return "invalido";

    }


}
