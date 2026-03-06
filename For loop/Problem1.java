import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        String employeeName;
        double baseSalary;
        int rating;
        int increment = 0;
        double finalsalary = 0;
        int total_employees = 0;
        double totalpayroll = 0;
        double average_salary = 0;
        
        for(int i=0; i<n; i++){
            employeeName = scan.next();
            baseSalary = scan.nextDouble();
            rating = scan.nextInt();

            if(rating == 5){
                increment = 15;
            }
            else if(rating == 4){
                increment = 10;
            }
            else if(rating == 3){
                increment = 5;
            }
            else if(rating == 2){
                increment = 2;
            }
            else if(rating == 1){
                increment = 0;
            }

            total_employees = n;
            finalsalary = baseSalary * (1 + (increment/100.0));
            totalpayroll += finalsalary;
            average_salary = totalpayroll/n;

            System.out.println("Employee : " + employeeName);
            System.out.println("Base Salary : $" + String.format("%.1f", baseSalary));
            System.out.println("Performance Rating : " + rating);
            System.out.println("Increment : " + increment + '%');
            System.out.println("Final Salary : $" + String.format("%.1f", finalsalary));
            System.out.println("");

        }

        System.out.println("Total Employees Processed : " + total_employees);
        System.out.println("Total Payroll : $" + totalpayroll);
        System.out.println("Average Salary : $" + String.format("%.2f", average_salary));

        scan.close();

    }
}
