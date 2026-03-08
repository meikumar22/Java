import java.util.*;

public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double high = Double.MIN_VALUE;
        double low = Double.MAX_VALUE;
        double totalTemp = 0;

        int highHour = 0;
        int lowHour = 0;
        int countCold = 0;
        int countHot = 0;

        for (int i = 0; i < n; i++) {
            int hour = sc.nextInt();
            double temp = sc.nextDouble();
            String status;
            if (temp > 40 || temp < 0) {
                status = "Extreme";
            }
            else if (temp > 32 && temp <= 40) {
                status = "Hot";
                countHot++;
            }
            else if (temp > 0 && temp <= 10) {
                status = "Cold";
                countCold++;
            }
            else {
                status = "Normal";
            }
            if (temp > high) {
                high = temp;
                highHour = hour;
            }

            if (temp < low) {
                low = temp;
                lowHour = hour;
            }

            totalTemp += temp;

            System.out.println();
            System.out.println("Hour " + hour + ": " + temp + "°C");
            System.out.println("Status: " + status);
        }
        System.out.println();
        System.out.println("Total Readings: " + n);
        System.out.println("Average Temperature: " +String.format("%.2f", totalTemp / n) + "°C");
        System.out.println("Highest Temperature: " + high + "°C at Hour " + highHour);
        System.out.println("Lowest Temperature: " + low + "°C at Hour " + lowHour);
        System.out.println("Cold Hours: " + countCold);
        System.out.println("Hot Hours: " + countHot);

        sc.close();
    }
}