import java.util.*;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int passCount = 0;
        int failCount = 0;
        int maximum = 0;
        int totalScore = 0;

        for(int i = 0;i<n; i++) {
            String studentName = sc.next();
            int correctAnswers = sc.nextInt();
            int wrongAnswers = sc.nextInt();
            int unattempted = sc.nextInt();
            int score = (correctAnswers * 4) - (wrongAnswers * 3);
            maximum = Math.max(maximum, score);
            totalScore += score;
            String result;
            if(score >= score){
                result = "Pass";
                passCount++;
            } else {
                result = "Fail";
                failCount++;
            }
            System.out.println();
            System.out.println("Student: " + studentName);
            System.out.println("Correct: " + correctAnswers);
            System.out.println("Wrong: " + wrongAnswers);
            System.out.println("Unattempted: " + unattempted);
            System.out.println("Score: " + score);
            System.out.println("Result: " + result);
        }
        sc.close();
        double avg = (double) totalScore / n;
        System.out.println();
        System.out.println("Total Students: " + n);
        System.out.println("Pass Count: " + passCount);
        System.out.println("Fail Count: " + failCount);
        System.out.println("Class Average: " + avg);
        System.out.println("Highest Score: " + maximum);
        sc.close();
    }
}