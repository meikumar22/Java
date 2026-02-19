import java.util.*;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        int per = scan.nextInt();

        if(income<200000 && per>=75){
            System.out.print("Granted");
        }
        else{
            System.out.print("Not Granted");
        }
    }
}
