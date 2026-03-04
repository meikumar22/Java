import java.util.*;

public class Problem25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double dataGB = scan.nextDouble();
        int callMinutes = scan.nextInt();
        scan.nextLine();
        String international = scan.nextLine();
        String device = scan.nextLine();

        String plan = "";
        String category = "";
        double baseCost = 0;

        double dataOverage = 0;
        double callOverage = 0;
        double internationalFee = 0;
        double deviceFee = 0;
        double savings = 0;

        if(dataGB <= 2 && callMinutes <= 500){
            plan = "Basic 2GB";
            baseCost = 25;
            category = "Budget";
        }
        else if(dataGB <= 5){
            plan = "Standard 5GB";
            baseCost = 40;
            category = "Standard";
        }
        else if(dataGB <= 25){
            plan = "Premium Unlimited";
            baseCost = 70;
            category = "Premium";
        }
        else{
            plan = "Unlimited Max";
            baseCost = 90;
            category = "Unlimited";
        }

        if(plan.equals("Basic 2GB")){
            if(dataGB > 2)
                dataOverage = (dataGB - 2) * 10;
        }

        if(plan.equals("Standard 5GB")){
            if(dataGB > 5)
                dataOverage = (dataGB - 5) * 10;
        }

        if(plan.equals("Basic 2GB")){
            if(callMinutes > 500)
                callOverage = (callMinutes - 500) * 0.05;
        }

        if(international.equals("Light"))
            internationalFee = 5;
        else if(international.equals("Moderate"))
            internationalFee = 15;
        else if(international.equals("Heavy"))
            internationalFee = 30;

        if(device.equals("Smartphone"))
            deviceFee = 10;
        else if(device.equals("Tablet"))
            deviceFee = 10;
        else if(device.equals("Hotspot"))
            deviceFee = 20;

        double totalCost = baseCost + dataOverage + callOverage + internationalFee + deviceFee;

        if(plan.equals("Standard 5GB"))
            savings = 5;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + callMinutes + " minutes");
        System.out.println("International Usage: " + international);
        System.out.println("Device Type: " + device);
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOverage);
        System.out.println("Call Overage: $" + callOverage);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + totalCost);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);

        scan.close();
    }
}