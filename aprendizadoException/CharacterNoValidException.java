import java.util.NoSuchElementException;

public class CharacterNoValidException extends NoSuchElementException {

    public CharacterNoValidException() {

        super("Character invalid with Domain detected!");

    }

}
