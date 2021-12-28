package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args){
        
        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;
        
        short s1 = 5;
        short s2 = -10;
        short s3 = 0;
        
        int i1 = 500;
        
        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 51l; // L маленькая
        
        float f1 = 3.14f;
        float f2 = 2.5F;
        float f3 = 20;
        float f4 = 20.0f;
        
        double d1 = 5.5;
        double d2 = 87.65;
        
        char c1 = 'a'; // всегда только один символ и только в одинарных кавычках
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';
        
        char c5 = 300; // значение 300-го символа в юникоде, 10-ричная система исчисления
        
        char c6 = '\u0300'; // порядковый номер символа из юникода, цифр должно быть 4, 16-ричная система исчисления
        char c7 = '\u03AB';
        
        boolean bool1 = true;
        boolean bool2 = false;
        
        int a1 = 60;
        int a2 = 0B111100; // двоичная система счисления, ставим 0B в начале
        int a3 = 0b111100; // двоичная система счисления
        int a4 = 074; // восьмеричная система счисления, ставим ноль в начале
        int a5 = 0x3C; // 16-ричная система, ставится 0x в начале
        int a6 = 0X3c;
        
        int a7 = 1_000_000; //подчеркивание используется для удобства записи, позволяет визуально делить числа на разряды. подчеркивание не оторажается в консоли
        
        System.out.println("b1");
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(c2);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(a3); //число все равно выводится в 10-ричной системе
        System.out.println(a4); //число все равно выводится в 10-ричной системе
        System.out.println(a5); //число все равно выводится в 10-ричной системе
    }
}
