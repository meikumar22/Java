import java.util.*;

public class Problem23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stock = scan.nextInt();
        int years = scan.nextInt();
        scan.nextLine();
        String tolerance = scan.nextLine();
        String volatility = scan.nextLine();

        int bonds = 100 - stock;

        int riskScore = stock;

        if(years >= 1 && years <= 5 && stock > 50)
            riskScore += 20;
        else if(years >= 6 && years <= 10 && stock > 60)
            riskScore += 10;
        else if(years >= 11 && years <= 20 && stock > 80)
            riskScore += 5;

        if(volatility.equals("Medium"))
            riskScore += 10;
        else if(volatility.equals("High"))
            riskScore += 20;

        if(riskScore > 95)
            riskScore = 95;

        String category = "";

        if(riskScore <= 30)
            category = "Low";
        else if(riskScore <= 60)
            category = "Moderate";
        else if(riskScore <= 80)
            category = "High";
        else
            category = "Very High";

        String alignment = "";

        if(tolerance.equals("Conservative")){
            if(category.equals("Low"))
                alignment = "Well Aligned";
            else if(category.equals("Moderate"))
                alignment = "Acceptable";
            else
                alignment = "Misaligned";
        }
        else if(tolerance.equals("Moderate")){
            if(category.equals("Moderate"))
                alignment = "Well Aligned";
            else if(category.equals("Low") || category.equals("High"))
                alignment = "Acceptable";
            else
                alignment = "Misaligned";
        }
        else if(tolerance.equals("Aggressive")){
            if(category.equals("High") || category.equals("Very High"))
                alignment = "Well Aligned";
            else if(category.equals("Moderate"))
                alignment = "Acceptable";
            else
                alignment = "Misaligned";
        }

        String rec = "";
        String reb = "";

        if(alignment.equals("Well Aligned")){
            rec = "Portfolio is appropriately balanced for your profile";
            reb = "No action needed";
        }
        else if(alignment.equals("Misaligned")){

            if(tolerance.equals("Conservative")){
                rec = "Portfolio risk significantly exceeds tolerance level";
                reb = "Reduce stocks to 30-40%, increase bonds and cash";
            }
            else if(tolerance.equals("Aggressive")){
                rec = "Portfolio is too conservative for your risk tolerance";
                reb = "Increase stocks to 80-90% for better growth potential";
            }
        }
        else{
            rec = "High risk level acceptable given long horizon and tolerance";
            reb = "Monitor closely, consider slight reduction if volatility persists";
        }

        System.out.println("Stock Allocation: " + stock + "%");
        System.out.println("Bond Allocation: " + bonds + "%");
        System.out.println("Investment Horizon: " + years + " years");
        System.out.println("Risk Tolerance: " + tolerance);
        System.out.println("Market Volatility: " + volatility);
        System.out.println("Portfolio Risk Score: " + riskScore + "/100");
        System.out.println("Risk Category: " + category);
        System.out.println("Alignment Status: " + alignment);
        System.out.println("Recommendation: " + rec);
        System.out.println("Suggested Rebalancing: " + reb);

        scan.close();
    }
}