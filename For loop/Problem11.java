import java.util.*;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double originalTotal = 0.0;
        double finalTotal = 0.0;

        for (int i = 1; i <= N; i++) {

            String seatType = sc.next();
            String customerType = sc.next();

            double basePrice = 0.0;
            int discountPercent = 0;

            if (seatType.equals("Regular")) {
                basePrice = 12.0;
            } else if (seatType.equals("Premium")) {
                basePrice = 18.0;
            } else if (seatType.equals("Recliner")) {
                basePrice = 25.0;
            }

            if (customerType.equals("Child")) {
                discountPercent = 30;
            } else if (customerType.equals("Senior")) {
                discountPercent = 25;
            } else {
                discountPercent = 0;
            }

            double discountAmount = basePrice * discountPercent / 100.0;
            double finalPrice = basePrice - discountAmount;

            originalTotal += basePrice;
            finalTotal += finalPrice;

            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);
            System.out.println("Base Price: $" + basePrice);
            System.out.println("Discount: " + discountPercent + "%");
            System.out.println("Final Price: $" + finalPrice);
            System.out.println();
        }

        boolean groupDiscountApplied = false;

        if (N >= 5) {
            double groupDiscount = finalTotal * 0.10;
            finalTotal = finalTotal - groupDiscount;
            groupDiscountApplied = true;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("Total Tickets: " + N);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" +String.format("%.2f", totalDiscount));
        System.out.println("Final Total: $" +String.format("%.2f", finalTotal) );
        System.out.println("Group Discount Applied: " + (groupDiscountApplied ? "Yes" : "No"));

        sc.close();
    }
}