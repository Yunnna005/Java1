package oopRepeat2022;

public class InvalidPointOnScaleException extends Throwable {
    private String message;

    public InvalidPointOnScaleException(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
