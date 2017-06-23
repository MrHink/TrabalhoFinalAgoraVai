package Dados;

public class LeilaoDAOException extends Exception {

    /**
     * Creates a new instance of
     * <code>CadastroDAOException</code> without detail message.
     */
    public LeilaoDAOException() {
    }

    /**
     * Constructs an instance of
     * <code>CadastroDAOException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public LeilaoDAOException(String msg) {
        super(msg);
    }

    public LeilaoDAOException(String message, Throwable cause) {
        super(message, cause);
    }
    
    
}
