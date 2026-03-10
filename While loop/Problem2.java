import java.util.*;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;

        int sum = 0;
        int count = 0;

        int i = 1;
        while (i > 0) {
            System.out.println("Enter number : ");
            n = scan.nextInt();

            if(n > 0){
                sum += n;
                count++;
            }
            else{
                break;
            }
            i++;
        }

        System.out.println("Total sum : " + sum);
        System.out.println("Count : " + count);
    }
}
