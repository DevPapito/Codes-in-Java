package app.game.sleep.model.vo;

public record Name(String name) {

    public Name {

        if (name == null || name.isEmpty())
            throw new RuntimeException("Name is Null");

        if (name.length() <= 3 && name.length() >= 50)
            throw new RuntimeException("Size name is invalid");

    }


}
