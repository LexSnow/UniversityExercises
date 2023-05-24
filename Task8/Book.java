package pl.adampolsa;

public class Book {
    private String author;
    private String title;
    private String body;

    public Book(String author, String title, String body) {
        this.author = author;
        this.title = title;
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
