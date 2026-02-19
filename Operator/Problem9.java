import java.util.*;

public class Problem9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username 1 or 0 : ");
        int username = scan.nextInt();
        System.out.print("Enter password 1 or 0 : ");
        int password = scan.nextInt();
        System.out.print("Enter accountlocked 1 or 0 : ");
        int accountlocked = scan.nextInt();

        if(username!=0 && password!=0){
            if(accountlocked==0){
                System.out.print("Login Success");
            }
            else{
                System.out.print("Login failed");
            }
        }
        else{
            System.out.print("Login failed");
        }
    }
}
