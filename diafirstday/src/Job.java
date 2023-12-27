public class Job {
    private int jobId;
    private String jobAddress;
    private Position jobPosition;

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public Position getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(Position jobPosition) {
        this.jobPosition = jobPosition;
    }



    public Job(int jobId, String jobAddress, Position jobPosition) {
        this.jobId = jobId;
        this.jobAddress = jobAddress;
        this.jobPosition = jobPosition;
    }
}