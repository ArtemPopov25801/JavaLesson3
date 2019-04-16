
public class NegativeIndexException extends RuntimeException {

    private int index;

    public NegativeIndexException() {
        super();
    }

    public NegativeIndexException(String message) {
        super(message);
    }

    public NegativeIndexException(int index, String message) {
        super(message);
        this.index = index;
    }

    @Override
    public String toString() {
        return "[NegativeIndexException]: " + this.getMessage() + "\nIndex: " + this.index;
    }
}
