import java.util.*;

public class Problem13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int pow = 1;

        int i=0;
        while (i < m) {
            
            pow *= n;
            i++;
        }
        System.out.println(pow);
    }
}
