package entity;
import java.io.Serializable;
public class Subject implements Serializable {
    private static final long serialVersionUID = 1L;
    private String titlesubject;
    private int hours;
    private String teacher;
    
    public Subject() {
    }

    public String getTitlesubject() {
        return titlesubject;
    }

   public void setTitlesubject(String titlesubject) {
        this.titlesubject = titlesubject;
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
        return "Subject {" + " titleSubject = " + titlesubject + ", hours = " + hours + ", teacher = " + teacher + "}";
    }
}
