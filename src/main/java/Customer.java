import rides.Ride;
import rides.RollerCoaster;

public class Customer {

    private int age;
    private double height;
    private double money;

    public Customer(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public boolean checkAge(Ride ride) {
        int requirement = ride.getMinAge();
        if (age > requirement){
            return true;
        }
        return false;
    }

    public boolean checkHeight(Ride ride) {
        double requirement = ride.getMinHeight();
        if (height > requirement){
            return true;
        }
        return false;
    }

    public boolean checkCanRide(Ride ride) {
        if (checkAge(ride) && checkHeight(ride)){
            return true;
        }
        return false;
    }

    public void pay(Ride ride) {
        double cost = ride.getPrice();
        money -= cost;
    }
}
