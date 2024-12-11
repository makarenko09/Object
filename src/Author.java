public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String toString() {
        return "Name: " + getName() + ", Surname: " + getSurname();
    }

    public boolean equals (String name, String surname) {
        if (name.equals(surname) || surname.equals(name)) {
            return true;
        } else {
            return false;
        }
    }

    public String hashCode (String name, String surname) {
        int resultHashOfMethodStringNameAndSurename = this.name.hashCode()+ this.surname.hashCode();
        return  "@" + resultHashOfMethodStringNameAndSurename;

    }

}
