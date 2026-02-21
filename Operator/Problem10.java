import java.util.*;

public class Problem10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int units = scan.nextInt();
        System.out.print("Enter voltagefluctuation 0 or 1 : ");
        int voltage = scan.nextInt();

        if(500<units || voltage==1){
            System.out.print("Alert");
        }
        else{
            System.out.print("Normal");
        }
    }
}

