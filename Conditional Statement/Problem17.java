import java.util.*;

public class Problem17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String card_tier = scan.nextLine();
        String purchase_category = scan.nextLine();
        double amount = scan.nextDouble();
        scan.nextLine();
        String status = scan.nextLine();

        System.out.println("Card Tier : " + card_tier);
        System.out.println("Purchase Category : " + purchase_category);
        System.out.println("Transaction Amount : $" + String.format("%.1f", amount));
        System.out.println("Promotional Status : " + status);

        double base_point = 0;
        double category_bonus = 0;
        double tier_multiplier = 0;
        double promotional_multiplier = 0;
        double point_earned = 0;
        double cash_value = 0;
        String rewards_tier = "";

        base_point = 1.0;
        System.out.println("Base Points Rate : " + base_point + " points per dollar");

        if(purchase_category.equals("Groceries"))category_bonus = 2.0;
        else if(purchase_category.equals("Dining"))category_bonus = 2.5;
        else if(purchase_category.equals("Travel"))category_bonus = 3.0;
        else if(purchase_category.equals("Gas"))category_bonus = 2.0;
        else category_bonus = 1.0;

        if(card_tier.equals("Basic"))tier_multiplier = 1.0;
        else if(card_tier.equals("Gold"))tier_multiplier = 1.25;
        else if(card_tier.equals("Platinum"))tier_multiplier = 1.5;
        else if(card_tier.equals("Black"))tier_multiplier = 2.0;

        if(status.equals("None"))promotional_multiplier = 1.0;
        else if(status.equals("Double-Points"))promotional_multiplier = 2.0;
        else if(status.equals("Triple-Points"))promotional_multiplier = 3.0;

        point_earned = amount * base_point * category_bonus * tier_multiplier * promotional_multiplier;

        cash_value = point_earned * 0.01;

        if(card_tier.equals("Basic"))rewards_tier = "Standard";
        else if(card_tier.equals("Gold"))rewards_tier = "Enhanced";
        else if(card_tier.equals("Platinum"))rewards_tier = "Premium";
        else if(card_tier.equals("Black"))rewards_tier = "Elite";

        System.out.println("Category Bonus : " + category_bonus + 'x');
        System.out.println("Tier Multiplier : " + tier_multiplier + 'x');
        System.out.println("Promotional Multiplier : " + promotional_multiplier + 'x');
        System.out.println("Points Earned : " + point_earned);
        System.out.println("Equivalent Cash Value : $" + String.format("%.2f", cash_value));
        System.out.println("Rewards Tier : " + rewards_tier);

        scan.close();
    }
}
