package Lesson12;

public class Car {
    
    int engine;
    int doorCount;
    
    Car(int engine, int doorCount){
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest{
    
    public static void main(String[] args) {
        Car c1 = new Car(3, 4);
        Car c2 = new Car(2, 5);
        
        if (c1.engine > c2.engine){
            if (c1.doorCount > c2.doorCount){
                System.out.println("Engine and count of doors of the first car is more than by car2");}
            else {
                System.out.println("Engine of the first car is more powerful, but count of doors is less than by car2");}
        }
        else {System.out.println("Engine of the first car is less powerful");}
    }
}
