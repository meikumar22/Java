import java.util.*;

public class Problem2 {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        String name;
        int score;

        String grade = "";
        String status = "";
        int total_std = n;
        double class_average = 0;
        int highest_score = 0;

        int sum = 0;
        int count = 0;
        int count1 = 0;

        for(int i=0; i<n; i++){
            name = scan.next();
            score = scan.nextInt();

            if(score >=85 && score <=100)grade = "A";
            else if(score >= 70 && score <= 84)grade = "B";
            else if(score >= 60 && score <= 69)grade = "C";
            else if(score >= 50 && score <= 59)grade = "D";
            else if(score >= 0 && score <= 49)grade = "F";

            if(score >= 60){
                status = "Pass";
                count++;
            }
            else if(score < 60){
                status = "Fail";
                count1++;
            }


            sum = sum + score;

            if(highest_score < score){
                highest_score = score;
            }

            System.out.println(" ");
            System.out.println("Student : " + name);
            System.out.println("Score : " + score);
            System.out.println("Letter Grade : "+ grade);
            System.out.println("Status : " + status);
            System.out.println("");

        }
        class_average = sum/total_std;

        System.out.println("Total Students : " + total_std);
        System.out.println("Class Average : " + String.format("%.2f", class_average));
        System.out.println("Highest Score : " + highest_score);
        System.out.println("Students Passed : " + count);
        System.out.println("Students Failed : " + count1);
        
    }
}
