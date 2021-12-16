package Basics;

public class Inheritance {
    public static void main(String[] args) {

    Person p1 = new Person("Riyaz", 23);
    p1.walk(10501); //this is compiled time polymorphism
    Developer d1 = new Developer("Theriyazo", 45);
    d1.walk(5254); //this is called run time polymorphism

    }
}
class Developer extends Person{

    public Developer(String name, int age) {
        super(name, age);
        System.out.println(name+" named Developer is of "+age+" years old.");
    }
    void walk(int steps){ //this is called run time polymorphism
     System.out.println(name+" named Developer has complited: "+steps+" steps");

    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void walk(){
        System.out.println(name+" Starts walking...");
    }
    void walk(int steps){
        System.out.println(name+" Starts walking...");
        System.out.println(name+" has complited: "+steps+" steps");
    }
}