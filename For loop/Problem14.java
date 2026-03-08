import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int count = 0;

        for(int i=1;i<=n;i++){
            String bookType = sc.next();
            int daysLate = sc.nextInt();
            double dailyFine = 0;
            if(daysLate>0){
                count++;
            }
            if(bookType.equals("Regular")){
                dailyFine = 0.50;
            }
            else if(bookType.equals("Reference")){
                dailyFine = 1;
            }
            else if(bookType.equals("Magazine")){
                dailyFine = 0.25;
            }
            double fine = dailyFine*daysLate;
            
            double maximumCap = fine;
            String cap="No";
            if(bookType.equals("Regular")){
                if(fine>10){
                maximumCap = 10;
                cap = "Yes";
                }
            }
            else if(bookType.equals("Reference")){
                if(fine>20){
                maximumCap = 20;
                cap = "Yes";
                }
            }
            else if(bookType.equals("Magazine")){
                if(fine>5){
                maximumCap = 5;
                cap = "Yes";
                }
            }

            sum += maximumCap;
            System.out.println();
            System.out.println("Book "+i+": "+bookType);
            System.out.println("Days Late: "+daysLate);
            System.out.println("Daily Fine: $"+dailyFine);
            System.out.println("Calculated Fine: $"+fine);
            System.out.println("Actual Fine: $"+maximumCap);
            System.out.println("Cap Applied: "+cap);
        }

        double avg = sum/n;
        System.out.println();
        System.out.println("Total Books: "+n);
        System.out.println("Total Fines Collected: $"+sum);
        System.out.println("Books Overdue: "+count);
        System.out.printf("Average Fine: $%.2f",avg);
    }
}