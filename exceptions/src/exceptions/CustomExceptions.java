package exceptions;

public class CustomExceptions extends Exception {

	private String errorMessage;
	private String errorCode;
	
	public CustomExceptions(String errorMessage, String errorCode) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	@Override
	public String toString() {
		return "CustomExceptions [errorMessage=" + errorMessage + ", errorCode=" + errorCode + "]";
	}
	
	
	
}
