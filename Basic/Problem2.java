import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int gb = scan.nextInt();
        int rp = scan.nextInt();
        int per = scan.nextInt();

        int extra = gb * rp;
        int total = cost + extra;

        double bill = total + (total * per/100.0);

        System.out.print(bill);
        
    }
}
