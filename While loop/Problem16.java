import java.util.*;

public class Problem16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int decimal = 0;
        int a = 0;
        int pow = 0;

        int i = 0;
        while (n > 0) {

            a = n%10;
            decimal = decimal + a * (int)Math.pow(2, pow);
            n = n/10;

            pow++;
        }
        System.out.println(decimal);
    }
}
