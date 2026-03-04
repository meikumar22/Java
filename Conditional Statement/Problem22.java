import java.util.*;

public class Problem22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int units = scan.nextInt();
        scan.nextLine();
        String type = scan.nextLine();
        String season = scan.nextLine();
        String payment = scan.nextLine();

        System.out.println("Units Consumed: " + units + " kWh");
        System.out.println("Customer Type: " + type);
        System.out.println("Season: " + season);
        System.out.println("Payment Method: " + payment);

        double t1=0,t2=0,t3=0,t4=0;

        if(type.equals("Residential"))
        {
            if(units>0)
                t1 = Math.min(units,100)*0.10;

            if(units>100)
                t2 = Math.min(units-100,200)*0.15;

            if(units>300)
                t3 = Math.min(units-300,200)*0.25;

            if(units>500)
                t4 = (units-500)*0.35;
        }

        else if(type.equals("Commercial"))
        {
            if(units>0)
                t1 = Math.min(units,100)*0.12;

            if(units>100)
                t2 = Math.min(units-100,200)*0.18;

            if(units>300)
                t3 = Math.min(units-300,200)*0.25;

            if(units>500)
                t4 = (units-500)*0.35;
        }

        else if(type.equals("Industrial"))
        {
            if(units>0)
                t1 = Math.min(units,100)*0.08;

            if(units>100)
                t2 = Math.min(units-100,200)*0.12;

            if(units>300)
                t3 = Math.min(units-300,200)*0.20;

            if(units>500)
                t4 = (units-500)*0.20;
        }

        double total = t1+t2+t3+t4;

        int seasonal = 0;

        if(season.equals("Summer")) seasonal=15;
        else if(season.equals("Winter")) seasonal=-10;
        else seasonal=0;

        total = total*(1+seasonal/100.0);

        int discount = 0;

        if(payment.equals("Auto-Pay")) discount=5;
        else if(payment.equals("Online")) discount=3;
        else discount=0;

        total = total*(1-discount/100.0);

        double avg = total/units;

        System.out.println("Tier 1 Cost (0-100): $" + String.format("%.1f",t1));
        System.out.println("Tier 2 Cost (101-300): $" + String.format("%.1f",t2));
        System.out.println("Tier 3 Cost (301-500): $" + String.format("%.1f",t3));
        System.out.println("Tier 4 Cost (501+): $" + String.format("%.1f",t4));
        System.out.println("Seasonal Adjustment: " + seasonal + "%");
        System.out.println("Payment Discount: " + discount + "%");
        System.out.println("Total Bill: $" + String.format("%.2f",total));
        System.out.println("Average Rate: $" + String.format("%.2f",avg) + "/kWh");

        scan.close();
    }
}