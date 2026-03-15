import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        int sum = 0;

        System.out.print(" ");
        for(int i=1; i<=c; i++){
            System.out.printf("%4d", i);
        }

        System.out.println();

        for(int i=1; i<=r; i++){
            System.out.print(i);
            for(int j=1; j<=c; j++){
                sum = i*j;
                System.out.printf("%4d", sum);
            }
            System.out.println();
        }
    }
}