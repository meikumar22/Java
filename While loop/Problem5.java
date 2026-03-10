import java.util.*;

public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int copy = n;
        int rev = 0;

        int i=1;
        while (n > 0) {
            
            rev = rev * 10 + n%10;
            n = n/10;
            i++;
        }

        System.out.println("Original : " + copy);
        System.out.println("Reversed : " + rev);
    }
}
