import java.util.*;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int fact = 1;

        int i = 1;
        while (i<=n){

            fact = fact * i;

            i++;
        }
        System.out.print(fact);
    }
}
