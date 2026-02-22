import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int rating = scan.nextInt();
        int service = scan.nextInt();
        scan.nextLine();
        String dept = scan.nextLine();
        double salary = scan.nextDouble();

        double bonus = 0;
        int percentage = 0;
        String status;

        if(rating >= 3){
            if(dept.equals("Critical")){
                if(rating == 5){
                    percentage = 25;
                }
                else if(rating == 4 && service >= 10){
                    percentage = 22;
                }
                else if(rating == 4){
                    percentage = 15;
                }
                else if(rating == 3){
                    percentage = 10;
                }
            }
            else if(dept.equals("Non-Critical")){
                if(rating == 5){
                    percentage = 18;
                }
                else if(rating == 4){
                    percentage = 12;
                }
                else if(rating == 3){
                    percentage = 8;
                }
            }

            bonus = salary * percentage / 100;
            status = "Eligible";
        }
        else{
            percentage = 0;
            bonus = 0;
            status = "Not Eligible";
        }

        System.out.println("Performance Rating: " + rating);
        System.out.println("Years of Service: " + service);
        System.out.println("Department: " + dept);
        System.out.println("Bonus Percentage: " + percentage + "%");
        System.out.println("Bonus Amount: $" + bonus);
        System.out.println("Status: " + status);
    }
}