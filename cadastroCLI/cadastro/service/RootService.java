package cadastro.service;

import cadastro.common.RootConstants;

public class RootService {

    public String chooce(String operation) {

        System.out.println(operation);

        switch (operation) {

            case "register":

                return RootConstants.RETURN_REGISTER;

            case "login":

                return RootConstants.RETURN_LOGIN;

            case "root":

                return RootConstants.RETURN_ROOT;

            default:

                return RootConstants.RETURN_ERROR;

        }

    }

    public String transformOperation(String operation)  {

        System.out.println(operation);

        if (operation == null) {

            return null;

        }

        return operation.toLowerCase().trim();

    }

}
