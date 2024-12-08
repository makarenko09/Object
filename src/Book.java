public class Book {
    private String Author;
    private String title;
    private int realise;

    public Book(String author, String title, int realise) {
        this.Author = author;
        this.title = title;
        this.realise = realise;
    }

    public String getAuthor() {
        return this.Author;
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
