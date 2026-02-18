import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int fees = scan.nextInt();
        int per = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int total = fees - (fees*per/100);
        int total1 = total + a + b;
        

        System.out.print(total1);
    }
    
}