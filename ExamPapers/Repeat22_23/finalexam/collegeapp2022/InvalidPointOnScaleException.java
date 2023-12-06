package Repeat22_23.finalexam.collegeapp2022;

public class InvalidPointOnScaleException {
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
