package HomeWorkJava5;

public class Employee {
    
    
    int id;
    String surname;
    int age;
    double salary;
    String department;
    
    Employee (int i, String name, int a, double s, String d){
        id=i;
        surname=name;
        age=a;
        salary=s;
        department=d;
    }
    
    double adjustment (){
        salary*=2;
        return salary;
    }
    
}

class EmployeeTest{
    
        public static void main(String[] args) {           
            
        Employee employee1 = new Employee (1, "Dou", 35, 51000, "IT");
        Employee employee2 = new Employee (2, "Mustermann", 51, 150000, "Leadership");
        
        System.out.println(employee1.salary);
        employee1.adjustment();
        System.out.println(employee1.salary);
        System.out.println(employee2.salary);
        employee2.adjustment();
        System.out.println(employee2.salary);
       
        

    }
    
}
