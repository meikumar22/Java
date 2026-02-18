import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int rpkg = scan.nextInt();
        int pc = scan.nextInt();
        int fees = scan.nextInt();
        int hc = scan.nextInt();
        int fs = scan.nextInt();

        System.out.print((w*rpkg)+pc+fees-hc-fs);

    }    
}
