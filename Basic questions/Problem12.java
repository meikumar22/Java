import java.util.*;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int count = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i=1; i<=5; i++){
            int num = scan.nextInt();

            if(num > 0){
                count++;
            }
            else if(num < 0){
                count1++;
            }
            else{
                count2++;
            }
        }

        System.out.println("Positive : " + count);
        System.out.println("Negative : " + count1);
        System.out.println("Zero : " + count2);
        
    }
}
