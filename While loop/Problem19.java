import java.util.*;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();

        int copy = decimal;
        int binary = 0;
        int a = 1;

        int i = 0;
        while (decimal > 0) {
            
            int rem = decimal%2;
            binary = binary + rem * a;
            a = a * 10;
            decimal = decimal/2;

            i++;
        }

        System.out.println("Decimal : " + copy);
        System.out.println("Binary : " + binary);
    }
}
