package pl.javastart.task;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NameUndefinedException("Imię jest nieprawidłowe: " + firstName);
        }
        if (firstName.length() < 2) {
            throw new NameUndefinedException("Imię jest za krótkie: " + firstName);
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NameUndefinedException("Nazwisko jest nieprawidłowe: " + lastName);
        }
        if (lastName.length() < 2) {
            throw new NameUndefinedException("Nazwisko jest za krótkie: " + lastName);
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IncorrectAgeException("Nieprawidłowy wiek!");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Imię: " + firstName + ", nazwisko: " + lastName + ", wiek: " + age + ", PESEL: " + pesel;
    }
}
