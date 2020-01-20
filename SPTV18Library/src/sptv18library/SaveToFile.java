package sptv18library;
import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Saveble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SaveToFile implements Saveble {
    public void saveBooks(List<Book> books) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Файла Books.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема записи в Books.txt", ex);
        }
    }
    public List<Book> loadBooks() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("Books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Book>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет файла Books.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема чтения Books.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс Books.txt", ex);
        }
        return new ArrayList<Book>();
    }
    
    
    public void saveReaders(List<Reader> readers) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("Readers.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(readers);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Файла Readers.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема записи в Readers.txt", ex);
        }
    }
    public List<Reader> loadReaders() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("Readers.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<Reader>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет файла Readers.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема чтения Readers.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс Readers.txt", ex);
        }
        return new ArrayList<Reader>();
    }
    
    
    public void saveHistory(List<History> history) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("History.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(history);
            objectOutputStream.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Файла History.txt не существует", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема записи в History.txt", ex);
        }
    }
    public List<History> loadHistory() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        
        try {
            fileInputStream = new FileInputStream("History.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<History>) objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Нет файла History.txt", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Проблема чтения History.txt", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE, "Неизвестный класс History.txt", ex);
        }
        return new ArrayList<History>();
    }
}