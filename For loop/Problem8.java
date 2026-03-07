import java.util.*;

public class Problem8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String productName;
        double price;
        int quantity;

        int discount = 0;
        double sub_total = 0;

        int total_items = 0;
        double original_total = 0;
        double total_discount = 0;
        double final_total = 0;
        double savings = 0;

        for(int i=0; i<n; i++){
            productName = scan.next();
            price = scan.nextDouble();
            quantity = scan.nextInt();

            if(quantity == 1)discount = 0;
            else if(quantity >= 2 && quantity <= 4)discount = 10;
            else if(quantity >= 5 && quantity <= 9)discount = 15;
            else if(quantity >= 10)discount = 20;

            sub_total = (double)price * quantity * (1 - (discount/100.0));
            total_items = total_items + quantity;
            original_total = original_total + (price * quantity);
            final_total = final_total + sub_total;
            total_discount = original_total - final_total;

            System.out.println("");
            System.out.println("Product : " + productName);
            System.out.println("Unit Price : $" + String.format("%.1f", price));
            System.out.println("Quantity : " + quantity);
            System.out.println("Discount : " + discount + '%');
            System.out.println("Subtotal : $" + String.format("%.2f", sub_total));
            System.out.println("");

        }
        savings = ((total_discount/original_total) * 100);

        System.out.println("Total Items : " + total_items);
        System.out.println("Original Total : $" + String.format("%.1f", original_total));
        System.out.println("Total Discount : $" + String.format("%.2f", total_discount));
        System.out.println("Final Total : $" + String.format("%.2f", final_total));
        System.out.println("Savings : " + String.format("%.2f", savings) + '%');

        scan.close();
        
    }
}
