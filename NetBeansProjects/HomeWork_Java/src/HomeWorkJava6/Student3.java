package HomeWorkJava6;

import HomeWorkJava5.*;

public class Student3 {
    
    Student3 (int id1, String gn1, String sn1, String year1, double math1, double language1, double economics1){
    idNumber=id1;
    GivenName=gn1;
    Surname=sn1;
    StudyYear=year1;
    avgNoteMath=math1;
    avgNoteForeignLanguage=language1;
    avgEconomics=economics1;
    
    double avgGrade = (economics1 + language1 + math1)/3;
    System.out.println(avgGrade);
    }
    
    Student3 (int id2, String gn2, String sn2, String year2){
        this(id2,gn2,sn2,year2,0,0,0);
    }
    
    Student3 (){
    }
    
    int idNumber;
    String GivenName;
    String Surname;
    String StudyYear;
    double avgNoteMath;
    double avgNoteForeignLanguage;
    double avgEconomics;
    double avgGrade;
    
}

class StudentTest{
    
    public static void main (String [] args) {
        
        Student3 student1 = new Student3(1, "Jon", "Dow", "2", 4, 5, 4);
        Student3 student2 = new Student3(2, "Max", "Mustermann","4");
        Student3 student3 = new Student3();
        
        
    
    }

    
}