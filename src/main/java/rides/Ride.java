package rides;

public abstract class Ride {

    private String name;
    private double price;
    private int minAge;
    private double minHeight;

    public void Ride(String name, double price, int minAge, double minHeight){
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getMinHeight() {
        return minHeight;
    }
}
