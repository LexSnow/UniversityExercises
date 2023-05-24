package pl.adampolsa;

public class Shelf {
    private String id;
    private Book[] books;

    public Shelf(String id, Book[] books) {
        this.id = id;
        this.books = books;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
