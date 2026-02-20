import java.util.*;

public class Problem14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int permission_A = scan.nextInt();
        int permission_B = scan.nextInt();

        int ans = permission_A|permission_B;

        System.out.print(ans);
    }
}