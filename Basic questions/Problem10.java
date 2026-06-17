import java.util.*;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int rev = 0;

        for(; n!=0; n=n/10){
            rev = rev * 10 + n%10;
        }
            
        System.out.println(rev);
    }
}
