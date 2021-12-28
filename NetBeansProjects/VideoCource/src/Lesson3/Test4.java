package Lesson3;

public class Test4 {
  
        public static void main (String[] args){
        
            int a=3;
            int b=10;
            
            int c=a+b;
            int d=b-a;
            int e=b*a;
            int f=b/a;
            
            int celayaChast=b/a;
            int ostatok=b%a%b; // остаток от деления находится с помощью знака %
            
            System.out.println(a+b);
            System.out.println(c);
            System.out.println(b-a);
            System.out.println(d);
            System.out.println(a*b);
            System.out.println(e);
            System.out.println(b/a);
            System.out.println(f);
            System.out.println("Целая часть от деления "+celayaChast);
            System.out.println("Остаток от деления "+ostatok);
            
            double a1=11;
            double b1=3;
            
            double c1=a1/b1;
            System.out.println(c1);
            
            double a2=5.5;
            double b2=3.5;
            
            double c2=a2 % b2;
            System.out.println(c2);
            
            int x=5;
            int y=3;
           // int z=x-y;
          //  System.out.println(z);
            
          //  int z1=x- y++;
            int z2=x- ++y;
          //  System.out.println(z1);
            System.out.println(y);
            System.out.println(z2);
    }
}
