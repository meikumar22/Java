import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 2;

        while(i <= Math.sqrt(n)){
            if(n % i == 0){
                System.out.println(n + " is not prime");
                return;
            }
            i++;
        }

        if(n <= 1){
            System.out.println(n + " is not prime");
        } 
        else{
            System.out.println(n + " is prime");
        }

        scan.close();
    }
}