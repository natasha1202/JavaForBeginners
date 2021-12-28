package Lesson15;

public class Test7 {
    
    public static void main(String[] args) {
        
        int money = 100;
        
        do{
            System.out.println("faites votre jeu");
            System.out.println("You've lose");
            money = money - 10;
        }
        while(money>50);
        
    }
 
    
}
