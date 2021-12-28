package Lesson9;

public class Car {
    public String color;
    public int a = 10;
    public String engine;
    public static int count;
    
   /* Car(String color2, String engine2){
        count++;
        color = color2;
        engine = engine2;
    } */
    
    public  Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
        int x = 5;
        int y = x + 10;
    }
    
    public void showColor(){
        System.out.println("Color of the car " + color);
    }
    
    public void changeColor(String color3){
        System.out.println("Color is changed");
        int price = 5000;
        color = color3;
        price +=1000;
               
    }
    
    public static void changeA (int b){
        Car c = new Car("black", "V8");
        c.a = b;
    }
    
    void abc (int a, int b){
        
    }
    
    void abcd (int a, int b){
        
    }
    
    void changeColor2 (String color){
        System.out.println(color);
    } 
    
        void changeColor3 (String color){
        System.out.println(this.color);
    } 
    
    public static void main(String[] args) {
         Car c = new Car("red", "V8");
         System.out.println(c.color);
         c.changeColor2("black");
         System.out.println(c.color);
         c.changeColor3("black");
         System.out.println(c.color);
         
    }
    
    
}
