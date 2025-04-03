import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter job name: ");
        String jobName = scanner.nextLine();

        System.out.print("Enter the cost of the materials: ");
        double materialCost = scanner.nextDouble();

        System.out.print("Enter number of work hours: ");
        int workHours = scanner.nextInt();

        System.out.print("Enter number of travel hours: ");
        int travelHours = scanner.nextInt();

        //CREATING JOB PRICING OBJECT
        JobPricing job = new JobPricing(jobName, materialCost, workHours, travelHours);

        job.displayJobDetails();

        scanner.close();

    }
}