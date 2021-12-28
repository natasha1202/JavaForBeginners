package HomeWorkJava6;

public class Summa {
    
    int Zumma (int a1, int b1, int c1, int d1){
       int s = a1 + b1 + c1 + d1;
       return s;
    }
    
    int Zumma (int a2, int b2, int c2){
        int s = a2+b2+c2;
        return s;
    }
    
    int Zumma (int a3, int b3){
        int s = a3+b3;
        return s;
    }
    
    int Zumma (int a4){
       int s = a4;
       return s;
    }
    
    int Zumma (){
        int s = 0;
        return s;
    }
    
    int a;
    int b;
    int c;
    int d;
}

class SummaTest{
    public static void main(String[] args) {
        Summa s1 = new Summa();  
        s1.a = 5;
        s1.b = 6;
        s1.c = 7;
        s1.d = 8;
        System.out.println("Sum is equal to " + s1.Zumma(s1.a, s1.b, s1.c, s1.d));
        System.out.println("Sum is equal to " + s1.Zumma(s1.a, s1.b, s1.c));
        System.out.println("Sum is equal to " + s1.Zumma(s1.a, s1.b));
        System.out.println("Sum is equal to " + s1.Zumma(s1.a));
        System.out.println("Sum is equal to " + s1.Zumma());

    }

}