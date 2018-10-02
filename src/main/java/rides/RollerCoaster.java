package rides;

public class RollerCoaster extends Ride {

    public RollerCoaster(String name, double price, int minAge, double minHeight) {
        super(name, price, minAge, minHeight);
    }

    public String healthWarning() {
        return "Do not ride with spinal injuries";
    }
}
