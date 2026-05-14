import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        int withdraw = scan.nextInt();

        int amount = balance;

        if(balance > withdraw){
            System.out.println("Transaction Successfully");
            amount = balance - withdraw;
            System.out.println("balance : " + amount);
        }
        else{
            System.out.println("Failed");
        }
        
        if (withdraw > balance) {
            System.out.println("Not enough amount");
            System.out.println("balance : " + amount);
        } 
        
    }
    
}
