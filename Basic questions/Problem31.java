import java.util.*;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=0; i<=n; i++){
            if(i==5){
                continue;
            }
            System.out.println(i + " ");
        }

    }
}
