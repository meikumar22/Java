import java.util.*;

public class Problem12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int file = scan.nextInt();
        int compression = scan.nextInt();

        int compressed_size = file>>compression;

        System.out.print(compressed_size);
    }
}
