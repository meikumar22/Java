import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double Subtotal = 0;

        for(int i=0;i<n;i++){
            String itemName = sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();
            double subtotal = price * quantity;
            Subtotal += subtotal;

            System.out.println();
            System.out.println("Item: "+itemName);
            System.out.println("Price: $"+price+" x "+quantity);
            System.out.println("Subtotal: $"+subtotal);
        }
        

        System.out.println();
        double total = Subtotal*0.08+Subtotal*0.10+Subtotal;
        System.out.println("Total Items: "+n);
        System.out.println("Subtotal: $"+Subtotal);
        System.out.println("Tax (8%): $"+String.format("%.2f", Subtotal*0.8));
        System.out.println("Service Charge (10%): $"+String.format("%.2f", Subtotal*0.10));
        System.out.println("Grand Total: $"+total);
            
        sc.close();
    }
    
}
