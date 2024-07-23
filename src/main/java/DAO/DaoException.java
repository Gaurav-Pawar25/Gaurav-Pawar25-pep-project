package DAO;

/*
   DaoException is a custom unchecked exception class that encapsulates and
   handles exceptions that may occur within the DAO layer.
   Extending RuntimeException allows DaoException to be an unchecked exception,
   which does not have to be declared in method signatures
  or explicitly caught in the code.
 */
public class DaoException extends RuntimeException {

    private static final long serialVersionUID = 1L;


    public DaoException(String message) {
        super(message);
    }


    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}