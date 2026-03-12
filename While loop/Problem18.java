import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int x = a;
        int y = b;

        int gcd = 0;
        int lcm = 0;

        int i = 0;
        while (b != 0) {
            
            int temp = b;
            b = a % b;
            a = temp;

            i++;
        }
        gcd = a;
        lcm = (x*y)/gcd;

        System.out.println("LCM of " + x + " and " + y + " = " + lcm);
    }
}
