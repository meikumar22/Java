import java.util.*;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int heartRate = scan.nextInt();
        scan.nextLine();
        String bloodPressure = scan.nextLine();
        String[] bpParts = bloodPressure.split("/");
        int systolic = Integer.parseInt(bpParts[0]);
        double temperature = scan.nextDouble();
        scan.nextLine();
        String severity = scan.nextLine();

        System.out.println("Heart Rate: " + heartRate + " bpm");
        System.out.println("Blood Pressure: " + bloodPressure);
        System.out.println("Temperature: " + temperature + "°F");
        System.out.println("Symptom Severity: " + severity);

        if (heartRate < 50 || heartRate > 130 ||
            systolic > 180 || systolic < 90 ||
            temperature > 103 || temperature < 96 ||
            severity.equals("Life-Threatening")) {

            System.out.println("Triage Priority: Critical");
            System.out.println("Estimated Wait Time: 0 minutes");
            System.out.println("Recommended Action: Immediate Emergency Care");
        }

        else if ((heartRate >= 50 && heartRate <= 60) ||
                 (heartRate >= 110 && heartRate <= 130) ||
                 (systolic >= 160 && systolic <= 180) ||
                 (systolic >= 90 && systolic <= 100) ||
                 (temperature >= 101 && temperature <= 103) ||
                 (temperature >= 96 && temperature <= 97) ||
                 severity.equals("Severe")) {

            System.out.println("Triage Priority: Urgent");
            if(severity.equals("Severe")){
                System.out.println("Estimated Wait Time: 15 minutes");
            }
            else{
                System.out.println("Estimated Wait Time: 20 minutes");
            }
            System.out.println("Recommended Action: Priority Medical Attention");
        }

        else if (severity.equals("Moderate")) {
            System.out.println("Triage Priority: Standard");
            System.out.println("Estimated Wait Time: 45 minutes");
            System.out.println("Recommended Action: Standard Examination");
        }

        else {
            System.out.println("Triage Priority: Non-Urgent");
            System.out.println("Estimated Wait Time: 90 minutes");
            System.out.println("Recommended Action: Routine Check-up");
        }

        scan.close();
    }
}