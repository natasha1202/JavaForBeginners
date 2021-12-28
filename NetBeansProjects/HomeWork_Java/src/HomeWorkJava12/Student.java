package HomeWorkJava12;

import java.util.Objects;

public class Student {
    
    String name;
    int course;
    double grade;
    
    Student(String name, int course, double grade){
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
 
    
}

class StudentTest{
    
    static void compareStudents(Student st1, Student st2){
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade){
            System.out.println("Student1 and Student2 are the same person");
        } else {
            System.out.println("Students are different");
        }
    }
    
    static void studentInfo(Student st1, Student st2){
       
       if(st1.name.equals(st2.name)){
           
           if(st1.course == st2.course){
               
               if (st1.grade == st2.grade){System.out.println("Students have the same name, course, and grade. Student 1 and student 2 are the same person");} 
               else {System.out.println("Students have the same name, and course; but different grades");}
           } else {
               if (st1.grade == st2.grade){System.out.println("Students have the same name,and grade; but different courses");} 
               else { System.out.println("Students have the same names; but different grades, and courses");}      
           }
    
       } else {
           if(st1.course == st2.course){
               
               if (st1.grade == st2.grade){System.out.println("Students have the same courses, and grades; but different names");} 
               else {System.out.println("Students have the same courses; but different names, and grades");}
           } else {
               if (st1.grade == st2.grade){ System.out.println("Students have the same grades; but different names, and courses");} 
               else {System.out.println("Students have the different names, grades, and courses");}      
           }
           
       }
        
    }
    
    public static void main(String[] args) {
        
        Student st1 = new Student("Max", 3, 4.5);
        Student st2 = new Student("John", 1, 3.7);
        Student st3 = new Student("Max", 3, 4.5);
        Student st4 = new Student("Max", 5, 4.5);
        
        compareStudents(st1, st2);
        compareStudents(st1, st3);
        
        studentInfo(st1, st3);
        studentInfo(st1, st2);
        studentInfo(st3, st4);
        

            
            
    }
}