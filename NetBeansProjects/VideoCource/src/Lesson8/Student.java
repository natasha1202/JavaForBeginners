package Lesson8;


public class Student {
    
    String name;
    int cource;
    public static int count; //считает кол-во студентов, увеличивается на 1 при добавлении нового студента
    public static final int number = 5;
    
    
    public Student(String name2, int cource2){
        count++;
        name = name2;
        cource = cource2;
        System.out.println("Student # " + count + " is created");
    }
    
    public static void showCount(){
        System.out.println("Whole amount of students " + count);
    }
    
}

class StudentTest{
    
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",1);
        Student st2 = new Student("Peter",4);
        Student st3 = new Student("Maria",2);
        System.out.println(st1.name);
        System.out.println(Student.count);
    //    System.out.println(st1.count);
    //    System.out.println(st2.count);
    //    System.out.println(st3.count);
        Student.showCount();
        
    }
}