import java.util.*;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String booking_class = scan.nextLine();
        int days = scan.nextInt();
        double seats = scan.nextDouble();
        scan.nextLine();
        String route_type = scan.nextLine();

        double price = 0;
        double demand_multiplier = 0;
        double final_price = 0;
        String pricing_category = "";

        System.out.println("Booking Class : " + booking_class);
        System.out.println("Days Until Departure : " + days);
        System.out.println("Seat Availability : " + seats + '%');
        System.out.println("Route Type : " + route_type);

        if(booking_class.equals("Economy")){
            if(route_type.equals("Domestic")){
                price = 200;
            }
            else if(route_type.equals("International-Short")){
                price = 500;
            }
            else if(route_type.equals("International-Long")){
                price = 800;
            }
        }
        else if(booking_class.equals("Business")){
            if(route_type.equals("Domestic")){
                price = 600;
            }
            else if(route_type.equals("International-Short")){
                price = 1500;
            }
            else if(route_type.equals("International-Long")){
                price = 2500;
            }
        }
        else if(booking_class.equals("First")){
            if(route_type.equals("Domestic")){
                price = 1000;
            }
            else if(route_type.equals("International-Short")){
                price = 3000;
            }
            else if(route_type.equals("International-Long")){
                price = 5000;
            }
        }

        if(seats < 30.0 && days < 14){
            demand_multiplier = 1.8;
            pricing_category = "High Demand";
        }
        else if(seats < 50.0 && days < 30){
            demand_multiplier = 1.5;
            pricing_category = "HIgh Demand";
        }
        else if(seats < 60.0 || days > 30 && days <60){
            demand_multiplier = 1.0;
            pricing_category = "Moderate";
        }
        else if(seats >= 60.0 && days >60){
            demand_multiplier = 0.8;
            pricing_category = "Low Demand";
        }

        final_price = price * demand_multiplier;

        System.out.println("Base Price : " + '$' + price);
        System.out.println("Demand Multiplier : " + demand_multiplier + 'x');
        System.out.println("Final Ticket Price : " + '$' + final_price);
        System.out.println("Pricing Category : " + pricing_category);

    }
}
