package HomeWorkJava13;

public class Month2015 {
    
    int monthNumber;
    
    static void dayQuantity (int monthNumber){
        
                switch(monthNumber){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("31 days");
                        break;
                    case 2: 
                        System.out.println("28 days");
                        break;
                    case 4: 
                    case 6:
                    case 9:
                    case 11: 
                        System.out.println("30 days");
                        break;
                    default: System.out.println("Error, the month number " + monthNumber + " does not exist") ;  
            
        }
    }
    
    public static void main(String[] args) {
        
        
            dayQuantity(3);
            dayQuantity(9);
            dayQuantity(-1);
            dayQuantity(11);
            dayQuantity(2);
    }
    
}
