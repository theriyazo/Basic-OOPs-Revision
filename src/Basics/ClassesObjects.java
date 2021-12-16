package Basics;

public class ClassesObjects {
    public static void main(String[] args) {
        Student s1 = new Student(27, "Riyaz", 80);
        Student s2 = new Student();
        s2.usn=01;
        s2.marks=20.10F;
        s2.name= "RiyazAhamad";
        System.out.println(s1.usn+" "+s1.name+" "+s1.marks);
        System.out.println(s2.usn+" "+s2.name+" "+s2.marks);
    }
}
 class Student{
    int usn;
    String name;
    float marks;

    static int count;

    public Student(){
        count++;
    }
    public Student(int usn, String name, float marks){
        this.usn = usn;
        this.name = name;
        this.marks = marks;
    }


 }