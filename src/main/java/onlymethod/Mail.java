package onlymethod;

public class Mail {

    private String from;

    public Mail() {
        from = "info@";
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public String toString() {
//        return "from: " + from;
        return getPrefix() + from;
    }

    protected String getPrefix() {
        return "from: ";
    }
}
