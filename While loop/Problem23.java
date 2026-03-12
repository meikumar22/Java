import java.util.*;

public class Problem23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;

        int i = 0;
        do{

            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||ch == 'u' || ch == 'U'){
                    count++;
                }

                i++;
        }while(i < str.length());
        
        System.out.println("Text : " + str);
        System.out.println("Vowel count : " + count);
    }
}
