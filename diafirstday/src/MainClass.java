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
                //for multiline input
                Scanner scannerline = new Scanner(System.in);
                String jobInput = scannerline.nextLine();
//                 make the inputted value in the array
                String[] jobDetails = jobInput.split(",");
                Position position = new Position(Integer.parseInt(jobDetails[2]), jobDetails[3]);
                Job job = new Job(Integer.parseInt(jobDetails[0]), jobDetails[1], position);
                jobController.addJob(job);
            } else if (inputCommand == 2) {
                jobController.printAllJobs();
            } else if (inputCommand == 3) {
                System.out.println("Please input job id to delete :");
                Scanner scannerdelete = new Scanner(System.in);
                int deleteInput = scannerdelete.nextInt();
                jobController.deleteJobById(deleteInput);
            } else {
                break;
            }
        }
    }
}
