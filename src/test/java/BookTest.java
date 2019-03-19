import org.junit.Before;

public class BookTest<book1><book2><book3><book3><book4> {

   public Book book;


   @Before
    public void setup(){
       book1 = new Book("sorry for being late", "technology", "Thomas Friedman");
       book2 = new Book("poverty safari", "social culture", "Darren McGarvie");
       book3 = new Book("faded map", "history", "Alistair Moffat");
       book4 = new Book("Independence an argument for", "politics", "Alistair Gray");

    }
}



//
//MVP
//        Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.
//Extensions:
//        Add a third class which interacts with the other two. E.g. you could add a Borrower with a
//        method that takes a Book and moves to the Borrower's collection.


