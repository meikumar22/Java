import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cpy = scan.nextInt();
        int ccpy = scan.nextInt();
        int ec = scan.nextInt();
        int dc = scan.nextInt();
        int dis = scan.nextInt();
        int me = scan.nextInt();

        System.out.print((cpy*ccpy)+ec+dc-dis-me);
    }
}
