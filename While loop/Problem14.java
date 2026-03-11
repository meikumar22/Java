import java.util.*;

public class Problem14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int copy = n;

        int rev = 0;
        int sum = 0;
        int arm = 0;

        int i=0;
        while (n > 0) {
            
            rev = n%10;
            sum = (rev * rev * rev);
            arm += sum;
            n = n/10;

            i++;
        }
        if(copy == arm){
            System.out.println(copy + " is an Armstrong number");
        }
        else{
            System.out.println(copy + " is not an Armstrong number");
        }
    }
}
