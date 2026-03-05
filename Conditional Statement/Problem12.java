import java.util.*;

public class Problem12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.nextLine();
        String vehicle_Type = scan.nextLine();
        String drivingRecord = scan.nextLine();
        String coverageLevel = scan.nextLine();

        System.out.println("Driver Age : " + age);
        System.out.println("Vehicle Type : "+ vehicle_Type);
        System.out.println("Driving Record : " + drivingRecord);
        System.out.println("Coverage Level : " + coverageLevel);

        double premium = 0;
        double age_factor = 0;
        double risk_factor = 0;
        int record_adjustment = 0;
        double monthlyPremium = 0;
        String riskCategory;

        if(coverageLevel.equals("Basic"))premium = 500;
        else if(coverageLevel.equals("Standard"))premium = 800;
        else if(coverageLevel.equals("Comprehensive"))premium = 1500;

        if(age > 16 && age < 21)age_factor = 1.8;
        else if(age >= 22 && age < 25)age_factor = 1.5;
        else if(age >= 26 && age < 40)age_factor = 1.0;
        else if(age >= 40 && age < 60)age_factor = 0.9;
        else if(age >= 60)age_factor = 1.1;

        if(vehicle_Type.equals("Sedan")){
            risk_factor  = 1.0;
        }
        else if(vehicle_Type.equals("SUV")){
            risk_factor = 1.2;
        }
        else if(vehicle_Type.equals("Sports")){
            risk_factor = 1.5;
        }
        else if(vehicle_Type.equals("Truck")){
            risk_factor = 1.1;
        }

        if(drivingRecord.equals("Clean")){
            record_adjustment = -10;
        }
        else if(drivingRecord.equals("Minor-Violations")){
            record_adjustment = 25;
        }
        else if(drivingRecord.equals("Major-Violations")){
            record_adjustment = 50;
        }

        double adjustedPremium = premium * age_factor * risk_factor;
        double final_premium = adjustedPremium * (1 + (record_adjustment/100.0));
        monthlyPremium = final_premium/12;

        if (drivingRecord.equals("Major-Violations")) {
            riskCategory = "High";
        }
        else if (drivingRecord.equals("Minor-Violations") && (age_factor >= 1.5 || risk_factor >= 1.5)) {
            riskCategory = "Very High";
        }
        else if (drivingRecord.equals("Minor-Violations")) {
            riskCategory = "Medium";
        }
        else {
            riskCategory = "Low";
        }

        System.out.println("Base Premium : $" + premium);
        System.out.println("Age Factor : " + age_factor + 'x');
        System.out.println("Vehicle Risk Factor : " + risk_factor + 'x');
        System.out.println("Record Adjustment : " + record_adjustment + '%');
        System.out.println("Monthly Premium : $" + String.format("%.2f", monthlyPremium));
        System.out.println("Annual Premium : $" + String.format("%.2f", final_premium));
        System.out.println("Risk Category : " + riskCategory);

    }
}

