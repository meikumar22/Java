import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print((char) ('a' + j) + " ");
            }
            System.out.println();
        }
    }
}
