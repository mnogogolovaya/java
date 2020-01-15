package provider;
import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class ProviderJournal {
    public Journal createJournal(List<Person> persons, List<Subject> subjects) {
        Scanner scanner = new Scanner (System.in);
        Person person;
        Subject subject;
        Journal journal = new Journal();
                    System.out.println("    Список учеников: ");
                    for (int i = 0; i < persons.size(); i++) {
                        person = persons.get(i);
                        System.out.println(i + 1 + ". " + persons.toString());
                    }
                    
                    System.out.println("    Выберите номер: ");
                    int numPersons = scanner.nextInt();
                    journal.setPerson(persons.get(numPersons-1));
                    
                    
                    
                    System.out.println("   Список предметов: ");
                    
                    for (int i = 0; i < subjects.size(); i++) {
                        subject = subjects.get(i);
                        System.out.println(i+1+". "+subject.toString());
                    }
                    
                    System.out.println("    Выберите номер предмета: ");
                    int numSubject = scanner.nextInt();
                    journal.setSubject(subjects.get(numSubject-1));
                    journal.setSettingMark(new Date());
                    
                    
                    System.out.println("    Введите оценку: ");
                    String mark = scanner.nextLine();
                    journal.setMark(mark);
                    
        return journal;
    }
}
