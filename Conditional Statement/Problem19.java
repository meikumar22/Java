import java.util.*;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String movieFormat = scan.nextLine();
        String showTime = scan.nextLine();
        String seatCategory = scan.nextLine();
        String customerType = scan.nextLine();

        System.out.println("Movie Format: " + movieFormat);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seat Category: " + seatCategory);
        System.out.println("Customer Type: " + customerType);

        double basePrice = 12.0;
        double formatSurcharge = 0;
        double seatUpgrade = 0;
        int timeAdjustment = 0;
        int customerDiscount = 0;

        double finalPrice;

        if(movieFormat.equals("2D"))
            formatSurcharge = 0;
        else if(movieFormat.equals("3D"))
            formatSurcharge = 5;
        else if(movieFormat.equals("IMAX"))
            formatSurcharge = 8;
        else if(movieFormat.equals("4DX"))
            formatSurcharge = 10;

        if(seatCategory.equals("Standard"))
            seatUpgrade = 0;
        else if(seatCategory.equals("Premium"))
            seatUpgrade = 4;
        else if(seatCategory.equals("Recliner"))
            seatUpgrade = 7;

        if(showTime.equals("Matinee"))
            timeAdjustment = -30;
        else if(showTime.equals("Evening"))
            timeAdjustment = 0;
        else if(showTime.equals("Prime-Time"))
            timeAdjustment = 20;
        else if(showTime.equals("Late-Night"))
            timeAdjustment = -20;

        if(customerType.equals("Adult"))
            customerDiscount = 0;
        else if(customerType.equals("Senior"))
            customerDiscount = 25;
        else if(customerType.equals("Student"))
            customerDiscount = 15;
        else if(customerType.equals("Child"))
            customerDiscount = 30;

        double baseWithSurcharge = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharge * (1 + timeAdjustment / 100.0);
        finalPrice = adjustedPrice * (1 - customerDiscount / 100.0);

        String voucher = "No";
        if(showTime.equals("Matinee") || 
           customerType.equals("Student") || 
           customerType.equals("Child"))
            voucher = "Yes";

        String category = "";
        if(finalPrice < 10)
            category = "Value";
        else if(finalPrice < 25)
            category = "Premium";
        else
            category = "Luxury";

        System.out.println("Base Ticket Price: $" + basePrice);
        System.out.println("Format Surcharge: $" + formatSurcharge);
        System.out.println("Seat Upgrade Fee: $" + seatUpgrade);
        System.out.println("Time-Based Adjustment: " + timeAdjustment + "%");
        System.out.println("Customer Discount: " + customerDiscount + "%");
        System.out.println("Final Ticket Price: $" + String.format("%.2f", finalPrice));
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + category);

        scan.close();
    }
}