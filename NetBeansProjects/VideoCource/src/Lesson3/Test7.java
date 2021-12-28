
package Lesson3;

public class Test7 {
    
            public static void main(String[] args) {
        
            boolean a = true;
            boolean b = false;
            int c = 10;
            int d = 5;
            int e = 0;
            int e2 = 0;
            int f = 100;
            int e3 = 99;
            
            System.out.println(!a);
            System.out.println(!b);
            
            boolean c1 = !(c>d);
            System.out.println(c1);
            
            boolean g = c>d && e++ ==f; // true && false = false
            System.out.println(e);
            
            boolean h = c<d && e2++ ==f; // false , 2-е уловие не проверяется, е2 не увеличивается
            System.out.println(e2);
            
            boolean i = c>d || ++e3==d; // false || true = true
            boolean i2 = c<d || ++e3==d; // true, 2-е уловие не проверяется, е2 не увеличивается
            System.out.println(e3);
            
            boolean i3 = c<d | ++e3==d; // true, 2-е уловие проверяется, е2 увеличивается true || true = true
            boolean h2 = c<d & e2++ ==f; // false , 2-е уловие проверяется, е2 увеличивается false && false = false
            
            System.out.println(e2);
            System.out.println(e3);
            
            int x = 10;
            int y = 3;
            System.out.println(x&y);
            
            System.out.println(x|y);
            
            boolean b1 = true;
            boolean b2 = true;
            boolean b3 = true;
            boolean b4 = true;
            
            System.out.println(b1^b2^b3^b4);
            
            boolean b5 = false;
            boolean b6 = false;
            boolean b7 = false;
            boolean b8 = false;
            
            System.out.println(b5^b6^b7^b8);
            System.out.println(b1^b6^b7^b8);
            System.out.println(b1^b2^b7^b8);

    }
    
}
