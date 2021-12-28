package HomeWorkJava11;

public class Car {
    
    String color;
    String engine;
    int doorsNumber;
    int doorCount;
    
    int changeDoorsNumber(int addition){
        doorsNumber = doorsNumber + addition;
        return doorsNumber;
    }
    
    
    public Car(String color, String engine, int doorCount){
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;  
    }    
    
    public Car(){  }
}

class CarTest{
       
    static void changeColor (Car c1, Car c2){
        Car c3 = new Car();
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }
    
    //----------------------------------------------
    void changeDoorCount(Car c, int doorCount){
        c.doorCount = doorCount;        
    }
    
    void exchangeColor(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    } 
    //----------------------------------------------
    
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.doorsNumber = 2;
        Car car2 = new Car();
        car2.color = "white";
        car2.doorsNumber = 4;
        
        changeColor(car1, car2);
        System.out.println(car1.color);
        System.out.println(car2.color);
        
        car1.changeDoorsNumber(3);
        System.out.println(car1.doorsNumber);
        car2.changeDoorsNumber(-1);
        System.out.println(car2.doorsNumber);
        
        //----------------------------------------------
        CarTest ct = new CarTest();
        Car car11 = new Car("red", "V4", 2);
        Car car22 = new Car("yellow", "V6", 4);
        ct.changeDoorCount(car11,3);
        ct.exchangeColor(car11, car22);
        System.out.println("Info about the 1st car: color is  " + car11.color + "; engine is " + car11.engine
                            + " the count of the doors is " + car11.doorCount);
        System.out.println("Info about the 2nd car: color is  " + car22.color + "; engine is " + car22.engine
                            + " the count of the doors is " + car22.doorCount);
        
    }
 
       
}
