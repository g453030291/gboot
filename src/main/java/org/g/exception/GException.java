package org.g.exception;

/**
 * 封装g boot中的异常
 * @author g
 * @date 2021/1/13 2:12 下午
 */
public class GException extends RuntimeException {
	public GException() {
		super();
	}

	public GException(String message) {
		super(message);
	}

	public GException(String message, Throwable cause) {
		super(message, cause);
	}

	public GException(Throwable cause) {
		super(cause);
	}

	protected GException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
