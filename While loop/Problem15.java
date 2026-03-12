import java.util.*;

public class Problem15 {    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n==1){
            System.out.println(n);
        }
        else{

            do{
            System.out.print(n + " ");

                if(n%2==0){
                    n = n/2;
                }
                else{
                    n = 3 * n+1;
                }
            }
            while(n > 1);

            System.out.println("1");
        }

    } 
}
