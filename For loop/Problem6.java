import java.util.*;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double initialBalance = scan.nextDouble();
        int n = scan.nextInt();
        double withdrawalAmount;

        String status = "";
        double remaining_balance = initialBalance;

        int total_transactions = n;

        double sum = 0;
        int count = 0;
        int count1 = 0;

        for(int i=1; i<=n; i++){
            withdrawalAmount = scan.nextDouble();

            if(withdrawalAmount <= remaining_balance){
                remaining_balance = remaining_balance - withdrawalAmount;
                status = "Approved";
                sum = sum + withdrawalAmount;
                count++;
            }
            else {
                status = "Denied";
                count1++;
            }

            System.out.println("");
            System.out.println("Transaction " + i + " : $" + String.format("%.1f", withdrawalAmount));
            System.out.println("Status : " + status);
            if(status.equals("Denied")){
                System.out.println("Reason: Insufficient funds");
            }
            System.out.println("Remaining Balance : $" + remaining_balance);
            System.out.println("");

        }

        System.out.println("Total Transactions : " + total_transactions);
        System.out.println("Successful Withdrawals : " + count);
        System.out.println("Failed Withdrawals : " + count1);
        System.out.println("Final Balance : $" + remaining_balance);
        System.out.println("Total Withdrawn : $" + sum);

        scan.close();

    }
}
