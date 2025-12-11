package cadastro.service;

import cadastro.model.User;

import cadastro.repository.UserRepository;

public class LoginService {

    private UserRepository userRepository;

    public LoginService() {

        this.userRepository = new UserRepository();

    }

    public boolean verifyAccountExist(String name, String password) {

        User user = userRepository.findByPassword(password);

        if (user == null) {

            return false;

        }

        return true;

    }

}
