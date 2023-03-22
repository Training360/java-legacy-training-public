package legacy;

public class Mail {

    private String from;

    public Mail() {
        // this.from = "info@";
        this.from = defaultValue();
    }

    protected String defaultValue() {
        return "info@";
    }

    public String getFrom() {
        return from;
    }
}
