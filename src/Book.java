import java.lang.reflect.Method;
import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int releaseYear;

    public Book(Author author, String title, int releaseYear) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        checkIfMethodOverrides("toString");
        return "Book{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }


    //    public boolean equals (Author getAuthor, String toString) {
//        if (getAuthor.equals(author.toString()) || author.toString().equals(getAuthor)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public boolean equals(Object o) {
        checkIfMethodOverrides("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return releaseYear == book.releaseYear &&
                author.equals(book.author) &&
                title.equals(book.title);
    }
    //    hashCode
//    public String hashCode (Author getAuthor, String toString) {
//        int resultHashOfMethodGetAuthorAndToString = getAuthor.hashCode() + author.toString().hashCode();
////        int resultOfMethodToString = author.toString().hashCode();
//        return  "@" + resultHashOfMethodGetAuthorAndToString;
    public int hashCode() {
        checkIfMethodOverrides("hashCode");
        return Objects.hash(author, title, releaseYear);
    }

    private void checkIfMethodOverrides(String methodName) {
        try {
            Method[] methods = getClass().getSuperclass().getMethods();
            for (Method method : methods) {
                if (method.getName().equals(methodName)) {
                    System.out.println(methodName + " method overrides superclass method.");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Error checking if method overrides superclass method: " + e.getMessage());
    }
    }
}