import java.util.*;

public class Problem9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double annualRevenue = scan.nextDouble();
        scan.nextLine();
        String businessType = scan.nextLine();
        double deductibleExpenses = scan.nextDouble();
        double taxCredits = scan.nextDouble();

        double taxableIncome = 0;
        int taxrate = 0;
        double grosstax = 0;
        double nettax = 0;
        double effectiveTaxrate = 0;

        System.out.println("Annual Revenue : " + '$' + annualRevenue);
        System.out.println("Business Type : " + businessType);
        System.out.println("Deductible Expenses : " + deductibleExpenses);
        System.out.println("Tax Credits : " + '$' + taxCredits);

        taxableIncome = annualRevenue - deductibleExpenses;

        if(businessType.equals("C-Corp")){
            if(taxableIncome <= 500000){
                taxrate = 21;
            }
            else if(taxableIncome > 500000 && taxableIncome < 1000000){
                taxrate = 24;
            }
            else if(taxableIncome > 1000000 && taxableIncome < 2000000){
                taxrate = 28;
            }
            else if(taxableIncome > 2000000){
                taxrate = 30;
            }
        }
        else if(businessType.equals("S-Corp")){
            if(taxableIncome <= 500000){
                taxrate = 20;
            }
            else if(taxableIncome > 500000 && taxableIncome < 1000000){
                taxrate = 25;
            }
            else if(taxableIncome > 1000000){
                taxrate = 28;
            }
        }
        else if(businessType.equals("LLC")){
            if(taxableIncome <= 200000){
                taxrate = 15;
            }
            else if(taxableIncome > 200000 && taxableIncome < 500000){
                taxrate = 18;
            }
            else if(taxableIncome > 500000){
                taxrate = 25;
            }
        }
        else if(businessType.equals("Partnership")){
            if(taxableIncome <= 300000){
                taxrate = 18;
            }
            else if(taxableIncome > 300000 && taxableIncome < 800000){
                taxrate = 22;
            }
            else if(taxableIncome > 800000){
                taxrate = 26;
            }
        }

        grosstax = (taxableIncome * taxrate)/100.0;
        nettax = grosstax - taxCredits;
        effectiveTaxrate = (nettax/annualRevenue) * 100;

        System.out.println("Taxable Income : " + '$' + taxableIncome);
        System.out.println("Tax Rate : " + taxrate + '%');
        System.out.println("Gross Tax : " + '$' + grosstax);
        System.out.println("Net Tax After Credits : " + '$' + nettax);
        System.out.println("Effective Tax Rate : " + String.format("%.2f", effectiveTaxrate) + '%');
    }
}
