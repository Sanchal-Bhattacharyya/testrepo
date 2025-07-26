import metrics.BodyMetrics;
import report.BodyReport;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        String age = sc.nextLine();
        System.out.println("Enter your height in metre(s): ");
        double height = sc.nextDouble();
        System.out.println("Enter your weight in kg(s): ");
        double weight = sc.nextDouble();

        BodyReport bodyReport = new BodyReport(name, age, new BodyMetrics(height, weight));
        bodyReport.printBodyReport();
    }
}
