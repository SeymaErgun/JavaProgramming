package day38_Inheritance.CarTask;

public class BMW extends Car{
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breakdown(){
        System.out.println(brand+" "+model+" breaks down every 100 miles");
    }
    public void racing() {
        System.out.println(brand + " " + model + " is racing car");

    }
    @Override
        public void start(){
            System.out.println("call mechanic to jump start " + brand + " "+ model);
        }
    }

