package HomeWorkJava7;

public class Employee {
    
    Employee(int id2, String surname2, int age2){
        id=id2;
        surname=surname2;
        age=age2;
    }
    
    public Employee (String surname2, int age2){
        surname = surname2;
        age= age2;
    }
    
    private Employee(int id2, String surname2, int age2, double salary2, String department2){
        id=id2;
        surname=surname2;
        age=age2;
        salary=salary2;
        department=department2;
    }
    
    int id;
    public String surname;
    int age;
    private double salary;
    String department;
    
    public void showSalary (){
        System.out.println("Salary = " + salary);
    }
    
    public void showSurname (){
        System.out.println("Surname = " + surname);
    }
    
    public void showId (){
        System.out.println("Id = " + id);
    }
}

class EmployeeTest{
    
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 25);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("petrov", 30);
        System.out.println(emp2.surname);
        System.out.println(emp2.department);
       // Employee emp3 = new Employee (2, "Sidorov", 40, 100.35, "IT");
       // System.out.println(emp3.department);
        
        emp1.showId();
        emp1.showSalary();
        emp1.showSurname();
        emp2.showId();
        emp2.showSalary();
        emp2.showSurname();
      //  emp3.showId();
      //  emp3.showSalary();
      //  emp3.showSurname();
    }
}
