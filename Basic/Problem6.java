import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dis = scan.nextInt();
        int mil = scan.nextInt();
        int fuel = scan.nextInt();
        int toll = scan.nextInt();

        int total1 = dis/mil;
        int total2 = total1*fuel+toll;

        System.out.print(total2);
    }
    
}
