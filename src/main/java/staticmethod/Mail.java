package staticmethod;

public class Mail {

    private String from;

    public Mail(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public static Mail createMail() {
        return new Mail("info@");
    }
}
