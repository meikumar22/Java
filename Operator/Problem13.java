import java.util.*;

public class Problem13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int mask = scan.nextInt();

        int ans = value&mask;

        if(ans!=0){
            System.out.print("Active");
        }
        else{
            System.out.print("Inactive");
        }
    }
}
