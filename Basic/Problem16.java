import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int gp = scan.nextInt();
            int gf = scan.nextInt();
            int ap = scan.nextInt();
            int af = scan.nextInt();
            int pc = scan.nextInt();
            int mc = scan.nextInt();
            int fc = scan.nextInt();

            int total = ((gp*gf)+(ap*af)+pc-(mc-fc));
            System.out.println(total);

    }
    
}
