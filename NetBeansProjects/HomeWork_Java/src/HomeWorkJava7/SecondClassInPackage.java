package HomeWorkJava7;

public class SecondClassInPackage {
    
    public static void main(String[] args) {
        Employee emp11 = new Employee (1, "Mustermann",29);
        Employee emp22 = new Employee ("Sakamoto",31);
       // Employee emp33 = new Employee (2, "Ivanov",25,35000, "IT");
    
        System.out.println(emp11.id);
        System.out.println(emp11.surname);
        System.out.println(emp22.id);
        System.out.println(emp22.surname);
      //  System.out.println(emp33.id);
      //  System.out.println(emp33.surname);
      //  System.out.println(emp33.age);
      //  System.out.println(emp33.department);
      //  System.out.println(emp33.salary);
      emp11.showId();
      emp11.showSalary();
      emp11.showSurname();
      
      emp22.showId();
      emp22.showSalary();
      emp22.showSurname();
    }
  
}
