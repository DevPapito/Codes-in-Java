package app.game.sleep.controller;

public class WorldController {

    public void world() {

        String message = "";

        PlayerController player = new PlayerController("Player 01");
        message = player.showInfo();
        System.out.println(message);

        message = player.sleep();
        System.out.println(message);

        message = player.showInfo();
        System.out.println(message);

        message = player.wakeUp();
        System.out.println(message);

        message = player.showInfo();
        System.out.println(message);

    }

}
