package provider;
import entity.Person;
import java.util.Scanner;
public class ProviderPerson {
        public Person createPerson() {
        Person person = new Person();
        Scanner scanner = new Scanner (System.in);
                    System.out.println("    Имя: ");
                    String firstname = scanner.nextLine();
                    person.setFirstname(firstname);                   
                    
                    System.out.println("    Фамилия: ");
                    String lastname = scanner.nextLine();
                    person.setLastname(lastname);                    
                    
                    System.out.println("    Положение (предподаватель/ученик: ");
                    String position = scanner.nextLine();
                    person.setPosition(position);
                    
                    System.out.println("    Группа: ");
                    String group = scanner.nextLine();
                    person.setGroup(group);
        return person;
    }
}
