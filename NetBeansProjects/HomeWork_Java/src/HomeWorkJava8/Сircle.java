package HomeWorkJava8;

public class Сircle {
    public final static double Pi=3.14;
    public double r;
    
    double square (double r1){
        double s = Pi*r1*r1;
        return s;
    }
            
    static double length (double r2){
        double l = 2*Pi*r2;
        return l;
    }
    
    void info (double r3){
        System.out.println("R = " +r3);
        r3=r;
        double sq = square(r);
        System.out.println("S = " + sq);
        System.out.println("P = " + length(r3));
        
    }
}

class CircleTest{
    public static void main(String[] args) {
        Сircle ci = new Сircle();
        ci.r=10;
        ci.square(ci.r);
        Сircle.length(ci.r);
        ci.info(ci.r);
        
    }
   
    
    
}
