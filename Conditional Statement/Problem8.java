import java.util.*;

public class Problem8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String location = scan.nextLine();
        int squareFootage = scan.nextInt();
        int age = scan.nextInt();
        int amenityScore = scan.nextInt();

        double basePricePerSqFt = 0;
        double ageAdjustment = 0;
        double amenityBonus = 0;
        String marketCategory = "";

        if (location.equals("Prime")) {
            basePricePerSqFt = 400;
        } else if (location.equals("Urban")) {
            basePricePerSqFt = 300;
        } else if (location.equals("Suburban")) {
            basePricePerSqFt = 180;
        } else if (location.equals("Rural")) {
            basePricePerSqFt = 100;
        }

        if (age >= 0 && age <= 5) {
            ageAdjustment = 0;
        } else if (age >= 6 && age <= 15) {
            ageAdjustment = -5;
        } else if (age >= 16 && age <= 30) {
            ageAdjustment = -15;
        } else if (age >= 31) {
            ageAdjustment = -25;
        }

        double baseValue = squareFootage * basePricePerSqFt;
        double adjustedValue = baseValue * (1 + ageAdjustment / 100);

        if (amenityScore >= 80 && amenityScore <= 100) {
            amenityBonus = baseValue * 0.10;
        } else if (amenityScore >= 60 && amenityScore <= 79) {
            amenityBonus = baseValue * 0.05;
        } else if (amenityScore >= 40 && amenityScore <= 59) {
            amenityBonus = baseValue * 0.02;
        } else {
            amenityBonus = 0;
        }

        double finalValue = adjustedValue + amenityBonus;

        if ((location.equals("Prime") || location.equals("Urban")) && age < 15) {
            marketCategory = "Hot";
        } else if (location.equals("Suburban")) {
            marketCategory = "Stable";
        } else if (location.equals("Rural") || age > 30) {
            marketCategory = "Slow";
        }

        System.out.println("Location Tier: " + location);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + age + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustment + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

        scan.close();
    }
}

