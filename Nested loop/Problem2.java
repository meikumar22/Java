import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();

        for(int i=1; i<=r; i++){
            System.out.print("Row " + i + " :");
            for(int j=0; j<=c; j++){
                System.out.print(" Seat - " + j);
            }
            System.out.println();
        }
    }
}
