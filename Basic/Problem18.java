import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int rc = scan.nextInt();
            int sa = scan.nextInt();
            int sr = scan.nextInt();
            int sc = scan.nextInt();
            int cc = scan.nextInt();
            int mc = scan.nextInt();

            int total = (rc+sa+sr-sc-cc-mc);
            System.out.println(total);

    }
    
}

