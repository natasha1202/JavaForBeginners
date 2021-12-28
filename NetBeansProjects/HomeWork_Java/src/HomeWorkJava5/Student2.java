package HomeWorkJava5;

public class Student2 {
    
    int idNumber;
    String GivenName;
    String Surname;
    String StudyYear;
    double avgNoteMath;
    double avgNoteForeignLanguage;
    double avgEconomics;
    double avgGrade;
    
    double averageGrade (Student2 student){
    avgGrade = (student.avgEconomics + student.avgNoteForeignLanguage + student.avgNoteMath )/3;
    System.out.println("Average Grade of student " + avgGrade);
    return avgGrade;
    }
}

class StudentTest{
    
    public static void main (String [] args) {
        
        Student2 student1 = new Student2();
        Student2 student2 = new Student2();
        Student2 student3 = new Student2();
        
    
        student1.avgNoteMath = 4;
        student1.avgNoteForeignLanguage = 5;
        student1.avgEconomics = 3;
        
        student2.avgNoteMath = 3;
        student2.avgNoteForeignLanguage = 4;
        student2.avgEconomics = 3;
        
        student3.avgNoteMath = 5;
        student3.avgNoteForeignLanguage = 3;
        student3.avgEconomics = 5;
        

        Student2 sTest = new Student2();
        
        sTest.averageGrade(student1);
        sTest.averageGrade(student2);
        sTest.averageGrade(student3);
    
    }

    
}