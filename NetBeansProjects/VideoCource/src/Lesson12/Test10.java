package Lesson12;

public class Test10 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        
        if (a<20){
            System.out.println("A is less than 20");
        }
        
      //  if (a<20) System.out.println("A is less than 20");
      
        if (b<20){
            System.out.println("B is less than 20");
        }
        else{
            System.out.println("B is more or equal to 20");
        }
        
        int salary = 600;
        boolean bool = true;
        
        if(salary>=500){
            System.out.println(":)");
        } else {
            System.out.println(":(");
        }
        
        if (salary<200){
            System.out.println("Salary is very low");
        } else if(salary <400 && bool == false || true){
            System.out.println("Salary has middle value");
        } else if(salary<600){
            System.out.println("Salary is high");
        } else {
            System.out.println("Salary is great");
        }
        
    }
        
    
    
}
