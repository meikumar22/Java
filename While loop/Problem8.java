import java.util.*;

public class Problem8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int rev = 0;
        int sum = 0;

        int i=0;
        while (num != 0) {
            

            rev = num%10;
            sum = sum + rev;
            num = num/10;

            i++;
        }
        System.out.println(sum);
    }    
}
