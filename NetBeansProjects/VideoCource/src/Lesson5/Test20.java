package Lesson5;

public class Test20 {
    
        int summa (int a, int b, int c){
            int result = a+b+c;
            return result;
        }
        
        int sredneeArifmetichesloe(int a1, int b1, int c1){
            int result2 = summa(a1, b1, c1)/3;
            return result2;
        }
    
}

class Test21 {
        public static void main(String[] args) {                 
        
            Test20 t = new Test20();
            int summaTrehChisel = t.summa(1,2,3);
           // t.summa(1,2,3)
            System.out.println(summaTrehChisel);
            System.out.println(t.summa(5,10,15));
            
            System.out.println(t.sredneeArifmetichesloe(20,40,60));
        }
}