import java.util.*;

public class Problem20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int storageGB = sc.nextInt();
        int users = sc.nextInt();
        sc.nextLine();
        String backup = sc.nextLine();
        String support = sc.nextLine();

        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + users);
        System.out.println("Backup Frequency: " + backup);
        System.out.println("Support Tier: " + support);

        double baseStorage = 0;
        double perUserFee = 0;
        double backupPremium = 0;
        double supportFee = 0;

        if(storageGB <= 100)
            baseStorage = storageGB * 0.05;
        else if(storageGB <= 500)
            baseStorage = 25;
        else if(storageGB <= 1000)
            baseStorage = 40;
        else
            baseStorage = 200;

        if(users <= 10)
            perUserFee = users * 5;
        else if(users <= 50)
            perUserFee = users * 4;
        else
            perUserFee = users * 3;

        if(backup.equals("Daily"))
            backupPremium = 0;
        else if(backup.equals("Hourly"))
            backupPremium = 15 + (0.5 * users);
        else if(backup.equals("Real-Time"))
            backupPremium = 50 + users;

        if(support.equals("Community"))
            supportFee = 0;
        else if(support.equals("Standard"))
            supportFee = 20;
        else if(support.equals("Priority"))
            supportFee = 75;
        else if(support.equals("Enterprise"))
            supportFee = 200;

        double monthly = baseStorage + perUserFee + backupPremium + supportFee;
        double annual = monthly * 12 * 0.9;

        String plan = "";
        String features = "";

        if(users == 1){
            plan = "Personal";
            features = "Basic storage, file sync";
        }
        else if(users <= 20){
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        }
        else if(users < 100){
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        }
        else{
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Base Storage Cost: $" + baseStorage);
        System.out.println("Per-User Fee: $" + perUserFee);
        System.out.println("Backup Premium: $" + backupPremium);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + annual + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);

        sc.close();
    }
}