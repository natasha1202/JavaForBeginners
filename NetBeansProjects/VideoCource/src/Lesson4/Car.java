
package Lesson4;

public class Car {
    
    Car(String cvet, String motor){
        
        color = cvet;
        engine = motor;
        
    }
    
    String color; // = "red";
    String engine; // = "V6";
  //  String color = new String ("red") ;
    
}
 class CarTest{
         
        public static void main(String[] args) {           
            
            int a;
           // Car car1 = new Car();
            Car car1 = new Car("Yellow", "V4");
            Car car2 = car1;
            Car car3;
           // car1.color = "black";
           // car1.engine = "V8";
        
            System.out.println(car2.engine);
           // System.out.println(new Car().color);
            System.out.println("Color " + car1.color);
            System.out.println("Engine " + car1.engine);
            System.out.println(car1.color);
            System.out.println(car1.engine);

    }
 }