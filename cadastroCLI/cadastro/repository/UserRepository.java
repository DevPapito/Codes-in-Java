package cadastro.repository;

import cadastro.model.User;

import java.util.List;
import java.util.ArrayList;

public class UserRepository {

    private List<User> users;

    public UserRepository() {

        users = new ArrayList<>();

    }

    public User save(User user) {

        users.add(user);

        return user;

    }

    public List<User> read() {

        return users;

    }

    public User update(User user) {

        User searchedUser = search(user.getId());

        if (searchedUser == null) {

            return null;

        }

        searchedUser.setName(user.getName());
        searchedUser.setEmail(user.getEmail());
        searchedUser.setPassword(user.getPassword());

        return save(user);

    }

    public void delete(long id) {

        users.remove(id);

    }

    // finds

    public User findById(long id) {

        return search(id);

    }

    public User findByName(String name) {

        for (User i : users) {

            if (name.equals(i.getName())) {

                return i;

            }

        }

        return null;

    }

    public User findByNameAndEmail(String name, String email) {

        for (User i : users) {

            if (name.equals(i.getName()) && email.equals(i.getEmail())) {

                return i;

            }

        }

        return null;

    }

    public User findByEmailAndPassword(String email, String password) {

        for (User i : users) {

            if (email.equals(i.getEmail()) && password.equals(i.getPassword())) {

                return i;

            }

        }

        return null;

    }

    public User findByPassword(String password) {

        for (User i : users) {

            if (password.equals(i.getPassword())) {

                return i;

            }

        }

        return null;

    }

    private User search(long id) {

        for (User i : users) {

            if (id == i.getId()) {

                return i;

            }

        }

        return null;

    }

}
