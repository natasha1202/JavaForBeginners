package Lesson13;


public class Test1 {
    
}

class Student{
    
    //double grade;
    int grade;
   /* Student (double grade){
        this.grade = grade;    
    } */
    
       Student (int grade){
        this.grade = grade;    
    }
    
    public static void main(String[] args) {
        
        Student st1 = new Student(3);
    /*    if(st1.grade == 2){
            System.out.println("Not enough");
        }
        else if (st1.grade == 3){
            System.out.println("Enough");
        }
        else if (st1.grade == 4){
            System.out.println("Good");
        }
        else if (st1.grade == 5){
            System.out.println("Great");
        }
    else {System.out.println("Error, grade is incorrect");
    } */
    
    switch(st1.grade){
        case 2: System.out.println("Not enough");
            break;
        case 3: System.out.println("Enough");
            break;
        case 4: System.out.println("Good");
            break;
        case 5: System.out.println("Great");
            break;
        default: System.out.println("Error, grade is incorrect");
    }
        
    }
}

