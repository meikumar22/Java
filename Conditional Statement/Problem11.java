import java.util.*;

public class Problem11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String orderType = scan.nextLine();
        String loyaltyStatus = scan.nextLine();
        double orderValue = scan.nextDouble();
        scan.nextLine();
        String timeSlot = scan.nextLine();

        System.out.println("Order Type : " + orderType);
        System.out.println("Loyalty Status : " + loyaltyStatus);
        System.out.println("Order Value : $" + orderValue);
        System.out.println("Time Slot : " + timeSlot);

        int discount = 0;
        int adjustment = 0;
        double service_fee = 0;
        double final_amount = 0;
        String priority = "";
        int prep_time = 0;

        if(loyaltyStatus.equals("Gold")){
            discount = 15;
        }
        else if(loyaltyStatus.equals("Silver")){
            discount = 10;
        }
        else if(loyaltyStatus.equals("Bronze")){
            discount = 5;
        }
        else if (loyaltyStatus.equals("None")){
            discount = 0;
        }

        if(timeSlot.equals("Peak")){
            adjustment = 0;
        }
        else if(timeSlot.equals("Regular")){
            adjustment = 0;
        }
        else if(timeSlot.equals("Late-Night")){
            adjustment = -5;
        }

        if(orderType.equals("Delivery")){
            service_fee = (orderValue/100) * 10;
        }
        else if(orderType.equals("Takeout")){
            service_fee = (orderValue/100) * 3;
        }
        else if(orderType.equals("Dine-In")){
            service_fee = (orderValue/100) * 0;
        }

        int total_discont = discount + adjustment;
        double discountedValue = orderValue * (1 - (total_discont/100.0));
        final_amount = discountedValue + service_fee;

        if(timeSlot.equals("Peak")){
            if(orderType.equals("Delivery")){
                priority = "High";
            } 
            else {
                priority = "Medium";
            }
        }
        else if(timeSlot.equals("Regular")){
            priority = "Medium";
        }
        else if(timeSlot.equals("Late-Night")){
            priority = "Low";
        }

        if(priority.equals("High")) {
            prep_time = 25;
            if(orderValue > 100) {
                prep_time += 5;  
            }
        }
        else if(priority.equals("Medium")) {
            prep_time = 20;
            if(orderValue > 100) {
                prep_time += 5;  
            }
        }
        else if(priority.equals("Low")) {
            prep_time = 15;
        }

        System.out.println("Base Discount : " + discount + '%');
        System.out.println("Time-Based Adjustment : " + adjustment + '%');
        System.out.println("Service Fee : $" + String.format("%.2f", service_fee));
        System.out.println("Final Amount : $" + final_amount);
        System.out.println("Kitchen Priority : " + priority);
        System.out.println("Estimated Prep Time : " + prep_time + "Minutes");
    }
}
