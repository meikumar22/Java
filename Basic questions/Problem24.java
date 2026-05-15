import java.util.*;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=i; j>=1; j--){
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
