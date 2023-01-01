package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {

    }

    public void Meow(){
        System.out.println(getName() + " is Meowing");
    }


    @Override
    public void play() {
        System.out.println(getName() + " is playing with a ball of wool");
    }
}
