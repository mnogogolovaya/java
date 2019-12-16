package provider;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class ProviderHistory {
    public History createHistory(List <Book> books, List <Reader> readers) {
        History history = new History();
        Scanner scanner = new Scanner(System.in);
        Book book;
        Reader reader;
                    
        System.out.println("  Список книг: ");
        for (int i = 0; i < books.size(); i++) {
            book = books.get(i);
            System.out.println(i + 1 + ". " + book.toString());
        }
                    
        System.out.println(" Выберите номер книги: ");
        int numBooks = scanner.nextInt();
        history.setBook(books.get(numBooks - 1));
                    
        System.out.println("  Список читателей: ");
        for (int i = 0; i < readers.size(); i++) {
            reader = readers.get(i);
            System.out.println(i + 1 + ". " + reader.toString());
        }
                    
        System.out.println(" Выберите номер читателя: ");
        int numReader = scanner.nextInt();
        history.setReader(readers.get(numReader - 1));
        history.setGiveOutBook(new Date());
        
        return history;
    }
}
