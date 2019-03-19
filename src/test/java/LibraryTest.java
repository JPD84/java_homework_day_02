import org.junit.Before;
import org.junit.Test;

public class LibraryTest {

    public Library library;
    public Book book;


    @Before
    public void setup(){
       book = new Book("127 hours", "real life drama", "Aron Ralston");
    }

    @Test
    public void addBook(){
        assertEquals(1, library.addBook);
    }
}
