import java.util.*;

public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int expired = 0;
        int expiringSoon = 0;
        int active = 0;

        for(int i=0;i<n;i++){
            String productID = sc.next();
            String productType = sc.next();
            int months = sc.nextInt();

            int warranty = 0;
            if(productType.equals("Electronics")){
                warranty=12;
            }
            else if(productType.equals("Appliance")){
                warranty=24;
            }
            else if(productType.equals("Computer")){
                warranty=36;
            }
            
            int remaining = warranty-months;
            String status="";
            if(remaining<=0){
                status="Expired";
                expired++;
                remaining=0;
            }
            else if(remaining>0 && remaining<=3){
                status="Expiring Soon";
                expiringSoon++;
            }
            else if(remaining>3){
                status="Active";
                active++;
            }
            System.out.println();
            System.out.println("Product ID: "+productID);
            System.out.println("Type: "+productType);
            System.out.println("Warranty Period: "+warranty);
            System.out.println("Months Used: "+months);
            System.out.println("Remaining: "+remaining);
            System.out.println("Status: "+status);
        }
        System.out.println();
        System.out.println("Total Products: "+n);
        System.out.println("Active Warranties: "+active);
        System.out.println("Expiring Soon: "+expiringSoon);
        System.out.println("Expired Warranties: "+expired);
    }
    
}