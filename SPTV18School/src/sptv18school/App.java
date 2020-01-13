package sptv18school;
import entity.Journal;
import entity.Person;
import entity.Subject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import provider.ProviderPerson;
import provider.ProviderSubject;
import provider.ProviderJournal;
class App {
    List<Person> persons = new ArrayList<>();
    List<Subject> subjects = new ArrayList<>();
    List<Journal> journals = new ArrayList<>();
    SaveToFile saveToFile;
    
    public App() {
        saveToFile = new SaveToFile();
        persons.addAll(saveToFile.loadPersons());
        subjects.addAll(saveToFile.loadSubjects());
        journals.addAll(saveToFile.loadJournal());
    }
    
    public void run() {
        
        System.out.println("- - - Модель Учебного Заведения - - -");
        boolean repeat = true;
        
        do {
            System.out.println(" ");
            System.out.println("    Список задач: ");
            System.out.println("0. Выйти из программы.");
            System.out.println("1. Добавить нового ученика.");
            System.out.println("2. Вывести список учеников.");
            System.out.println("3. Добавить новый предмет.");
            System.out.println("4. Вывести список предметов.");
            System.out.println("5. Выставить оценку ученику по предмету.");
            System.out.println("6. Исправить существующую оценку.");
            System.out.println("7. Вывести оценки по предметам для конкретного ученика.");
            System.out.println("8. Вывести учеников и их оценки по предмету для учителя.");
            System.out.println("    Выбери номер задачи: ");
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("    Программа закрывается. ");
                    repeat = false;
                    break;
                
                case 1:
                    ProviderPerson providerPerson = new ProviderPerson();
                    Person person = providerPerson.createPerson();
                    
                    persons.add(person);
                    saveToFile.savePersons(persons);
                    
                    System.out.println("    Ученик инициирован: " + person.toString());
                    break;
                    
                case 2:
                    System.out.println("    Список учеников: ");
                    for (int i = 0; i < persons.size(); i++) {
                        System.out.println(i + 1 + ". " + persons.get(i).toString());
                    }
                    break;
                    
                case 3:
                    ProviderSubject providerSubject = new ProviderSubject();
                    Subject subject = providerSubject.createSubject();
                    
                    subjects.add(subject);
                    saveToFile.saveSubjects(subjects);
                    
                    System.out.println("    Предмет: инициирован: " + subject.toString());
                    break;
                    
                case 4:
                    System.out.println("    Список предметов: ");
                    for (int i = 0; i < subjects.size(); i++) {
                        System.out.println(i + 1 + ". " + subjects.get(i).toString());
                    }
                    break;
                    
                case 5:
                    ProviderJournal providerJournal = new ProviderJournal();
                    Journal journal = providerJournal.createJournal(persons, subjects);
                    break;
                    
                case 6:
                    
                    break;
                    
                case 7:
                    
                    break;
                    
                case 8:
                    
                    break;
            }
        } while (repeat);
    }
}