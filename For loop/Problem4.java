import java.util.*;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String repname = "";
        double salesamount = 0;

        String slaes_rep = "";
        double sales_amount = 0;
        int commission_rate = 0;
        double commission_earned = 0;
        double bonus = 0;
        double total_payout = 0;

        int total_slaes_rep = n;
        double total_slaes = 0;
        double total_commissions = 0;
        String top_performer = "";

        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        for(int i=0; i<n; i++){
            repname = scan.next();
            salesamount = scan.nextDouble();

            if(salesamount > 0 && salesamount <= 40000)commission_rate = 5;
            else if(salesamount >= 40001 && salesamount <= 80000)commission_rate = 8;
            else if(salesamount >= 80001 && salesamount <= 100000)commission_rate = 10;
            else if(salesamount >= 100001 && salesamount <= 150000)commission_rate = 12;
            else if(salesamount > 150000)commission_rate = 15;

            commission_earned = (salesamount *commission_rate)/100.0;

            if(salesamount >= 150000)bonus = 2000;
            else if(salesamount >= 100000)bonus = 3000;
            else{
                bonus = 0;
            }

            total_payout = commission_earned + bonus;

            if(sum < salesamount){
                sum = sum + salesamount;
                top_performer = repname;
            }

            sum1 = sum1 + commission_earned;
            sum2 = sum2 + salesamount;


            System.out.println("");
            System.out.println("Sales Rep : " + repname);
            System.out.println("Sales Amount : $" + String.format("%.1f", salesamount));
            System.out.println("Commission Rate : " + commission_rate + '%');
            System.out.println("Commission Earned : $" + String.format("%.1f", commission_earned));
            System.out.println("Bonus : $" + String.format("%.1f", bonus));
            System.out.println("Total Payout : $" + String.format("%.1f", total_payout));
            System.out.println("");
        }

        total_slaes = sum2;
        total_commissions = sum1;

        System.out.println("Total Sales Reps : " + total_slaes_rep);
        System.out.println("Total Sales : $" + String.format("%.1f", total_slaes));
        System.out.println("Total Commissions : $" + String.format("%.1f", total_commissions));
        System.out.println("Top Performer : " + top_performer);

        scan.close();
    }
}
