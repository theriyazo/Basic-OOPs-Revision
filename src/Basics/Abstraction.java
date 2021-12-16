package Basics;

public class Abstraction {
    public static void main(String[] args) {

    }
}
class audi extends Car{

    @Override //when we declare a parent method as abstract than we need to implement that method override, otherwise it show compile time error.
    void start() {
        System.out.println("Audi is starting...");

    }
}
class mahindra extends Car{

    @Override
    void start() {
        System.out.println("Mahindra is starting...");

    }
}
//car is a concept, we don't make object from it
//So we make it abstract
abstract class Car{
    int price;

    abstract void start(); // when we declare a class method as abstract we can't initialize it.

    void walk(){
        System.out.println("Starts walking");
    }
}
