import java.util.*;

public class Problem10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String timeOfDay = scan.nextLine();
        double powerConsumption = scan.nextDouble();
        double renewablePercentage = scan.nextDouble();
        scan.nextLine();
        String rateTier = scan.nextLine();

        System.out.println("Time of Day : " + timeOfDay);
        System.out.println("Power Consumption : " + powerConsumption + "kWh");
        System.out.println("Renewable Energy : " + renewablePercentage + '%');
        System.out.println("Rate Tier : " + rateTier);

        double baseRate = 0;
        double rateMultiplier = 0;
        double renewableCredit = 0;
        double totalCost = 0;
        String optimizationRecommendation = "";
        double potentialSavings = 0;

        if(rateTier.equals("Basic")){
            baseRate = 0.18;
        }
        else if(rateTier.equals("Time-of-Use")){
            baseRate = 0.15;
        }
        else if(rateTier.equals("Premium-Green")){
            baseRate = 0.12;
        }

        if(timeOfDay.equals("Peak")){
            if(renewablePercentage >= 60){
                rateMultiplier = 1.5;
            }
            else {
                rateMultiplier = 1.8;
            }
        }
        else if(timeOfDay.equals("Off-Peak")){
            if(renewablePercentage >= 30){
                rateMultiplier = 1.0;
            }
            else{
                rateMultiplier = 0.8;
            }
        }
        else if(timeOfDay.equals("Super-Off-Peak")){
            rateMultiplier = 0.6;
        }

        renewableCredit = (powerConsumption * renewablePercentage/100) * baseRate;
        totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;

        if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage < 30) {
            optimizationRecommendation = "Shift high-power appliances to Off-Peak hours";
            potentialSavings = powerConsumption * baseRate * (1.8 - 0.8);
        } else if (renewablePercentage >= 60) {
            optimizationRecommendation = "Excellent! Maximize appliance use during this period";
        } else if (rateTier.equalsIgnoreCase("Basic") && powerConsumption > 20) {
            optimizationRecommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = powerConsumption * 0.03;
        } else if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage >= 60) {
            optimizationRecommendation = "Great renewable usage! Minor peak reduction possible";
            potentialSavings = powerConsumption * baseRate * 0.2;
        } else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            optimizationRecommendation = "Good timing! Consider increasing renewable capacity";
        } else {
            optimizationRecommendation = "Energy usage is optimal";
        }

        System.out.println("Base Rate : " + baseRate + "/kWh");
        System.out.println("Rate Multiplier : " + rateMultiplier + 'x');
        System.out.println("Renewable Credit : " + '$' + String.format("%.2f", renewableCredit));
        System.out.println("Total Cost : " + '$' + String.format("%.2f", totalCost));
        System.out.println("Optimization Recommendation : " + optimizationRecommendation);
        System.out.println("Potential Savings : " + '$' + String.format("%.2f", potentialSavings));
    }
}
