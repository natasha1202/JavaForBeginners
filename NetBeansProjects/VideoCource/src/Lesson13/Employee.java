package Lesson13;

 class Employee {
     
     public static void main(String[] args) {
         
        /* switch("Sunday"){
             case "Monday": 
                 System.out.println("Until 18:00");
                 break;
             case "Tuesday": 
                 System.out.println("Until 18:00");
                 break;
             case "Wednesday": 
                 System.out.println("Until 18:00");
                 break;
             case "Thursday": 
                 System.out.println("Until 18:00");
                 break;
             case "Friday": 
                 System.out.println("Until 18:00");
                 break;
             case "Saturday": 
                 System.out.println("Until 14:00");
                 break;
             case "Sunday": 
                 System.out.println("Weekend");
                 break;
             default: 
                 System.out.println("Error. The day doe not exist");
         }
*/
        switch("Thursday"){
             case "Monday": 
             case "Tuesday": 
             case "Wednesday": 
             case "Thursday": 
             case "Friday": 
                 System.out.println("Until 18:00");
                 break;
             case "Saturday": 
                 System.out.println("Until 14:00");
                 break;
             case "Sunday": 
                 System.out.println("Weekend");
                 break;
             default: 
                 System.out.println("Error. The day doe not exist");
         }
        
        
     }
    
}
