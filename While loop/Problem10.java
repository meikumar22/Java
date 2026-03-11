import java.util.*;

public class Problem10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        int fib = 0;

        int i = 0;
        while (i < n) {
            
            System.out.print(a + " ");

            fib = a + b;
            a = b;
            b = fib;

            i++;
        }
    }
}
