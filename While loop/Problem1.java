import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        String pass;

        String copy = password;
        int n = 0;

        int i = 1;
        while (i <= 3) {
            System.out.println("Enter password : ");
            pass = scan.next();
            
            if(pass.equals(copy)){
                System.out.println("Access granted!");
                break;
            }
            else if(i == 3){
                System.out.println("Account locked!");
            }
            else {
                n = 3 - i;
                System.out.println("Incorrect! Attempts remaining : " + n);
            }

            i++;
        }
    }
}
