import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int sum = 0;

        for(int i=1; i<=10; i++){
            sum = i*num;
            System.out.println(sum);
        }
    }
}
