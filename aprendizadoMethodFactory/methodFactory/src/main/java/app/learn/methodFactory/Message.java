package app.learn.methodFactory;

public abstract class Message {

    protected String title;
    protected String message;

    public Message(String title, String message) {

        this.title = title;
        this.message = message;

    }

    public Message() {}

    public abstract void sendMessage();

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public String getMessage() {

        return message;

    }

    public void setMessage(String message) {

        this.message = message;

    }

}
