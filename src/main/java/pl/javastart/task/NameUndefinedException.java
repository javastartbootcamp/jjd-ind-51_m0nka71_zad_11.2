package pl.javastart.task;

public class NameUndefinedException extends RuntimeException {

    public NameUndefinedException() {
        super("Nazwisko jest nieprawidłowe!");
    }
}
