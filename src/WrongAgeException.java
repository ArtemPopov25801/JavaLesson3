
public class WrongAgeException extends Exception {

    private int age;

    public WrongAgeException() {
        super();
    }

    public WrongAgeException(String message) {
        super(message);
    }

    public WrongAgeException(int age, String message) {
        super(message);
        this.age = age;
    }

    @Override
    public String toString() {
        return "[WrongAgeException]: " + this.getMessage() + "\nAge: " + this.age;
    }
}
