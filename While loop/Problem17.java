import java.util.*;

public class Problem17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;

        int i=1;
        while (i <= n/2) {
            
            if(n%i==0){
                sum += i;
            }
            i++;
        }

        if(n == sum){
            System.out.println(n + " is a perfect number");
        }
        else{
            System.out.println(n + " is a not perfect number");
        }
    }
}
