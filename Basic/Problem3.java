import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int amt = scan.nextInt();
        int dis = scan.nextInt();
        int gst = scan.nextInt();

        int total = amt - (amt * dis/100);
        int revenue = total + (total * gst/100);

        System.out.print(revenue);
    }
    
}
