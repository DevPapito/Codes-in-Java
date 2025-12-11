package cadastro.service;

import cadastro.model.User;

import cadastro.repository.UserRepository;

import cadastro.common.UserConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Arrays;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public UserService() {

        this.userRepository = new UserRepository();

    }

    public boolean isValidName(String name) {

        if (name.length() < 0 || name.length() > UserConstants.MAX_NUMBER_NAME) {

            return false;

        }

        return true;

    }

    public boolean isValidPassword(String password) {

        Pattern p = Pattern.compile(UserConstants.RENGEX);
        Matcher m = p.matcher(password);

        if (!(m.find())) {

            return false;

        }

        return m.matches();

    }

    public boolean isValidEmail(String email) {

        if (email.length() > UserConstants.MAX_NUMBER_EMAIL) {

            return false;

        }

        boolean verify = email.contains(UserConstants.AT);

        if (!(verify)) {

            return false;

        }

        return true;

    }

    public User saveUser(User user) {

        return userRepository.save(user);

    }

    public boolean existsInDB(String email, String password) {

        User user = userRepository.findByEmailAndPassword(email, password);

        if (user == null) {

            return false;

        }

        return true;

    }

    public boolean existsInDB(String password) {

        User user = userRepository.findByPassword(password);

        if (user == null) {

            return false;

        }

        return true;

    }
    public List<User> getDB() {

        return userRepository.read();

    }

    public void showDB() {

        for (User i : userRepository.read()) {

            System.out.println(i.getId());
            System.out.println(i.getName());
            System.out.println(i.getEmail());
            System.out.println(i.getPassword());

        }

    }

}
