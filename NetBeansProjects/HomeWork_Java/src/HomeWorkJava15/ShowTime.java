package HomeWorkJava15;

public class ShowTime {
    
    static void time(){
        int hour = 0;
        
        OUTER: 
        while (hour<6){
            
            int minute = 0;
            MIDDLE: 
            do {
                if(hour>1 && minute%10==0){ break OUTER;}
                
                int second = 0;
                INNER: 
                while (second <60) {
                    if(second*hour > minute){continue MIDDLE;}
                    System.out.println(hour + " : " + minute + " : " + second);
                    second++;
                }
               minute++;
            }
            while (minute <60);
            hour++;
        }
    }
    
    public static void main(String[] args) {
        
        time();
    }
    
    
}
