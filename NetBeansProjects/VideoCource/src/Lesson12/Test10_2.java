package Lesson12;

public class Test10_2 {
    
    void maximum(int i1, int i2, int i3){
        
        if(i1>i2 && i1>i3){
            int a = 5;
            System.out.println("Max = " + i1);
        } else if (i2>i1 && i2>i3){
            int a = 10;
            System.out.println("Max = " + i2);
        } else {
            int a = 15;
            System.out.println("Max = " + i3);
        }
    }
    
    void abc(){
        
        String str;
        int a = 10;
        
        if(a>=10){
            str = "Hello";
        }
        if (a<10){
            str = "Ciao!";
        }
        else {str = null;}
        
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        
        Test10_2 t = new Test10_2();
        
        t.maximum(4, 7, 0);
        
        int a = 10;
        int b = 20;
        
        int max = (a>b)? a:b;
        System.out.println(max);
    }
    
}
