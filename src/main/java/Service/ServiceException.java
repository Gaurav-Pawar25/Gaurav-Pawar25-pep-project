package Service;

/*
   ServiceException is a custom exception used within the service layer.
   It is used to wrap and re-throw exceptions that allow for more specific error
   handling and message passing.
 */
public class ServiceException extends RuntimeException {


    public ServiceException(String message) {
        super(message);
    }


    public ServiceException(Throwable cause) {
        super(cause);
    }


    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}