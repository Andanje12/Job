public class JobPricing {

    private String jobName;
    private double materialCost;
    private int workHours;
    private int travelHours;

    //Constant of pricing
    public static final double WORK_HOURLY_RATE = 35.0;
    public static final double TRAVEL_HOURLY_RATE = 12.0;

    //Constructor
    public JobPricing(String jobName,double materialCost, int workHours,int travelHours){
        this.jobName = jobName;
        this.materialCost = materialCost;
        this.workHours = workHours;
        this.travelHours = travelHours;
    }
    //calculation
    public double computeEstimate(){
        return materialCost + (workHours * WORK_HOURLY_RATE) + (travelHours * TRAVEL_HOURLY_RATE);
    }
    //Method to display the job details
    public void displayJobDetails(){
        System.out.printf("Job name: %s%nEstimated Price: $%.2f%n",jobName,computeEstimate());
    }

}
