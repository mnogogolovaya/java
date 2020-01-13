package provider;
import entity.Subject;
import java.util.Scanner;
public class ProviderSubject {
    public Subject createSubject() {
        Subject subject = new Subject();
        Scanner scanner = new Scanner (System.in);
                    System.out.println("    Название предмета: ");
                    String titlesubject = scanner.nextLine();
                    subject.setTitlesubject(titlesubject);                   
                    
                    System.out.println("    Часы: ");
                    int hours = scanner.nextInt();
                    scanner.nextLine();
                    subject.setHours(hours);                    
                    
                    System.out.println("    Предподаватель: ");
                    String teacher = scanner.nextLine();
                    subject.setTeacher(teacher);
                    
        return subject;
    }
}