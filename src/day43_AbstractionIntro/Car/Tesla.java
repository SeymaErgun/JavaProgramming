package day43_AbstractionIntro.Car;

public class Tesla extends Car {
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("say  \"start\"");
    }
    public final void autoPilot(){
        System.out.println(getBrand() + " " + getModel()+ " has auto pilot feature");
    }

}
