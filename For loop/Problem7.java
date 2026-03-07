import java.util.*;

public class Problem7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String consumerID;
        int unitsConsumed;

        double bill_amount = 0;
        String category = "";

        int total_consumers = n;
        int total_units_consumed = 0;
        double total_revenue = 0;
        double average_bill = 0;

        for(int i=0; i<n; i++){
            consumerID = scan.next();
            unitsConsumed = scan.nextInt();

            if(unitsConsumed >= 0 && unitsConsumed <= 100)bill_amount = 0.10 * unitsConsumed;
            else if(unitsConsumed >= 101 && unitsConsumed <= 200)bill_amount = 0.13 * unitsConsumed;
            else if(unitsConsumed >= 201 && unitsConsumed <= 300)bill_amount = 0.16 * unitsConsumed;
            else if(unitsConsumed > 300)bill_amount = 0.20 * unitsConsumed;

            if(unitsConsumed <= 200)category = "Low Usage";
            else if(unitsConsumed >= 201 && unitsConsumed <= 300)category = "Medium Usage";
            else if(unitsConsumed > 300)category = "High Usage";

            total_units_consumed = total_units_consumed + unitsConsumed;

            total_revenue = total_revenue + bill_amount;

            System.out.println("");
            System.out.println("Consumer ID : " + consumerID);
            System.out.println("Units Consumed : " + unitsConsumed);
            System.out.println("Bill Amount : $" + String.format("%.2f", bill_amount));
            System.out.println("Category : " + category);
            System.out.println("");
        }
        
        average_bill = total_revenue/n;

        System.out.println("Total Consumers : " + total_consumers);
        System.out.println("Total Units Consumed : " + total_units_consumed);
        System.out.println("Total Revenue : $" + String.format("%.2f", total_revenue));
        System.out.println("Average Bill : $" + String.format("%.2f", average_bill));

        scan.close();

    }
}
