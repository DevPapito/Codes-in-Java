package app.entry.user;

import app.entry.user.view.IndexController;

import app.entry.user.controller.UserController;

import app.entry.user.service.UserService;

import app.entry.user.repository.UserRepository;

import java.util.Scanner;

public class App {

    private static long currentId;

    public static void main(String[] args) {

        UserRepository repository = new UserRepository();

        UserService service = new UserService(repository);

        UserController controller = new UserController(
                service,
                repository);

        IndexController index = new IndexController(controller);
        index.run(true);

    }

}
