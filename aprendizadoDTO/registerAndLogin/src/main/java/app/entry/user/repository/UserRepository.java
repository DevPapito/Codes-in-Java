package app.entry.user.repository;

import app.entry.user.model.User;

import java.util.List;
import java.util.ArrayList;

public class UserRepository {

    private long id;

    private List<User> fakeDB = new ArrayList<>();

    public User save(User user) {

        user.setId(id++);
        this.fakeDB.add(user);

        return user;

    }

    public User read(long id) {

        return fakeDB.get((int)id);

    }

    public User update(User user) {

        //TODO:realizar metodo update repository
        User local = read(user.getId());

        if (user.getName() != null) local.setName(user.getName());
        if (user.getEmail() != null) local.setEmail(user.getEmail());
        if (user.getPassword() != null) local.setPassword(user.getPassword());

        return local;

    }

    public void delete(long id) {

        User local = read(id);

        fakeDB.remove(local);

    }

    public List<User> getFakeDB() {

        return fakeDB;

    }

    // searchs

    public long findByPassword(String password) {

        for (User user : fakeDB) {

            if (user.getPassword().equals(password)) {

                return user.getId();

            }

        }

        return -1;

    }

}
