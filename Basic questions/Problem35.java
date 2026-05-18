import java.util.*;

public class Problem35 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while(true){

            int num = scan.nextInt();

            if(num > 0){
                System.out.println("You entered : " + num);
            }
            else{
                System.out.println("Negative number encounted! Exiting loop");
                break;
            }
            
        }
            
        
    }
}
