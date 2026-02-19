import java.util.*;

public class Problem8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.print("Enter the id proof : ");
        int id = scan.nextInt();

        if(age>=18 && id==1){
            System.out.print("Entry allowed");
        }
        else{
            System.out.print("Enter denied");
        }
    }
}
