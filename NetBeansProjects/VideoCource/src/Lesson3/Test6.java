
package Lesson3;

public class Test6 {
        public static void main(String[] args) {
        
            int a=3;
            int b=5;
            int c=5;
            
            boolean b1 = a>b;
            boolean b2 = b<=c;
            boolean b3 = a==b;
            boolean b4 = c==b;
            boolean b5 = c!=b;
            
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println(c=b);
            System.out.println(b5);
            
            
            boolean x = true;
            boolean y = false;
            boolean z = true;
            boolean y2 = true;
            
            boolean result1 = x&&y&&z;
            boolean result2 = x&&y2&&z;
            boolean result3 = x||y||z;
            
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
    }
}
