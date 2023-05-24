package pl.adampolsa;

public class Library {
    private Shelf[] shelves;

    public Library(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public void setShelves(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public int countAuthor(String author){
        int count = 0;
        for(Shelf shelf: shelves){
            for(Book book: shelf.getBooks()){
                if(book.getAuthor().equals(author)){
                    count++;
                }
            }
        }
        if(count != 0){
            return count;
        }
        throw new IllegalArgumentException("No books by this author have been found.");
    }
}
