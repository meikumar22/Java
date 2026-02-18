import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ru = scan.nextInt();
        int rr = scan.nextInt();
        int cu = scan.nextInt();
        int cr = scan.nextInt();
        int cf = scan.nextInt();
        int pc = scan.nextInt();
        int pm = scan.nextInt();
        int tc = scan.nextInt();

        System.out.print((ru*rr)+(cu*cr)+cf+pc-pm-tc);
        
    }
    
}
