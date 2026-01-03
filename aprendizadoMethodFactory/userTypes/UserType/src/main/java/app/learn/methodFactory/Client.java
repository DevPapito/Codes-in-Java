package app.learn.methodFactory;

public class Client extends User {

    public Client(long id, String name, boolean admin) {super(id,name,admin);}

    public Client() {super(0,"genericUser",false);}

}
