import java.util.*;

public class Problem5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int contions_day;
        int rooms_occupied;
        int totalrooms;

        double occupancy_rate = 0;
        String status = "";
        int total_days_analyzed = n;
        double average_occupancy_rate = 0;
        int peak_occupancy_day = 0;

        double sum = 0;
        double max = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            contions_day = scan.nextInt();
            rooms_occupied = scan.nextInt();
            totalrooms = scan.nextInt();

            occupancy_rate = (double)rooms_occupied / totalrooms * 100.0;

            if(occupancy_rate < 60)status = "Low";
            else if(occupancy_rate >= 60 && occupancy_rate <= 79)status = "Moderate";
            else if(occupancy_rate >= 80 && occupancy_rate <= 99)status = "High";
            else if(occupancy_rate >= 100)status = "Full";

            sum = sum + occupancy_rate;

            if(max < occupancy_rate){
                max = occupancy_rate;
                peak_occupancy_day = contions_day;
            }

            if(occupancy_rate == 100.0){
                count++;
            }

            System.out.println("");
            System.out.println("Rooms Occupied : " + rooms_occupied);
            System.out.println("Total Rooms : " + totalrooms);
            System.out.println("Occupancy Rate : "+String.format("%.1f",occupancy_rate) + '%');
            System.out.println("Status : " + status);
            System.out.println("");

        }

        average_occupancy_rate = sum/n;

        System.out.println("Total Days Analyzed : " + total_days_analyzed);
        System.out.println("Average Occupancy Rate : " + String.format("%.2f", average_occupancy_rate) + '%');
        System.out.println("Peak Occupancy Day : Day " + peak_occupancy_day);
        System.out.println("Days at Full Capacity : " + count);

    }

}
