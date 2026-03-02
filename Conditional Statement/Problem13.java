import java.util.*;

public class Problem13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String std_status = scan.nextLine();
        int credit_hours = scan.nextInt();
        scan.nextLine();
        String program_type = scan.nextLine();
        String residency = scan.nextLine();

        System.out.println("Student Status : " + std_status);
        System.out.println("Credit Hours : "+ credit_hours);
        System.out.println("Program Type : " + program_type);
        System.out.println("Residency : " + residency);

        double per_credit = 0;
        double residency_multipiler = 0;
        double program_fee = 0;
        double activity_fee = 0;
        String category = "";

        if(program_type.equals("Undergraduate"))per_credit = 350;
        else if(program_type.equals("Graduate"))per_credit = 550;
        else if(program_type.equals("Professional"))per_credit = 800;

        if(residency.equals("In-State"))residency_multipiler = 1.0;
        else if(residency.equals("Out-of-State"))residency_multipiler = 2.5;
        else if(residency.equals("International"))residency_multipiler = 3.0;

        if(std_status.equals("Full-Time")){
            if(program_type.equals("Undergraduate"))program_fee = 500;
            else if(program_type.equals("Graduate"))program_fee = 750;
            else if(program_type.equals("Professional"))program_fee = 1200;
        }
        else if(std_status.equals("Part-Time")){
            if(program_type.equals("Undergraduate"))program_fee = 300;
            else if(program_type.equals("Graduate"))program_fee = 750;
            else if(program_type.equals("Professional"))program_fee = 900;
        }
        else if(std_status.equals("Continuing-Education")){
            if(program_type.equals("Undergraduate"))program_fee = 150;
            else if(program_type.equals("Graduate"))program_fee = 150;
            else if(program_type.equals("Professional"))program_fee = 150;
        }

        if(std_status.equals("Full-Time"))activity_fee = 200;
        else if(std_status.equals("Part-Time"))activity_fee  = 100;
        else if(std_status.equals("Continuing-Education"))activity_fee = 50;

        double tuition_cost = credit_hours * per_credit * residency_multipiler;
        double total_fee = tuition_cost + program_fee + activity_fee;

        if(std_status.equals("Full-Time")){
            if(residency.equals("In-State"))category = "Standard";
            else if(residency.equals("International"))category = "Premium";
        }
        else if(std_status.equals("Part-Time")){
            if(residency.equals("Out-of-State"))category = "Premium";
            else if(residency.equals("International"))category = "Premium";
        }
        else if(std_status.equals("Continuing-Education")){
            category = "Reduced";
        }

        System.out.println("Base Tuition Per Credit : $" + String.format("%.1f", per_credit));
        System.out.println("Residency Multiplier : " + residency_multipiler + 'x');
        System.out.println("Program Fee : $" + String.format("%.1f", program_fee));
        System.out.println("Student Activity Fee : $" + String.format("%.1f", activity_fee));
        System.out.println("Total Registration Fee : $" + String.format("%.1f", total_fee));
        System.out.println("Fee Category : " + category);

        scan.close();

    }
}
 