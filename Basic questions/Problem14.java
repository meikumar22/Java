import java.util.*;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();

        if(mark >= 90 && mark <= 100){
            System.out.println("Grade A");
        }
        else if(mark >= 80 && mark <= 89){
            System.out.println("Grade B");
        }
        else if(mark >= 70 && mark <= 79){
            System.out.println("Grade C");
        }
        else if(mark >= 60 && mark <= 69){
            System.out.println("Grade D");
        }
        else if(mark >= 50 && mark <= 59){
            System.out.println("Grade E");
        }
        else if(mark < 0){
            System.out.println("Invalid Mard");
        }
        else{
            System.out.println("Fail");
        }
    }
}
