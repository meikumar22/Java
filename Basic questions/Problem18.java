import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i=2; i<num; i++){

            if(num%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("It is a prime");
    }
}
