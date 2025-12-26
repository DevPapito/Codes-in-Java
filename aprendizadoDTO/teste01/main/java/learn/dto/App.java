package learn.dto;

import learn.dto.controller.AppController;

public class App {

    public static void main(String[] args) {

        AppController app = new AppController();

        String message = app.register("","");
        System.out.println(message);

    }
}
