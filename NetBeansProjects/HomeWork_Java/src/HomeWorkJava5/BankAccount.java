package HomeWorkJava5;

public class BankAccount {
    
    int id;
    String name;
    double balance; 
    
    double popolnenieScheta(double popolnenie){
    balance+=popolnenie;
    return balance;
    }
    
    double snyatiesoScheta(double snyatie){
    balance-=snyatie;
    return balance;
    }
       
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
            YourAccount.balance=22.00;
            
            HisAccount.id=3;
            HisAccount.name="Alex";
            HisAccount.balance=5.70;
            

            System.out.println(HisAccount.popolnenieScheta(30.11));
            System.out.println(YourAccount.snyatiesoScheta(11.5));        

    }
}