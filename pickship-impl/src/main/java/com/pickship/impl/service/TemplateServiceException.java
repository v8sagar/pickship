
package com.pickship.impl.service;

/**
 * @author v8sagar
 */
public class TemplateServiceException
extends Exception {
	public TemplateServiceException(String message) {
		super(message);
	}

	public TemplateServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public TemplateServiceException(Throwable cause) {
		super(cause);
	}
}
