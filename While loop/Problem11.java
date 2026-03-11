import java.util.*;

public class Problem11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int n = a;
        int m = b;

        int i=0;
        while (b != 0) {
            
            int temp = b;
            b = a % b;
            a = temp;
            i++;
        }

        int gcd = a;
        System.out.println("GCD of " + n + " and " + m + " = " + gcd);
    }
}
