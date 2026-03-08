import java.util.*;

public class Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double totalRevenue = 0;
        for(int i=0;i<n;i++){
            String memberName = sc.next();
            String membershipType = sc.next();
            int daysUntilExpiry = sc.nextInt();
            int renewalFees=0;
            String priority;
            if(daysUntilExpiry<10){
                priority="Urgent";
                count++;
            }else if(daysUntilExpiry<21){
                priority="High";
            }else{
                priority="Normal";
            }
            if(membershipType.equals("Basic")){
                renewalFees=50;
            }
            else if(membershipType.equals("Premium")){
                renewalFees=100;
            }
            else if(membershipType.equals("VIP")){
                renewalFees=200;
            }
            int dis=0;
            if(daysUntilExpiry>45){
                dis=20;
            }
            else if(daysUntilExpiry>29 && daysUntilExpiry<=45){
                dis=15;
            }
            else if(daysUntilExpiry>14 && daysUntilExpiry<30){
                dis=10;
            }
            else if(daysUntilExpiry<15){
                dis=0;
            }
            double finalFee=(double)renewalFees*(1-dis/100.0);
            totalRevenue+=finalFee;
            System.out.println();
            System.out.println("Member: "+memberName);
            System.out.println("Membership: "+membershipType);
            System.out.println("Days Until Expiry: "+daysUntilExpiry);
            System.out.println("Renewal Fee: $"+renewalFees);
            System.out.println("Discount: "+dis+"%");
            System.out.println("Discount: "+dis+"%");
            System.out.println("Final Fee: $"+finalFee);
            System.out.println("Priority: "+priority);
        }
        double avg = totalRevenue/n;
        System.out.println();
        System.out.println("Total Members: "+n);
        System.out.println("Urgent Renewals: "+count);
        System.out.println("Total Renewal Revenue: $: "+totalRevenue);
        System.out.println("Average Renewal Fee: $: "+avg);
    }
    
}