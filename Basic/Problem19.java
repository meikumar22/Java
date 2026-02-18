import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rd = scan.nextInt();
        int rp = scan.nextInt();
        int lc = scan.nextInt();
        int fc = scan.nextInt();
        int mc = scan.nextInt();

        System.out.print((rd*rp)+lc-fc-mc);
    }
    
}
