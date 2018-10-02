package rides;

public class LogFlume extends Ride {

    public LogFlume(String name, double price, int minAge, double minHeight) {
        super(name, price, minAge, minHeight);
    }

    public String warning() {
        return "Warning, you will get soaked";
    }
}
