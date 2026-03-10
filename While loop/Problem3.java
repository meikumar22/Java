import java.util.*;

public class Problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int guess;

        int count = 0;

        int i=0;
        while (i>=0) {
            System.out.print("Enter number : ");
            guess = scan.nextInt();

            if(n == guess){
                count++;
                System.out.println("Correct! Attempts : " + count);
                break;
            }
            else if(n < guess){
                count++;
                System.out.println("Too high!");
            }
            else if(n > guess){
                count++;
                System.out.println("Too low!");
            }

            i++;
        }
    }
}
