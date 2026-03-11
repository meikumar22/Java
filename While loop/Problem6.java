import java.util.*;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        int amount;

        int i=0;
        do{
            System.out.print("Enter withdrawal amount : ");
            amount = scan.nextInt();

            if(balance >= amount){
                balance = balance - amount;
                System.out.println("Withdrawal successful! Remaining balance : " + balance);
            }
            else if (balance < amount){
                System.out.println("Insufficient funds! Try again.");
            }

            i++;
        }
        while (balance > 0);
    }
}
