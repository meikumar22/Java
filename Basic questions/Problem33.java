import java.util.*;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        switch (str) {
            case "red":
                {
                    System.out.println("Stop");
                    break;
                }
            case "yellow":
                {
                    System.out.println("Wait");
                    break;
                }
            case "green":
                {
                    System.out.println("Go");
                    break;
                }
        
            default:
                {
                    System.out.println("Invalid color");
                    break;
                }
        }
    }
}
