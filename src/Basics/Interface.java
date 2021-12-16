package Basics;

public class Interface implements Bike, Human{
    public static void main(String[] args) {
        Interface model = new Interface();
        model.start();
        model.walk();
    }

    @Override
    public void start() {
        System.out.println("my bike is starting");
    }

    @Override
    public void walk() {
        System.out.println("starts walking...");

    }
}
interface Bike{
    void start(); //by default methods are public abstract, so we can't define its body.
}
interface Human{
    void walk();
}