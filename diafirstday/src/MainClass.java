import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JobController jobController = new JobController();
        while(true) {
            System.out.println("============DIGIJOBS============");
            System.out.println("Please choose the following command: ");
            System.out.println("1. Add new job");
            System.out.println("2. Print all jobs");
            System.out.println("3. Delete job");
            System.out.println("4. Exit");
            int inputCommand = scanner.nextInt();
            if (inputCommand == 1) {
                System.out.println("Please input new job using following format : [job_id], [job_address], [job_position_id], [job_position_name]");
                String jobInput = scanner.nextLine();
                // make the inputted value in the array
                String[] jobDetails = jobInput.split(",");
//                Job job = new Job();
            } else if (inputCommand == 2) {
                jobController.printAllJobs();
            } else if (inputCommand == 3) {
                System.out.println("This is option 3");
            } else {
                break;
            }
        }
    }
}
