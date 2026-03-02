import java.util.*;

public class Problem14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String membership = scan.nextLine();
        int contract_month = scan.nextInt();
        scan.nextLine();
        String access_level = scan.nextLine();
        String addOns = scan.nextLine();

        System.out.println("Membership Tier : " + membership);
        System.out.println("Contract Length : " + contract_month + " months");
        System.out.println("Access Level : " + access_level);
        System.out.println("Add-Ons : " + addOns);

        double base_monthlyfee = 0;
        int contract_discount = 0;
        double access_fee = 0;
        double addOns_fee = 0;
        double monthly_total = 0;
        double contract_total = 0;
        double saving = 0;
        String category = "";

        if(membership.equals("Basic")) base_monthlyfee = 40;
        else if(membership.equals("Premium")) base_monthlyfee = 80;
        else if(membership.equals("Elite")) base_monthlyfee = 120;
        else if(membership.equals("VIP")) base_monthlyfee = 150;

        if(contract_month == 1) contract_discount = 0;
        else if(contract_month == 6) contract_discount = 10;
        else if(contract_month == 12) contract_discount = 15;
        else if(contract_month == 24) contract_discount = 25;

        if(access_level.equals("Single-Location")) access_fee = 0;
        else if(access_level.equals("Regional")) access_fee = 20;
        else if(access_level.equals("Nationwide")) access_fee = 50;

        if(addOns.equals("None")) addOns_fee = 0;
        else if(addOns.equals("Personal-Training")) addOns_fee = 100;
        else if(addOns.equals("Classes")) addOns_fee = 50;
        else if(addOns.equals("Full-Package")) addOns_fee = 200;

        monthly_total = (base_monthlyfee + access_fee + addOns_fee)
                        * (1 - contract_discount / 100.0);

        contract_total = monthly_total * contract_month;

        double original_total = (base_monthlyfee + access_fee + addOns_fee) * contract_month;

        saving = original_total - contract_total;

        if(membership.equals("Basic")) category = "Budget";
        else if(membership.equals("Premium")) {
            if(monthly_total > 100) category = "Premium";
            else category = "Standard";
        }
        else if(membership.equals("Elite")) category = "Premium";
        else if(membership.equals("VIP")) category = "Luxury";

        System.out.println("Base Monthly Fee : $" + String.format("%.1f", base_monthlyfee));
        System.out.println("Contract Discount : " + contract_discount + "%");
        System.out.println("Access Fee : $" + String.format("%.1f", access_fee));
        System.out.println("Add-On Fee : $" + String.format("%.1f", addOns_fee));
        System.out.println("Monthly Total : $" + String.format("%.1f", monthly_total));
        System.out.println("Contract Total : $" + String.format("%.1f", contract_total));
        System.out.println("Savings vs Month-to-Month : $" + String.format("%.1f", saving));
        System.out.println("Membership Category : " + category);

        scan.close();
    }
}