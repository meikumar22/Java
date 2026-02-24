import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dh = scan.nextInt();
        int hr = scan.nextInt();
        int dc = scan.nextInt();
        int tc = scan.nextInt();
        int ap = scan.nextInt();

        int projectcost = ((dh*hr)+dc+tc-ap);
        System.out.print(projectcost);
    }
    
}

