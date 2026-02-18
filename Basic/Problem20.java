import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ad = scan.nextInt();
        int si = scan.nextInt();
        int ai = scan.nextInt();
        int tax = scan.nextInt();
        int pc = scan.nextInt();

        System.out.print(ad+si+ai-tax-pc);
    }
}
