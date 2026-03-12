import java.util.*;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int copy = n;

        int num = 0;
        int sum = 0;

        int i=0;
        while (n > 0) {
            
            num = n%10;

            int strong = 1;

            for(int j=1; j<=num; j++){
                strong = strong * j;
            }

            sum = sum + strong;
            n = n/10;

            i++;
        }
        if(copy == sum){
            System.out.println(copy + " is a strong number");
        }
        else{
            System.out.println(copy + " is not a strong number");
        }
    }
}
