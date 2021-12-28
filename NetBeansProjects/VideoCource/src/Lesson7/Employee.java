package Lesson7;

public class Employee {
    
    public double salary;
    
    public void dvoinayaZP(){
        
        System.out.println("Novaya ZP = "+salary*2);
             
    }
    
    public Employee (double salary2){
        salary=salary2;
    }
    
    public static void main(String[] args) {
        Employee m = new Employee(500);
        System.out.println(m.salary);
        m.dvoinayaZP();
        
    }

}

class EmployeeTest{
    
        public static void main(String[] args) {
        Employee m = new Employee(500);
        System.out.println(m.salary);
        m.dvoinayaZP();
        
    }
}