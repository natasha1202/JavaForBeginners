package HomeWorkJava8;


public class Umnozhenie {
    
    static int multiply (int a, int b, int c){
        int m = a*b*c;
        return m;
    }
    
    static void divide (int d, int e){
        int ch = d/e;
        int o = d%e;
        System.out.println("Частное = " + ch);
        System.out.println("Остаток = " + o);
    }
}

class Umnozhenietest {
    public static void main(String[] args) {
        System.out.println(Umnozhenie.multiply(3,4,5));
        Umnozhenie.divide(5, 3);
        int p = Umnozhenie.multiply(3,4,5);
        System.out.println(p);
        Umnozhenie.divide(10, 7);
            
    }
}