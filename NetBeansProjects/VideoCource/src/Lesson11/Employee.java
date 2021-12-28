package Lesson11;

public class Employee {
    public String name;
    public double salary;
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    
    public double uvelichitel (double a){ // метод работает со значение з/п
        a = a*2;
        return a;
    }
    
    public double zp2 (){
        salary = salary *2; // метод работает с самой переменной з/п
        return salary;
    }
}

class EmployeeTest{
    
    public static void main(String[] args) {
        Employee empl1 = new Employee("Ivan", 100.55);
        double d = empl1.uvelichitel(empl1.salary);
        System.out.println(d);
        System.out.println(empl1.salary);
        empl1.zp2();
        System.out.println(empl1.salary);
    }
}
