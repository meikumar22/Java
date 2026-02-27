import java.util.*;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String loyalty_tier = scan.nextLine();
        double cardvalue = scan.nextDouble();
        scan.nextLine();
        String product = scan.nextLine();
        String membership = scan.nextLine();

        int discount = 0;
        int additional_discount = 0;
        int total_discount = 0;
        double price = 0;
        double saving = 0;

        System.out.println("Loyalty Tier : " + loyalty_tier);
        System.out.println("Cart Value : " + '$' + cardvalue);
        System.out.println("Product Category : " + product);
        System.out.println("Membership : " + membership);

        if(loyalty_tier.equals("Bronze")){
            discount = 5;
        }        
        else if(loyalty_tier.equals("Silver")){
            discount = 8;
        }
        else if(loyalty_tier.equals("Gold")){
            discount = 12;
        }
        else if(loyalty_tier.equals("Platinum")){
            discount = 15;
        }

        if(cardvalue>=500 && cardvalue<=999){
            additional_discount = 3;
        }
        else if(cardvalue>=1000 && cardvalue<=1999){
            additional_discount = 5;
        }
        else if(cardvalue>=2000){
            additional_discount = 7;
        }

        if(product.equals("Electronics")){
            if(membership.equals("Prime")){
                additional_discount = additional_discount + 5;
            }
        }
        else if(product.equals("Fashion")){
            additional_discount = additional_discount + 3;
        }
        else if(product.equals("Books")){
            if(membership.equals("Prime")){
                additional_discount = additional_discount + 5;
            }
        }
        else if(product.equals("Groceries")){
            if(cardvalue>300){
                additional_discount = additional_discount + 2;
            }
        }

        total_discount = discount + additional_discount;
        price = cardvalue * (1 - total_discount/100.0);
        saving = cardvalue - price;

        System.out.println("Base Discount : " + discount + '%');
        System.out.println("Additional Discount : " + additional_discount + '%');
        System.out.println("Total Discount : " + total_discount + '%');
        System.out.println("Final Price : " + '$' + price);
        System.out.println("Savings : " + '$' + saving);

    }
}
