package entity;
import java.io.Serializable;
import java.util.Date;
public class Journal implements Serializable {
    private Person person;
    private Subject subject;
    private int assessment;
    private Date settingAssessment;
    private Date correctionAssessment;
    
    public Person getPerson() {
        return person;
    }
    
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    
    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }
    
    public Date getSettingAssessment() {
        return settingAssessment;
    }

    public void setSettingAssessment(Date settingAssessment) {
        this.settingAssessment = settingAssessment;
    }
    
    public Date getCorrectionAssessment() {
        return correctionAssessment;
    }

    public void setCorrectionAssessment(Date correctionAssessment) {
        this.correctionAssessment = correctionAssessment;
    }
    
    @Override
    public String toString() {
        return "Journal {" + " person = " + person + ", subject = " + subject + 
                ", assessment = " + assessment + ", settingAssessment = " 
                + settingAssessment + ", correctionAssessment = " + correctionAssessment +"}";
    }
    
}
