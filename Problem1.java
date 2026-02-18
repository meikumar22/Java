import java.util.*;

public class Problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int theory_mark = scan.nextInt();
        int practical_mark = scan.nextInt();

        int avg = (theory_mark + practical_mark)/2;

        if(theory_mark>=50 && practical_mark>=50){
            if(avg>=60){
                System.out.println("Result : Pass");
            }
            else{
                System.out.println("Result : Fail");
            }
        }
        else{
            System.out.print("Result : Fail");
        }
    }
}