package HomeWorkJava4;

public class Student {
    
    int idNumber;
    String GivenName;
    String Surname;
    String StudyYear;
    double avgNoteMath;
    double avgNoteForeignLanguage;
    double avgEconomics;
    
}

class StudentTest{
    
    public static void main (String [] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
    
        student1.avgNoteMath = 4;
        student1.avgNoteForeignLanguage = 5;
        student1.avgEconomics = 3;
        
        student2.avgNoteMath = 3;
        student2.avgNoteForeignLanguage = 4;
        student2.avgEconomics = 3;
        
        student3.avgNoteMath = 5;
        student3.avgNoteForeignLanguage = 3;
        student3.avgEconomics = 5;
        
        System.out.println("Average grade of the student 1 is " + ((student1.avgEconomics + student1.avgNoteForeignLanguage + student1.avgNoteMath )/3) );
        System.out.println("Average grade of the student 2 is " + ((student2.avgEconomics + student2.avgNoteForeignLanguage + student2.avgNoteMath )/3) );
        System.out.println("Average grade of the student 3 is " + ((student3.avgEconomics + student3.avgNoteForeignLanguage + student3.avgNoteMath )/3) );
    
    }

    
}