package app.learn.methodFactory;

public class Admin extends User {

    public Admin(long id, String name) {super(id,name,true);}

    public Admin() {super(0,"adminGeneric",true);}

}
