package app.natal;

public class Presente {

    private String name;
    private double value;
    private String type;

    public Presente(String name, double value, String type) {

        this.name = name;
        this.value = value;
        this.type = type;

    }

    public String getName() { return name;}

    public double getValue() { return value;}

    public String getType() { return type;}

}
