package Lesson3;

public class Test8 {
    
        public static void main(String[] args) {
        
        int a = 10;
        int b = 3;
        int a1 = 10;
        
        int c = ++a - b*2; // 11 - 6 = 5
        int c2 = (++a - b)*2; // (11 - 3)*2 = 16
        int c3 = (a1-- - b)*2; // (10 - 3)*2 = 14
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        
        char ch = 'a'; // у буквы есть порядковый номер в таблице символов, именно с этим номером и выполняются арифметические операции
        int n = 10;
        int i2 = c;
        System.out.println(n + ch);
        
        boolean bool1 = false;
        boolean bool2 = bool1==true;
        System.out.println(bool2);
        boolean bool3 = bool1=true;
        System.out.println(bool3);
       
    }
    
}
