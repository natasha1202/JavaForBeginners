package Lesson8;


public class Student2 {
    
    String name;
    int cource;
    static int count; //считает кол-во студентов, увеличивается на 1 при добавлении нового студента
    static final int number = 5;
    int a;
    
    
    public Student2(String name2, int cource2){
        count++;
        name = name2;
        cource = cource2;
        System.out.println("Student # " + count + " is created");
    }
    
    public static void showCount(){
        System.out.println("Whole amount of students " + count);
    }
    

    public void showInfo(){
        System.out.println("Welcome to the student class!");
    }
    
    void abc(){
        a++;
        count++;
    }
    
    static void abcd(){
        count++;
        Student2 st2=new Student2("Peter", 1);
        st2.a ++;
    }

    
    public static void main(String[] args) {
        abcd();
        Student2 st3 = new Student2("Ivan", 4);
        st3.abc();
    }
}