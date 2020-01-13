package sptv18library;
import entity.Book;
import entity.History;
import java.util.List;
import java.util.Scanner;
public class Tools {
    Scanner scanner = new Scanner(System.in);
    public void printTakeTheBooks(List<History> histories) {
        int n = 1;
        for (int i = 0; i < histories.size(); i++) {
            History history = histories.get(i);
            if(history.getReturnBook() == null) {
                System.out.printf("%d. Книгу \"%s\" читает %s %s%n"
                    ,n
                    ,history.getBook().getTitle()
                    ,history.getReader().getFirstname()
                    ,history.getReader().getLastname());
                n++;
            }
        }
    }

    void printListBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + 1 + ". " + books.get(i).toString());
        }
        System.out.println("    Для редактирования книги введите её порядковый номер. ");
        System.out.println("    Если не хотите ничего исправлять, введите 0: ");
        int indexBox = scanner.nextInt();
        scanner.nextLine();
        if(0 != indexBox) {
            Book book = books.get(indexBox - 1);
            book = editBook(book);
            books.set(indexBox-1, book);
        }
    }
    
    private Book editBook(Book book) {
        System.out.println("    Введите правильное значение: ");
        
        System.out.println("Заголовок: ");
        System.out.println(book.getTitle());
        System.out.println("    Исправить на: ");
        String newTitle = scanner.nextLine();
        System.out.println(" ");
        
        System.out.println("Автор: ");
        System.out.println(book.getAuthor());
        System.out.println("    Исправить на: ");
        String newAuthor = scanner.nextLine();
        System.out.println(" ");
        
        System.out.println("Год издания: ");
        System.out.println(book.getPublishedYear());
        System.out.println("    Исправить на: ");
        int newPublishedYear = scanner.nextInt();
        System.out.println(" ");
        scanner.nextLine();
        
        if(!"0".equals(newTitle)){
           book.setTitle(newTitle); 
        }
        if(!"0".equals(newAuthor)){
           book.setAuthor(newAuthor); 
        }
        if(0 != newPublishedYear){
           book.setPublishedYear(newPublishedYear); 
        }
        
        return book;
    }
}
