import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a>b && a>c){
            System.out.println("Largest number : " + a);
        }
        else if(b>a && b>c){
            System.out.println("Largest number : " + b);
        }
        else{
            System.out.println("Largest number : " + c);
        }
    }
}
