import java.util.*;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int creditlimit = scan.nextInt();
        int purchase_amount = scan.nextInt();
        System.out.print("Enter 0 or 1 : ");
        int cardblocked = scan.nextInt();

        if(purchase_amount<=creditlimit){
            if(cardblocked==0){
                System.out.println("Approved");
            }
            else if(cardblocked==1){
                System.out.println("Declined");
            }
            else{
                System.out.println("Enter valid card number");
            }
        }
        else{
            System.out.println("Declined");
        }
        
    }
}

