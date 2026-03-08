import java.util.*;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double totalDeposit = 0;
        double totalWithdrawal = 0;
        double totalTransfer = 0;
        double totalPayment = 0;

        for(int i=1;i<=n;i++){
            String transactionType = sc.next();
            double amount = sc.nextDouble();
            String Categorize="";
            if(transactionType.equals("Deposit")){
                Categorize="Credit";
                totalDeposit+=amount;
            }
            else{
                Categorize="Withdrawal";
                if(transactionType.equals("Withdrawal")){
                    totalWithdrawal+=amount;
                }
                if(transactionType.equals("Transfer")){
                    totalTransfer+=amount;
                }
                if(transactionType.equals("Payment")){
                    totalPayment+=amount;
                }
            }
            System.out.println();
            System.out.println("Transaction "+i+": "+transactionType);
            System.out.println("Amount: $"+amount);
            System.out.println("Category: "+Categorize);
        }
        double netBalance=totalDeposit-totalTransfer-totalWithdrawal-totalPayment;
        System.out.println();
        System.out.println("Total Transactions: "+n);
        System.out.println("Total Deposits: $"+totalDeposit);
        System.out.println("Total Withdrawals: $"+totalWithdrawal);
        System.out.println("Total Transfers: $"+totalTransfer);
        System.out.println("Total Payments: $"+totalPayment);
        System.out.println("Net Balance Change: $"+netBalance);
        sc.close();
    }
}
