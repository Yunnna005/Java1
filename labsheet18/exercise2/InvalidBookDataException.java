package labsheet18.exercise2;

//InvalidBookDataException.java
/*A user-defined exception class which inherits from Exception*/

public class InvalidBookDataException extends Exception{

    public InvalidBookDataException() {
        super("Invalid book data");
    }

    public InvalidBookDataException(String message) {
        super(message);
    }
}
