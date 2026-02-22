import java.util.*;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt();
        scan.nextLine();
        String smoking = scan.nextLine();
        String condition = scan.nextLine();
        String tier = scan.nextLine();

        double base = 0;
        double risk = 0;
        double total;

        if(age >= 18 && age <= 30){
            if(tier.equals("Basic")) base = 200;
            else if(tier.equals("Standard")) base = 300;
            else if(tier.equals("Premium")) base = 500;
        }
        else if(age >= 31 && age <= 50){
            if(tier.equals("Basic")) base = 250;
            else if(tier.equals("Standard")) base = 350;
            else if(tier.equals("Premium")) base = 600;
        }
        else if(age >= 51 && age <= 65){
            if(tier.equals("Basic")) base = 350;
            else if(tier.equals("Standard")) base = 450;
            else if(tier.equals("Premium")) base = 700;
        }
        else if(age >= 66){
            if(tier.equals("Basic")) base = 400;
            else if(tier.equals("Standard")) base = 550;
            else if(tier.equals("Premium")) base = 800;
        }

        if(smoking.equals("Smoker") && condition.equals("Yes")){
            risk = base * 0.70;
        }
        else if(smoking.equals("Smoker")){
            risk = base * 0.40;
        }
        else if(condition.equals("Yes")){
            risk = base * 0.30;
        }
        else{
            risk = 0;
        }

        total = base + risk;

        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smoking);
        System.out.println("Pre-existing Conditions: " + condition);
        System.out.println("Coverage Tier: " + tier);
        System.out.println("Base Premium: $" + base);
        System.out.println("Risk Surcharge: $" + risk);
        System.out.println("Total Monthly Premium: $" + total);

        scan.close();
    }
}
