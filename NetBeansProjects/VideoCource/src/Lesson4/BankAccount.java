package Lesson4;

public class BankAccount {
    
    int id;
    String name;
    double balance; 
       
}

class BankAccountTest{
    
    public static void main(String[] args) {  

            BankAccount bA = new BankAccount();
            BankAccount MyAccount = new BankAccount();
            BankAccount YourAccount = new BankAccount();
            BankAccount HisAccount = new BankAccount();
        
            MyAccount.id=1;
            MyAccount.name="Zaur";
            MyAccount.balance=12.35;
            
            YourAccount.id=2;
            YourAccount.name="Mike";
            YourAccount.balance=2.00;
            
            System.out.println(MyAccount.name);
            System.out.println(YourAccount.name);
            System.out.println(HisAccount.balance);
            System.out.println(HisAccount.id);
            System.out.println(HisAccount.name);
    }
}