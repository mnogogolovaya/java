package entity;
import java.io.Serializable;
public class Person implements Serializable {
    private String firstname;
    private String lastname;
    private String position;
    private String group;
    
    public Person() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getGroup() {
        return group;
    }
    
    public void setGroup(String group) {
        this.group = group;
    }
    
    @Override
    public String toString() {
        return "Person {" +" firstname= " + firstname + ", lastname= " + lastname + ", position = " + position + ", group = " + group + "}";
    }  
}
