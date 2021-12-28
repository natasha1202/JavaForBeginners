package Lesson10;
import Lesson9.Car;
import Lesson9.Student;
// import static Lesson8.Student.number;
import static Lesson8.Student.*; // import all statis variables from the class


public class A {
    
    // static int count = 99;
    
    public static void main(String[] args) {
        Lesson9.Car c1 = new Lesson9.Car("red", "V6");
        Car c2 = new Car("black", "V4");
        Lesson9.Student st1 = new Lesson9.Student();
        Student st2 = new Student();
        B b1 = new B();
        
        System.out.println(c1.a);
        System.out.println(Car.count);
        String st4 = "hello";
        System.out.println(st4);
        System.out.println(number);
        
       
        System.out.println(count);

    }
}

class B{
    Student st3 = new Student();
}
