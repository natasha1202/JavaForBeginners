package Lesson14;

public class Test6 {
    
    public void time(){
        
        OUTER: for(int hour=0; hour<24; hour++){
            System.out.println("Start outer loop");
            INNER: for(int minute=0; minute<60; minute++){
                System.out.println(hour + " : " + minute);
                
                if (minute == 30){
                    break OUTER;
                }
            }
            System.out.println("End outer loop");
        }
    }
    
    public void time2(){
        
        OUTER: for(int hour=0; hour<24; hour++){
            System.out.println("Start outer loop");
            
            INNER: for(int minute=0; minute<60; minute++){
                if (minute == 20){
                    continue OUTER;
                }
                if (minute == 30){break;}
                System.out.println(hour + " : " + minute);
            }
            System.out.println("End outer loop");
        }
    }
    
    public static void main(String[] args) {
        
        
        Test6 t = new Test6();
        t.time();
        t.time2();
    }
    
}
