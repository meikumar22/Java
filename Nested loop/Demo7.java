import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int num = 1;

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
