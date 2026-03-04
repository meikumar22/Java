import java.util.*;

public class Problem21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String locationZone = scan.nextLine();
        double parkingHours = scan.nextDouble();
        scan.nextLine();
        String vehicleType = scan.nextLine();
        String membershipStatus = scan.nextLine();

        System.out.println("Location Zone : " + locationZone);
        System.out.println("Parking Duration : " + parkingHours + " hours");
        System.out.println("Vehicle Type :  " + vehicleType);
        System.out.println("Membership Status : " + membershipStatus);

        double base_hourly = 5.0;
        int zone_premium = 0;
        double vehicle_size_surcharge = 0;
        int membership_discount = 0;
        double total_parking_fee = 0;
        String daily_cap_applied = "";
        double daily_cap = 0;
        String rate_category = "";

        if(locationZone.equals("Downtown"))zone_premium = 50;
        else if(locationZone.equals("Business-District"))zone_premium = 30;
        else if(locationZone.equals("Residential"))zone_premium = 0;
        else if(locationZone.equals("Airport"))zone_premium = 100;

        if(vehicleType.equals("Motorcycle"))vehicle_size_surcharge = -2;
        else if(vehicleType.equals("Compact"))vehicle_size_surcharge = 0;
        else if(vehicleType.equals("Sedan"))vehicle_size_surcharge = 0;
        else if(vehicleType.equals("SUV"))vehicle_size_surcharge = 3;
        else if(vehicleType.equals("Oversized"))vehicle_size_surcharge = 5;

        double raw_fee = 0;

        double hourly_rate = base_hourly * (1 + (zone_premium/100.0));
        raw_fee = (hourly_rate + vehicle_size_surcharge) * parkingHours;

        if(membershipStatus.equals("None"))membership_discount = 0;
        else if(membershipStatus.equals("Monthly"))membership_discount = 20;
        else if(membershipStatus.equals("Annual"))membership_discount = 25;
        else if(membershipStatus.equals("VIP"))membership_discount = 30;

        if(locationZone.equals("Downtown"))daily_cap = 150;
        else if(locationZone.equals("Business-District"))daily_cap = 120;
        else if(locationZone.equals("Residential"))daily_cap = 60;
        else if(locationZone.equals("Airport"))daily_cap = 180;

        total_parking_fee = raw_fee * (1 - membership_discount/100.0);

        if(parkingHours >= 24 && total_parking_fee > daily_cap){
            total_parking_fee = daily_cap;
            daily_cap_applied = "Yes";
        }
        else{
            daily_cap_applied = "No";
        }

        if(locationZone.equals("Downtown"))rate_category = "Premium";
        else if(locationZone.equals("Business-District"))rate_category = "Premium";
        else if(locationZone.equals("Residential"))rate_category = "Standard";
        else if(locationZone.equals("Airport"))rate_category = "Luxury";

        System.out.println("Base Hourly Rate : $" + String.format("%.1f", base_hourly));
        System.out.println("Zone Premium : " + zone_premium + '%');
        System.out.println("Vehicle Size Surcharge : $" + String.format("%.1f", vehicle_size_surcharge));
        System.out.println("Membership Discount : " + membership_discount + '%');
        System.out.println("Total Parking Fee : $" + String.format("%.1f", total_parking_fee));
        System.out.println("Daily Cap Applied : " + daily_cap_applied);
        System.out.println("Rate Category : " + rate_category);

        scan.close();
    }
}