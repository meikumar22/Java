import java.util.*;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double totalRevenue=0;
        double totaldistance=0;
        for(int i=1;i<=n;i++){
            double distanceKM= sc.nextDouble();
            String timeOfDay = sc.next();
            double baseFare=3;
            double distanceCharge=1*distanceKM;
            double surcharges=0;
            totaldistance+=distanceKM;

            if(timeOfDay.equals("Morning")||timeOfDay.equals("Afternoon")){
                surcharges=0;
            }
            else if(timeOfDay.equals("Evening")){
                surcharges=3;
            }
            else if(timeOfDay.equals("Night")){
                surcharges=5;
            }

            double totalFare = baseFare+distanceCharge+surcharges;
            totalRevenue+=totalFare;
            System.out.println();
            System.out.println("Ride "+i);
            System.out.println("Distance: "+distanceKM+" km");
            System.out.println("Time: "+timeOfDay);
            System.out.println("Base Fare: $"+baseFare);
            System.out.println("Distance Charge: $"+distanceCharge);
            System.out.println("Time Surcharge: $"+surcharges);
            System.out.println("Total Fare: $"+totalFare);
        }
        double avg = totalRevenue/n;
        System.out.println();
        System.out.println("Total Rides: "+n);
        System.out.println("Total Distance: "+totaldistance+" km");
        System.out.println("Total Revenue: $"+totalRevenue);
        System.out.printf("Average Fare: $%.2f",avg);
    }
    
}