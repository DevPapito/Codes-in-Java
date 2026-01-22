package game.gun;

public class App {

    public static void main(String[] args) {

        World world = new World();
        world.setRuntime(true);

        while(world.getRuntime()) {

            world.run();

        }

    }
}
