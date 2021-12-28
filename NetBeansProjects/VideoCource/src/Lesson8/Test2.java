package Lesson8;


public class Test2 {
    public final int a;
    
    Test2(){
        a=10;
    }
    
    Test2 (boolean b){
        a=15;
    }
    
    public void abc(final short s){ // final параметр
       final byte b;
       b=10;
       System.out.println(s+b);
        
    }
    
    
    public static void main(String[] args) {
           Test1 t = new Test1();
           System.out.println(t.a);
    }
}
