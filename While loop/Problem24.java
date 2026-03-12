import java.util.*;

public class Problem24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int copy = a;
        int copy1 = b;

        int i=0;
        while (a!=b) {
            
            if(a > b){
                a = a - b;
            }
            else {
                b = b - a;
            }
            i++;
        }
        System.out.println("HCF of " + copy + " and " + copy1 + " = " + a);
    }
}
