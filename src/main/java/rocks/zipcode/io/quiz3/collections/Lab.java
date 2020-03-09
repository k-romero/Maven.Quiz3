package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private LabStatus labStatus;
    private String labName;

    public Lab() {
        this(null);
        this.labStatus = LabStatus.PENDING;
    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {
        return labName;
    }

    public void setStatus(LabStatus labStatus) {
        if(labStatus == LabStatus.COMPLETED){
            this.labStatus = LabStatus.COMPLETED;
        } else if(labStatus == LabStatus.INCOMPLETE){
//            this.labStatus = LabStatus.
        }

    }

    public LabStatus getStatus() {
        return labStatus;
    }
}
