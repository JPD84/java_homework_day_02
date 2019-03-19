public class Library {

    private String name;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;

    };

    public int bookCount() {
        return this.books.size();
    }

}

