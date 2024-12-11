import java.lang.reflect.Method;
import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        checkIfMethodOverrides("toString");
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        checkIfMethodOverrides("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && surname.equals(author.surname);
    }


public int hashCode() {
    checkIfMethodOverrides("hashCode");
    return Objects.hash(name, surname);
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