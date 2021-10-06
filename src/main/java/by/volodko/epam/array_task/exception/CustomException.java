package by.volodko.epam.array_task.exception;

import java.io.FileNotFoundException;

public class CustomException extends Exception {

    public CustomException(String message, Exception e) {
        super(message);
    }

    public CustomException(String message) {
        super(message);
    }
    public CustomException(Exception e){
        super(e);
    }

    public CustomException() {
    }
}
