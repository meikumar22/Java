import java.util.*;

public class Problem7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        System.out.print("Choice : ");
        int n = scan.nextInt();
        int a;
        int b;

        int result = 0;

        int i=0;
        do{
            if(n >= 1 && n <= 4){
                System.out.print("Enter two number : ");
                a = scan.nextInt();
                b = scan.nextInt();

                if(n == 1){
                    result = a + b;
                    System.out.println("Result : " + result);
                    break;
                } 
                else if(n == 2){
                    result = a - b;
                    System.out.println("Result : " + result);
                    break;
                }
                else if(n == 3){
                    result = a * b;
                    System.out.println("Result : " + result);
                    break;
                }
                else if(n == 4){
                    if(a > 0){
                        result = a / b;
                        System.out.println("Result : " + result);
                        break;
                }
                System.out.println("It is not divisible by a.");
                }
            }
            else {
            System.out.println("Goodbye!");
            break;
           }

           i++;
           
        }while(n > 0);
    }
}
