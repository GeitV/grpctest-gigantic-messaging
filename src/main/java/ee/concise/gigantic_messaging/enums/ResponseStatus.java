package ee.concise.gigantic_messaging.enums;

public enum ResponseStatus {
	SUCCESS_OK(0),
	ERROR_INTERNAL(1),
	ERROR_INVALID_REQUEST(2);


	private final int value;

	ResponseStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
