import java.util.*;

public class Problem22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        int sum = 0;

        int i=1;
        while (i <= end) {
            
            if(i%2==0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers from " + start + " to " + end + " : " + sum);
    }
}
