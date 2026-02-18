import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int mc = scan.nextInt();
        int pf = scan.nextInt();
        int hb = scan.nextInt();
        int ss = scan.nextInt();
        int eb = scan.nextInt();
        int cc = scan.nextInt();

        System.out.println(mc+pf+hb-ss-eb-cc);
    }
    
}
