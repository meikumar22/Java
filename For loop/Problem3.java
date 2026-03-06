import java.util.*;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String productName;
        int currentStock;
        int minimumStock;

        String product = "";
        int current_stock = 0;
        int minimum_stock = 0;
        String status = "";
        int quantity = 0;

        int total_products = n;
        int low_stack_items = 0;
        int critical_items = 0;
        int total_quantity = 0;

        int a = 0;
        int b = 0;
        int sum = 0;
        int count = 0;
        int count1 = 0;

        for(int i=0; i<n; i++){
            productName = scan.next();
            currentStock = scan.nextInt();
            minimumStock = scan.nextInt();

            if(currentStock > minimumStock){
                status = "Adequate";
            }
            else if(currentStock < minimumStock && currentStock >= minimumStock/2){
                status = "Low Stock";
                count++;
            }
            else {
                status = "Critical";
                count1++;
            }

            if(status.equals("Adequate")){
                quantity = 0;
            }
            else if(status.equals("Low Stock")){
                a = (minimumStock - currentStock) + minimumStock/2;
                quantity = a;
            }
            else if(status.equals("Critical")){
                b = (int)((minimumStock - currentStock) + minimumStock * 1.5);
                quantity = b;
            }

            System.out.println(" ");
            System.out.println("Product : " + productName);
            System.out.println("Current Stock : " + currentStock);
            System.out.println("Minimum Stock : " + minimumStock);
            System.out.println("Status : " + status);
            System.out.println("Reorder Quantity : " + quantity);
            System.out.println(" ");

            sum = sum + quantity;

        }
        total_quantity = sum;

        System.out.println("Total Products : " + total_products);
        System.out.println("Low Stock Items : " + count);
        System.out.println("Critical Items : " + count1);
        System.out.println("Total Reorder Quantity : " + total_quantity);

        scan.close();
    }
}
