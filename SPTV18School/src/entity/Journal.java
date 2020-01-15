package entity;
import java.io.Serializable;
import java.util.Date;
public class Journal implements Serializable {
    private Person person;
    private Subject subject;
    private String mark;
    private Date settingMark;
    private Date correctionMark;
    
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
    
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public Date getSettingMark() {
        return settingMark;
    }

    public void setSettingMark(Date settingMark) {
        this.settingMark = settingMark;
    }
    
    public Date getCorrectionMark() {
        return correctionMark;
    }

    public void setCorrectionMark(Date correctionMark) {
        this.correctionMark = correctionMark;
    }
    
    
    @Override
    public String toString() {
        return "Journal {" + " person = " + person + ", subject = " + subject + 
                ", mark = " + mark + ", settingMark = " 
                + settingMark + ", correctionMark = " + correctionMark +"}";
    }
    
}
