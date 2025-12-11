package cadastro.controller;

import cadastro.model.User;

import cadastro.service.UserService;

public class RegisterController {

    private long id = 0;

    private UserService userService;

    public RegisterController(UserService userService) {

        this.userService = userService;

    }

    public String register(String name, String email, String password, String confirmPassword) {

        boolean verifyName = userService.isValidName(name);
        boolean verifyEmail = userService.isValidEmail(email);
        boolean verifyPassword = userService.isValidPassword(password);

        if (!verifyName || !verifyEmail || !verifyPassword || confirmPassword == null) {

            return "Campos não preenchidos ou fora das normas";

        }

        if (!password.equals(confirmPassword)) {

            return "senha de confirmação diferente";

        }

        boolean exist = userService.existsInDB(email, password);

        if (exist == true) {

            return "Email ou Senha já usados!";

        }

        User user = userService.saveUser(new User(id++,name, password, email));

        System.out.println(user.getName());

        return "Cadastro completo!";

    }

}
