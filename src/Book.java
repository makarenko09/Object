public class Book {
    private Author author;
    private String title;
    private int realise;

    public Book(Author author, String title, int realise) {
        this.author = author;
        this.title = title;
        this.realise = realise;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getRealiseYear() {
        return this.realise;
    }

    public void setRealiseYear(int realise) {
        this.realise = realise;
    }

}