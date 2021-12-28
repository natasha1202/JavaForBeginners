package HomeWorkJava9;

public class Objects8to2 {
   
    int a = 1;
    static int b = 5;
    String c = "15";
    int d;
    
    Objects8to2(int a, int b, String c){
        a = 3;
        this.a = a;
        this.b = b;
        this.c = c;
        c = "a";
        d = 3;
        int e = 5;
    }
    
    
    public static void main(String[] args) {
        
        Objects8to2 obj1 = new Objects8to2(1, 2, null);
        System.out.println(obj1.a);
        System.out.println(Objects8to2.b);
        System.out.println(obj1.c);
    }
}
