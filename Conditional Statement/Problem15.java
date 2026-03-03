import java.util.*;

public class Problem15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int user_count = scan.nextInt();
        scan.nextLine();
        String licenseType = scan.nextLine();
        String supportLevel = scan.nextLine();
        int contractYears = scan.nextInt();

        System.out.println("User Count : " + user_count);
        System.out.println("License Type : " + licenseType);
        System.out.println("Support Level : " + supportLevel);
        System.out.println("Contract Duration : " + contractYears + " years");

        double base_price = 0;
        int volume_discount = 0;
        double support_fee = 0;
        int year_discount = 0;
        double annual_cost = 0;
        double total_cost = 0;
        double total_contract = 0;
        String pricing_tier = "";

        if(licenseType.equals("Standard"))base_price = 60;
        else if(licenseType.equals("Professional"))base_price = 120;
        else if(licenseType.equals("Enterprise"))base_price = 200;

        if(user_count >= 1 && user_count <= 50)volume_discount = 0;
        else if(user_count >= 51 && user_count <= 200)volume_discount = 15;
        else if(user_count >= 201 && user_count <= 500)volume_discount = 20;
        else if(user_count >= 501 && user_count <= 1000)volume_discount = 25;
        else if(user_count > 1000)volume_discount = 35;

        if(supportLevel.equals("Basic"))support_fee = 10;
        else if(supportLevel.equals("Priority"))support_fee = 30;
        else if(supportLevel.equals("Premium"))support_fee = 80;

        if(contractYears == 1)year_discount = 0;
        else if(contractYears == 2)year_discount = 5;
        else if(contractYears == 3)year_discount = 10;
        else if(contractYears == 5)year_discount = 20;

        double discountbase = base_price * (1 - (volume_discount/100.0));
        annual_cost = (discountbase + support_fee) * (1 - (year_discount/100.0));
        total_cost = annual_cost * user_count;
        total_contract = total_cost * contractYears;

        if(user_count < 200){
            if(licenseType.equals("Enterprise")){
                pricing_tier = "Enterprise";
            }
            else{
                pricing_tier = "Small Business";
            }
        }
        else if(user_count >= 200 && user_count <= 1000){
            if(licenseType.equals("Enterprise")){
                pricing_tier = "Enterprise";
            }
            else{
                pricing_tier = "Mid-Market";
            }
        }
        else if(user_count > 1000)pricing_tier = "Enterprise";

        System.out.println("Base Price Per User : $" + String.format("%.1f", base_price));
        System.out.println("Volume Discount : " + volume_discount + '%');
        System.out.println("Support Fee Per User : $" + String.format("%.1f", support_fee));
        System.out.println("Multi-Year Discount : " + year_discount + '%');
        System.out.println("Annual Cost Per User : $" + String.format("%.1f", annual_cost));
        System.out.println("Total Annual Cost : $" + String.format("%.1f", total_cost));
        System.out.println("Total Contract Value : $" + String.format("%.1f", total_contract));
        System.out.println("Pricing Tier : " + pricing_tier);

        scan.close();

    }
}
