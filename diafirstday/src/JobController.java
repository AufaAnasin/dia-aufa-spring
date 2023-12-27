import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JobController {

    // cara bikin array
    private List<Job> jobList;

    public JobController() {
        this.jobList = new ArrayList<>();
    }
    // cara bikin array eof

    public void addJob(Job job) {
        jobList.add(job);
        System.out.println("Job added");
    }
    public void printAllJobs() {
        if (jobList.isEmpty()) {
            System.out.println("No Jobs in List");
        } else {
            System.out.println("All Jobs");
            for(Job job: jobList) {
                System.out.println(job.toString());
            }
        }
    }
    public void deleteJobById(int jobId) {
        Iterator<Job> iterator = jobList.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getJobId() == jobId) {
                iterator.remove();
                System.out.println("Job" +jobId+"Deleted");
                return;
            }
        }
        System.out.println("Job ID" +jobId+ "Not found");
    }
}
