import java.util.*;

public class Problem18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double package_weight = scan.nextDouble();
        scan.nextLine();
        String destination_zone = scan.nextLine();
        String shipping_speed = scan.nextLine();
        String package_size = scan.nextLine();

        System.out.println("Package Weight : " + package_weight + " lbs");
        System.out.println("Destination Zone : " + destination_zone);
        System.out.println("Shipping Speed : " + shipping_speed);
        System.out.println("Package Size : " + package_size);

        double base_rate = 0;
        double surcharge = 0;
        double multipiler = 0;
        double size_surcharge = 0;
        double total_cost = 0;
        String service_level = "";

        if(shipping_speed.equals("Economy"))base_rate = 5;
        else if(shipping_speed.equals("Standard"))base_rate = 10;
        else if(shipping_speed.equals("Express"))base_rate = 25;
        else if(shipping_speed.equals("Overnight"))base_rate = 50;

        if(package_weight > 15.0){
            surcharge = package_weight * 2;
        }
        else {
            surcharge = package_weight * 1;
        }

        if(destination_zone.equals("Local"))multipiler = 1.0;
        else if(destination_zone.equals("Regional"))multipiler = 1.2;
        else if(destination_zone.equals("National"))multipiler = 1.5;
        else if(destination_zone.equals("International"))multipiler = 3.0;

        if(package_size.equals(" Small"))size_surcharge = 0;
        else if(package_size.equals("Medium"))size_surcharge = 5;
        else if(package_size.equals("Large"))size_surcharge = 15;
        else if(package_size.equals("Oversized"))size_surcharge = 30;

        double base_cost = (base_rate + surcharge) * multipiler;
        total_cost = base_cost + size_surcharge;

        int deliveryDays = 0;

        if(shipping_speed.equals("Economy")){
            if(destination_zone.equals("Local"))
                deliveryDays = 4;         
            else if(destination_zone.equals("Regional"))
                deliveryDays = 6;         
            else if(destination_zone.equals("National"))
                deliveryDays = 8;         
            else if(destination_zone.equals("International"))
                deliveryDays = 17;         
        }
        else if(shipping_speed.equals("Standard")){
            if(destination_zone.equals("Local"))
                deliveryDays = 2;        
            else if(destination_zone.equals("Regional"))
                deliveryDays = 4;         
            else if(destination_zone.equals("National"))
                deliveryDays = 6;       
            else if(destination_zone.equals("International"))
                deliveryDays = 12;       
        }
        else if(shipping_speed.equals("Express")){
            if(destination_zone.equals("Local"))
                deliveryDays = 1;
            else if(destination_zone.equals("Regional"))
                deliveryDays = 2;        
            else if (destination_zone.equals("National"))
                deliveryDays = 2;        
            else if (destination_zone.equals("International"))
                deliveryDays = 4;  
        }
        else if(shipping_speed.equals("Overnight")){
            deliveryDays = 1;            
        }

        if(shipping_speed.equals("Economy"))service_level = "Budget";
        else if(shipping_speed.equals("Standard"))service_level = "Standard";
        else if(shipping_speed.equals("Express"))service_level = "Priority";
        else if(shipping_speed.equals("Overnight"))service_level = "Premium";

        System.out.println("Base Shipping Rate : $" + String.format("%.1f", base_rate));
        System.out.println("Weight Surcharge : $" + String.format("%.1f", surcharge));
        System.out.println("Zone Multiplier : " + multipiler + 'x');
        System.out.println("Size Surcharge : $" + String.format("%.1f", size_surcharge));
        System.out.println("Total Shipping Cost : $" + String.format("%.1f", total_cost));
        System.out.println("Estimated Delivery : " + deliveryDays + " business days");
        System.out.println("Service Level : " + service_level);

        scan.close();

    }
}
