import java.util.*;

public class Problem29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;
        int rev = 0;

        for(; n!=0; n=n/10){
            rev = n%10;
            sum = sum + rev;
        }
        
        System.out.println(sum);
    }
}
