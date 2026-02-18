import java.util.*;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int balance = scan.nextInt();
        int withdrawal = scan.nextInt();
        int dailylimit = scan.nextInt();

        if(balance>=withdrawal && dailylimit>=withdrawal){
            System.out.println("Transaction Approved");
        }
        else{
            System.out.print("Transaction Declined");
        }
    }
}
