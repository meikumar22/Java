import java.util.*;

public class Problem12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int copy = num;

        int rev = 0;

        int i=0;
        while (num != 0) {
            
            rev = rev * 10 + num%10;
            num = num/10;

            i++;
        }
        if(copy == rev){
            System.out.println(copy + " is a palindrome");
        }
        else{
            System.out.println(copy + " is not a palindrome");
        }
    }
}
