import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int count = 0;
        int rev = 0;

        for(; n!=0; n=n/10){
            rev = rev * 10 + n%10;
            count++;
        }

        System.out.println(count);
    }
}
