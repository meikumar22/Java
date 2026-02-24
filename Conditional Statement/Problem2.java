import java.util.*;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int creditscore = scan.nextInt();
        double annualincome = scan.nextDouble();
        double debttoincomeRatio = scan.nextDouble();
        scan.nextLine();
        String loanType = scan.nextLine();

        double amount = 0;

        System.out.println("Credit Score : " + creditscore);
        System.out.println("Annual Income : " + '$' + annualincome);
        System.out.println("Dept-to-Income Ratio : " + debttoincomeRatio + '%');
        System.out.println("Loan Type : " + loanType);

        if(loanType.equals("Home")){
            if(creditscore>=750 && debttoincomeRatio<=30){
                amount = annualincome * 4;
                System.out.println("Decision : Approved");
                System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
            else if(creditscore<=749 || creditscore>=700 && 
                debttoincomeRatio<=40 || debttoincomeRatio>=31){
                    amount = annualincome * 3;
                    System.out.println("Decision : Needs Review");
                    System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
        }
        else if(loanType.equals("Personal")){
            if(creditscore>=750 && debttoincomeRatio<=30){
                amount = annualincome * 1;
                System.out.print("Decision : Approved");
                System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
            else if(creditscore<=699 || creditscore>=650 && 
                debttoincomeRatio<=40 || debttoincomeRatio>=31){
                amount = annualincome * 0.5;
                System.out.println("Decision : Needs Review");
                System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
        }
        else if(loanType.equals("Business")){
            if(creditscore>=750 || creditscore>=700 || creditscore<=750 &&
            debttoincomeRatio<30 || debttoincomeRatio>=31 || debttoincomeRatio<=40){
                amount = annualincome * 3;
                System.out.println("Decision : Approved");
                System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
            
            if(creditscore<600 || debttoincomeRatio>50){
                amount = annualincome * 0;
                System.out.println("Decision : Rejected");
                System.out.println("Maximum Loan Amount : " + '$' + amount);
            }
            
        }
    }
}


