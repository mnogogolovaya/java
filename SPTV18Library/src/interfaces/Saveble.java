package interfaces;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;
public interface Saveble {
    public void saveBooks(List<Book> books);
    public List<Book> loadBooks();
    public void saveReaders(List<Reader> readers);
    public List<Reader> loadReaders();
    public void saveHistory(List<History> history);
    public List<History> loadHistory();
}
