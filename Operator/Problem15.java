import java.util.*;

public class Problem15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int singal_value = scan.nextInt();
        int toggle_mask = scan.nextInt();

        int ans = singal_value^toggle_mask;

        System.out.print(ans);
    }
}