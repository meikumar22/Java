import java.util.*;

public class Problem21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();

        int sum = 0;

        int i = 1;
        do{

            sum = n * i;
            System.out.println(n + " x " + i + " = " + sum);

            i++;
        }
        while(i <= r);

    }
}