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
        return this.author;
    }

    public String toString() {
        // Используйте метод toString() класса Author для получения информации о авторе
        return "AuthorFromClass:= " + author.toString();
    }

    public boolean equals (Author getAuthor, String toString) {
        if (getAuthor.equals(author.toString()) || author.toString().equals(getAuthor)) {
            return true;
        } else {
            return false;
        }
    }

    //    hashCode
    public String hashCode (Author getAuthor, String toString) {
        int resultHashOfMethodGetAuthorAndToString = getAuthor.hashCode() + author.toString().hashCode();
//        int resultOfMethodToString = author.toString().hashCode();
        return  "@" + resultHashOfMethodGetAuthorAndToString;

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