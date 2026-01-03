public class App {

    public static void main(String[] args) {

        Sistema sys = new Sistema(new FileLogger());
        sys.sendLog("Hello Log!");

    }

}
