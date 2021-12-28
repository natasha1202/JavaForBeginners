package Lesson14;

public class Test2 {
    
    public static void main(String[] args) {
        
        for(int i=1; i<11; i++){
            System.out.println(i);
        }
        
        int j=1;
        
        for( ; j<11; j++){
            System.out.println(j);
        }
        
        for(int k=1, l=2, m=10; k<11; k++, l++, m=m+20){
            System.out.println(k);
        }
        
        for(j=5 ; j<11 && j > -3 || j > 4; j++){
            System.out.println(j);
        }
        
        for(int i=5; i<11; i++, abc(10)){
            System.out.println(i);
        }
        
        for(int i=5; i<11; i++){
            System.out.println(i);
            abc(10);
        }
        
        for(int i=5; i<11; ){
            System.out.println(i);
            i++;
        }
             
        
    }
    
     static void abc(int n){
         System.out.println(n);
    }
    
}
