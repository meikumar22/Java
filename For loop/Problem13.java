import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int eligibleCount = 0;
        
        for(int i=0;i<n;i++){
            String donorName = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hemoglobin = sc.nextDouble();
            String check = "";
            String Reason = "";
            if(age>17 && age<66 && weight>=50 && hemoglobin>=12.5 ){
                check = "Eligible";
                eligibleCount++;
            }else{
                check = "Not Eligible";
            }
            if(age<=17){
                Reason = "Age below 18 years";
            }
            else if(age>65){
                Reason = "Age Above 65 years";
            }
            else if(weight<50){
                Reason = "Weight below 50 kg";
            }
            else if(hemoglobin<12.5){
                Reason = "Hemoglobin below 12.5 g/dL";
            }
            System.out.println();
            System.out.println("Donor: "+donorName);
            System.out.println("Age: "+age+" years");
            System.out.println("Weight: "+weight+" kg");
            System.out.println("Hemoglobin: "+hemoglobin+" g/dL");
            System.out.println("Status: "+check);

            if(check.equals("Not Eligible")){
                System.out.println("Reason :"+Reason);
            }

        }

        System.out.println();
        double percentage=(double)eligibleCount/n* 100.0;
        System.out.println("Total Donors: "+n);
        System.out.println("Eligible Donors: "+eligibleCount);
        System.out.println("Rejected Donors: "+(n-eligibleCount));
        System.out.println("Eligibility Rate: "+percentage+"%");
        sc.close();
    }
}