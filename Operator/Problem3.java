import java.util.*;

public class Problem3 {
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int workinghours = scan.nextInt();
        int attendancePercentage = scan.nextInt();
        
        if(workinghours>40 && attendancePercentage>90){
            System.out.println("Eligible");
        }
        else{
            System.out.print("Not Eligible");
        }
    }
}

