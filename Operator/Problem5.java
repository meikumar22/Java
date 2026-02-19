import java.util.*;

public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        int score = scan.nextInt();

        if(salary>25000 && 700<score){
            System.out.print("Loan Approved");
        }
        else{
            System.out.print("Loan Rejected");
        }
    }
}
