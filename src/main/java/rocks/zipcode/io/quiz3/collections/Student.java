package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    ArrayList<Lab> labs;


    public Student() {
        labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = (ArrayList<Lab>) labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if(labName.equalsIgnoreCase(lab.getName())){
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if(labs.size() <= 0){
            throw new UnsupportedOperationException();
        }
        for (Lab lab : labs) {
            if(lab.getName().equalsIgnoreCase(labName)){
                lab.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labs.add(0,lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if(labName.equalsIgnoreCase(lab.getName())){
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Lab lab : labs) {
            builder.append(lab.getName()).append(" > ").append(lab.getStatus()).append("\n");
        }
        return builder.substring(0,builder.length()-1);
    }
}
