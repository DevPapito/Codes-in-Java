public class Sistema {

    private final Logger logger;

    public Sistema(Logger logger) {

        this.logger = logger;

    }

    public void sendLog(String message) {

        System.out.println(message);

    }

}
