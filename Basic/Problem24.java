import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tr = scan.nextInt();
        int br = scan.nextInt();
        int ss = scan.nextInt();
        int pm = scan.nextInt();
        int sr = scan.nextInt();
        int ac = scan.nextInt();

        System.out.print(tr+br+ss-pm-sr-ac);

    }    
}