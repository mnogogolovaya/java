package entity;
import java.io.Serializable;
public class Book implements Serializable {
    private String title;
    private String author;
    private int publishedYear;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", publishedYear=" + publishedYear + '}';
    }
    
}
