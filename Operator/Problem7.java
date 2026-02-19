import java.util.*;

public class Problem7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int card = scan.nextInt();
        System.out.print("Enter your permium 0 or 1 : ");
        int permium_mumber = scan.nextInt();

        if(permium_mumber==1){
            if(999<card || 999>card){
                System.out.print("Free shipping");                
            }
        }
        else if(permium_mumber==0){
            if(999<card){
                System.out.print("Free shipping");
            }
            else{
                System.out.print("Shipping charges applied");
            }
        }
        else{
            System.out.print("Enter valid permium");
        }
    }
}

