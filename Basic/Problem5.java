import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        int ser = scan.nextInt();
        int gst = scan.nextInt();
        int nop = scan.nextInt();

        int total1 = bill + (bill * ser/100);
        int total2 = total1 + (total1 * gst/100);
        int total = total2 / nop;

        System.out.print(total);
    }
}
