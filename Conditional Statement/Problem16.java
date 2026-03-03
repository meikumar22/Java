import java.util.*;

public class Problem16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String room_category = scan.nextLine();
        String season = scan.nextLine();
        int nights_booked = scan.nextInt();
        scan.nextLine();
        String loyalty_tier = scan.nextLine();

        System.out.println("Room Category : " + room_category);
        System.out.println("Season : " + season);
        System.out.println("Nights Booked : " + nights_booked);
        System.out.println("Loyalty Tier : " + loyalty_tier);

        double base_rate = 0;
        double multipiler = 0;
        int stay_discount = 0;
        int loyalty_discount = 0;
        double nightly_rate = 0;
        double total_booking = 0;
        String upgrades = "";

        if(room_category.equals("Standard"))base_rate = 150;
        else if(room_category.equals("Deluxe"))base_rate = 300;
        else if(room_category.equals("Suite"))base_rate = 500;
        else if(room_category.equals("Presidential"))base_rate = 1000;

        if(season.equals("Off-Peak"))multipiler = 0.7;
        else if(season.equals("Regular"))multipiler = 1.0;
        else if(season.equals("Peak"))multipiler = 1.5;
        else if(season.equals("Holiday"))multipiler = 2.0;

        if(nights_booked >= 1 && nights_booked < 5)stay_discount = 0;
        else if(nights_booked >= 5 && nights_booked <= 7)stay_discount = 5;
        else if(nights_booked >= 8 && nights_booked <= 14)stay_discount = 10;
        else if(nights_booked >= 15)stay_discount = 20;

        if(loyalty_tier.equals("None"))loyalty_discount = 0;
        else if(loyalty_tier.equals("Member"))loyalty_discount = 10;
        else if(loyalty_tier.equals("Gold"))loyalty_discount = 15;
        else if(loyalty_tier.equals("Platinum"))loyalty_discount = 20;

        double seasonal_rate = base_rate * multipiler;
        nightly_rate = seasonal_rate * (1 - (stay_discount/100.0)) * (1 - (loyalty_discount/100.0));
        total_booking = nightly_rate * nights_booked;

        if(room_category.equals("Standard")){
            if(loyalty_tier.equals("None"))upgrades = "None";
        }
        else if(room_category.equals("Deluxe")){
            if(loyalty_tier.equals("None"))upgrades = "None";
            else if(loyalty_tier.equals("Gold"))upgrades = "Free breakfast and spa access";
        }
        else if(room_category.equals("Suite")){
            if(loyalty_tier.equals("None"))upgrades = "None";
            else if(loyalty_tier.equals("Member"))upgrades = "Free breakfast";
        }
        else if(room_category.equals("Presidential")){
            if(loyalty_tier.equals("None"))upgrades = "None";
            else if(loyalty_tier.equals("Member"))upgrades = "Free breakfast";
            else if(loyalty_tier.equals("Platinum"))upgrades = "Concierge service, airport transfer, and fine dining";
        }
        
            System.out.println("Base Rate Per Night : $" + String.format("%.1f", base_rate));
            System.out.println("Seasonal Multiplier : " + multipiler + 'x');
            System.out.println("Extended Stay Discount : " + stay_discount + '%');
            System.out.println("Loyalty Discount : " + loyalty_discount + '%');
            System.out.println("Nightly Rate : $" + String.format("%.2f", nightly_rate));
            System.out.println("Total Booking Cost : $" + String.format("%.2f", total_booking));
            System.out.println("Complimentary Upgrades : " + upgrades);

            scan.close();

    }
}
