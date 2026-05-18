import java.util.*;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;

        for(int i=1; i<=10; i++){
            sum = n * i;
            System.out.println(n + " * " + i + " = " + sum);
        }
    }
}
