package pl.javastart.task;

public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException() {
        super("Nieprawidłowy wiek!");
    }
}
