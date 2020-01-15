package entity;
import java.io.Serializable;
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String subjectTitle;
    private int hours;
    private String teacher;
    
    public Subject() {
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

   public void setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    
    @Override
    public String toString() {
        return "Subject {" + " subjectTitle = " + subjectTitle + ", hours = " + hours + ", teacher = " + teacher + "}";
    }
}
