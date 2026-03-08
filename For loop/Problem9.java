import java.util.*;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalCalories = 0;
        int totalDuration = 0;

        for(int i=1;i<=n;i++){
            String exerciseType = sc.next();
            int durationMinutes = sc.nextInt();

            int calories = 0;
            String intensity="";

            totalDuration+=durationMinutes;
            
            if(exerciseType.equals("Running")){
                calories=10*durationMinutes;
                intensity="High intensity";
            }
            else if(exerciseType.equals("Swimming")){
                calories=12*durationMinutes;
                intensity="High intensity";
            }
            else if(exerciseType.equals("Cycling")){
                calories=8*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equals("Gym")){
                calories=7*durationMinutes;
                intensity="Moderate";
            }
            else if(exerciseType.equals("Walking")){
                calories=4*durationMinutes;
                intensity="Low";
            }
            totalCalories+=calories;
            System.out.println();
            System.out.println("Session "+i+" :"+exerciseType);
            System.out.println("Duration: "+durationMinutes+"minutes");
            System.out.println("Calories Burned: "+calories);
            System.out.println("Intensity: "+intensity);
        }
        sc.close();
        int avg =totalCalories/n;
        String Total ="";
        if(totalCalories<300){
            Total="Beginner";
        }
        else if(totalCalories>=300 && totalCalories<=1000){
            Total="Intermediate";
        }
        else if(totalCalories > 1000){
            Total="Advanced";
        }
        System.out.println();
        System.out.println("Total Workouts: "+n);
        System.out.println("Total Duration: "+totalDuration+" minutes");
        System.out.println("Total Calories Burned: "+totalCalories);
        System.out.println("Average Calories per Session: "+(double)avg);
        System.out.println("Fitness Level: "+Total);
        sc.close();
    }
    
}
