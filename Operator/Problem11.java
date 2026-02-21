import java.util.*;

public class Problem11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int basebox = scan.nextInt();
        int level = scan.nextInt();

        int total_capacity = basebox<<level;

        System.out.print(total_capacity);
    }
}

