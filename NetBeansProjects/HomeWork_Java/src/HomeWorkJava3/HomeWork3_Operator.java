
package HomeWorkJava3;

public class HomeWork3_Operator {
    
        public static void main(String[] args) {
        
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2/d1 + d2%i2 - l;
        System.out.println(result);
        
        int a = 5;
        int b = 8;
        
        int aa = a-- - -- a + ++a + a++ +a;
        int bb = ++b - b++ + ++b - --b;
        System.out.println(aa);
        System.out.println(bb);

    }
    
}
