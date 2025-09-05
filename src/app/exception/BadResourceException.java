package app.exception;

// when a link to a resource is not proper URI
public class BadResourceException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadResourceException(Exception e) {
        super(e);
    } 
}
