import java.util.*;

public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double gpa = scan.nextDouble();
        double family_income = scan.nextDouble();
        int extra_score = scan.nextInt();
        scan.nextLine();
        String scholarship = scan.nextLine();

        double amount = 0;
        scan.nextLine();
        String category = "";
        String eligible = "";

        System.out.println("GPA : " + gpa);
        System.out.println("Family Income : " + '$' + family_income);
        System.out.println("Extracurricular Score : " + extra_score);
        System.out.println("Scholarship Type : " + scholarship);

        if(gpa >= 2.5){
            if(scholarship.equals("Merit")){
                if(gpa >= 3.8 && extra_score >= 80){
                    amount = 25000;
                    category = "Full";
                    eligible = "Eligible";
                }
                else if(gpa >= 3.5 && extra_score >= 70){
                    amount = 15000;
                    category = "Partial";
                    eligible = "Eligible";
                }
                else if(gpa >= 3.0 && extra_score >=60){
                    amount = 8000;
                    category = "Minimal";
                    eligible = "Eligible";
                }
                else if(gpa <= 2.9){
                    amount = 0;
                    category = "None";
                    eligible = "Not Eligible";
                }
            }
            else if(scholarship.equals("Need-Based")){
                if(family_income <= 300000 && gpa >=3.5){
                    amount = 30000;
                    category = "Full";
                    eligible = "Eligible";
                }
                else if(family_income <= 500000 && gpa >=3.0){
                    amount = 18000;
                    category = "Partial";
                    eligible = "Eligible";
                }
                else if(family_income <= 700000 && gpa >=2.8){
                    amount = 10000;
                    category = "Minimal";
                    eligible = "Eligible";
                }
                else if(gpa < 2.7){
                    amount = 0;
                    category = "None";
                    eligible = "Not Eligible";
                }
            }
            else if(scholarship.equals("Sports")){
                if(extra_score >= 85 && gpa >= 3.0){
                    amount = 22000;
                    category = "Full";
                    eligible = "Eligible";
                }
                else if(extra_score >= 75 &&  gpa >= 2.8){
                    amount = 20000;
                    category = "Partial";
                    eligible = "Eligible";
                }
                else if(extra_score >= 65 && gpa >= 2.5){
                    amount = 12000;
                    category = "Minimal";
                    eligible = "Eligible";
                }
                else if(gpa < 2.4){
                    amount = 0;
                    category = "None";
                    eligible = "Not Eligible";
                }
            }

            System.out.println("Eligibility : " + eligible);
            System.out.println("Award Amount : " + '$' + amount);
            System.out.println("Award Category : " + category);
        }
    }
}
